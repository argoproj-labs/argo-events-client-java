package io.argoproj.events.client.examples;

import io.argoproj.events.models.sensor.*;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class SensorExample {
    
    public static void main(String[] args) throws Exception {
        
        GenericKubernetesApi<Sensor, SensorList> sensorApi = new GenericKubernetesApi<>(
            Sensor.class,
            SensorList.class,
            "argoproj.io",
            "v1alpha1",
            "sensors",
            ClientBuilder.defaultClient());
        
        // Create
        EventDependency dep = new EventDependency().name("test-dep").eventSourceName("eventsource-name").eventName("example");
        Trigger trigger = new Trigger().template(new TriggerTemplate().http(new HTTPTrigger().url("https://github.com").method("GET")));
        sensorApi.create(
            new Sensor().metadata(new V1ObjectMeta().namespace("argo-events").name("test-sensor"))
            .kind("Sensor")
            .apiVersion("argoproj.io/v1alpha1")
            .spec(new SensorSpec().addDependenciesItem(dep).addTriggersItem(trigger))
        );

        // List
        KubernetesApiResponse<SensorList> listRep = sensorApi.list("argo-events");
        SensorList sensorList = listRep.getObject();
        for (Sensor item : sensorList.getItems()) {
            System.out.println(item.getMetadata().getName());
        }

        // Get
        KubernetesApiResponse<Sensor> sensorRep = sensorApi.get("argo-events", "test-sensor");
        Sensor s = sensorRep.getObject();
        System.out.println(s.getSpec());

        // Delete
        sensorApi.delete("argo-events", "test-sensor");
    }
}
