package io.argoproj.events.client.examples;

import io.argoproj.events.models.eventbus.EventBus;
import io.argoproj.events.models.eventbus.EventBusList;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import java.io.IOException;

public class EventBusExample {
    
    public static void main(String[] args) throws Exception {
        // ApiClient client = Config.defaultClient();
        // Configuration.setDefaultApiClient(client);

        GenericKubernetesApi<EventBus, EventBusList> eventBusApi = new GenericKubernetesApi<>(
            EventBus.class,
            EventBusList.class,
            "argoproj.io",
            "v1alpha1",
            "eventbus",
            ClientBuilder.defaultClient());

        KubernetesApiResponse<EventBusList> rep = eventBusApi.list();
        EventBusList ebList = rep.getObject();
        for (EventBus item : ebList.getItems()) {
            System.out.println(item.getMetadata().getName());
        }

        // CoreV1Api api = new CoreV1Api();
        // V1PodList list = api.listPodForAllNamespaces(null, null, null, null, null, null, null, null, null);
        // for (V1Pod item : list.getItems()) {
        //      System.out.println(item.getMetadata().getName());
        // }


    }
}
