package io.argoproj.events.client.examples;

import io.argoproj.events.models.eventsource.*;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class EventSourceExample {
    
    public static void main(String[] args) throws Exception {
        
        GenericKubernetesApi<EventSource, EventSourceList> eventSourceApi = new GenericKubernetesApi<>(
            EventSource.class,
            EventSourceList.class,
            "argoproj.io",
            "v1alpha1",
            "eventsources",
            ClientBuilder.defaultClient());
        
        // Create
        Map<String, CalendarEventSource> calendarSource = new HashMap<String, CalendarEventSource>();
        calendarSource.put("example", new CalendarEventSource().interval("30s"));
        eventSourceApi.create(
            new EventSource().metadata(new V1ObjectMeta().namespace("argo-events").name("test-eventsource"))
            .kind("EventSource")
            .apiVersion("argoproj.io/v1alpha1")
            .spec(new EventSourceSpec().calendar(calendarSource))
        );

        // List
        KubernetesApiResponse<EventSourceList> listRep = eventSourceApi.list("argo-events");
        EventSourceList esList = listRep.getObject();
        for (EventSource item : esList.getItems()) {
            System.out.println(item.getMetadata().getName());
        }

        // Get
        KubernetesApiResponse<EventSource> esRep = eventSourceApi.get("argo-events", "test-eventsource");
        EventSource es = esRep.getObject();
        System.out.println(es.getSpec());

        // Delete
        eventSourceApi.delete("argo-events", "test-eventsource");
    }
}
