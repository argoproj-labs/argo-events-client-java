package io.argoproj.events.client.examples;

import io.argoproj.events.models.eventbus.*;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import java.io.IOException;

public class EventBusExample {
    
    public static void main(String[] args) throws Exception {
        
        GenericKubernetesApi<EventBus, EventBusList> eventBusApi = new GenericKubernetesApi<>(
            EventBus.class,
            EventBusList.class,
            "argoproj.io",
            "v1alpha1",
            "eventbus",
            ClientBuilder.defaultClient());

        // Create
        eventBusApi.create(
            new EventBus().metadata(new V1ObjectMeta().namespace("argo-events").name("test-eb"))
            .kind("EventBus")
            .apiVersion("argoproj.io/v1alpha1")
            .spec(new EventBusSpec().nats(new NATSBus()._native(new NativeStrategy())))
        );

        // List
        KubernetesApiResponse<EventBusList> listRep = eventBusApi.list("argo-events");
        EventBusList ebList = listRep.getObject();
        for (EventBus item : ebList.getItems()) {
            System.out.println(item.getMetadata().getName());
        }

        // Get
        KubernetesApiResponse<EventBus> ebRep = eventBusApi.get("argo-events", "default");
        EventBus eb = ebRep.getObject();
        System.out.println(eb.getSpec());
        
        // Delete
        eventBusApi.delete("argo-events", "test-eb");
    }
}
