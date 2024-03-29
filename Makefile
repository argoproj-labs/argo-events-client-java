VERSION := v1.6.3

GENERATOR_VERSION := v4.3.1


.PHONY: build
build:
	rm -Rf ./docs ./src/test ./src/main/java/io/argoproj/events/models pom.xml
	curl -L -o swagger.json https://raw.githubusercontent.com/argoproj/argo-events/$(VERSION)/api/openapi-spec/swagger.json
	mkdir -p ./dist
	cat swagger.json | ./hack/swaggerfilter.py io.argoproj.common | sed 's/io.argoproj.common.//' | sed 's/io.k8s.api.core.//' | sed 's/io.k8s.apimachinery.pkg.apis.meta.//' > dist/common.swagger.json
	cat swagger.json | ./hack/swaggerfilter.py io.argoproj.eventbus.v1alpha1 | sed 's/io.argoproj.common.//' | sed 's/io.argoproj.eventbus.v1alpha1.//' | sed 's/io.k8s.api.core.//' | sed 's/io.k8s.apimachinery.pkg.apis.meta.//' | sed 's/io.k8s.apimachinery.pkg.api.resource./resource./'  > dist/eventbus.swagger.json
	cat swagger.json | ./hack/swaggerfilter.py io.argoproj.eventsource.v1alpha1 | sed 's/io.argoproj.common.//' | sed 's/io.argoproj.eventsource.v1alpha1.//' | sed 's/io.k8s.api.core.//' | sed 's/io.k8s.apimachinery.pkg.apis.meta.//' > dist/eventsource.swagger.json
	cat swagger.json | ./hack/swaggerfilter.py io.argoproj.sensor.v1alpha1 | sed 's/io.argoproj.common.//' | sed 's/io.argoproj.sensor.v1alpha1.//' | sed 's/io.k8s.api.core.//' | sed 's/io.k8s.apimachinery.pkg.apis.meta.//' > dist/sensor.swagger.json

	# common
	docker run --rm -v `pwd -P`:/base openapitools/openapi-generator-cli:$(GENERATOR_VERSION) \
		generate \
 		-i /base/dist/common.swagger.json \
		-g java \
		-o /base \
		-p hideGenerationTimestamp=true \
		-p dateLibrary=joda \
		--global-property models,supportingFiles=pom.xml \
		--api-package io.argoproj.events.apis \
		--invoker-package io.argoproj.events \
		--model-package io.argoproj.events.models.common \
		--group-id io.argoproj.events \
		--artifact-id argo-events-client-java \
		--artifact-version $(VERSION) \
		--import-mappings V1Time=org.joda.time.DateTime \
		--type-mappings V1Time=org.joda.time.DateTime \
		--import-mappings V1ConfigMapKeySelector=io.kubernetes.client.openapi.models.V1ConfigMapKeySelector \
		--import-mappings V1SecretKeySelector=io.kubernetes.client.openapi.models.V1SecretKeySelector \
		--generate-alias-as-model

	
	# event bus
	docker run --rm -v `pwd -P`:/base openapitools/openapi-generator-cli:$(GENERATOR_VERSION) \
		generate \
		-i /base/dist/eventbus.swagger.json \
		-g java \
		-o /base \
		-p hideGenerationTimestamp=true \
		-p dateLibrary=joda \
		--global-property models,supportingFiles=pom.xml \
		--api-package io.argoproj.events.apis \
		--invoker-package io.argoproj.events \
		--model-package io.argoproj.events.models.eventbus \
		--group-id io.argoproj.events \
		--artifact-id argo-events-client-java \
		--artifact-version $(VERSION) \
		--import-mappings V1Time=org.joda.time.DateTime \
		--type-mappings V1Time=org.joda.time.DateTime \
		--import-mappings V1Affinity=io.kubernetes.client.openapi.models.V1Affinity \
		--import-mappings V1ConfigMapKeySelector=io.kubernetes.client.openapi.models.V1ConfigMapKeySelector \
		--import-mappings V1Container=io.kubernetes.client.openapi.models.V1Container \
		--import-mappings V1ContainerPort=io.kubernetes.client.openapi.models.V1ContainerPort \
		--import-mappings V1EnvFromSource=io.kubernetes.client.openapi.models.V1EnvFromSource \
		--import-mappings V1EnvVar=io.kubernetes.client.openapi.models.V1EnvVar \
		--import-mappings V1HostAlias=io.kubernetes.client.openapi.models.V1HostAlias \
		--import-mappings V1Lifecycle=io.kubernetes.client.openapi.models.V1Lifecycle \
		--import-mappings V1ListMeta=io.kubernetes.client.openapi.models.V1ListMeta \
		--import-mappings V1LocalObjectReference=io.kubernetes.client.openapi.models.V1LocalObjectReference \
		--import-mappings V1ObjectMeta=io.kubernetes.client.openapi.models.V1ObjectMeta \
		--import-mappings V1ObjectReference=io.kubernetes.client.openapi.models.V1ObjectReference \
		--import-mappings V1PersistentVolumeClaim=io.kubernetes.client.openapi.models.V1PersistentVolumeClaim \
		--import-mappings V1PodDisruptionBudgetSpec=io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec \
		--import-mappings V1PodDNSConfig=io.kubernetes.client.openapi.models.V1PodDNSConfig \
		--import-mappings V1PodSecurityContext=io.kubernetes.client.openapi.models.V1PodSecurityContext \
		--import-mappings V1Probe=io.kubernetes.client.openapi.models.V1Probe \
		--import-mappings V1ResourceRequirements=io.kubernetes.client.openapi.models.V1ResourceRequirements \
		--import-mappings V1SecretKeySelector=io.kubernetes.client.openapi.models.V1SecretKeySelector \
		--import-mappings V1SecurityContext=io.kubernetes.client.openapi.models.V1SecurityContext \
		--import-mappings V1Toleration=io.kubernetes.client.openapi.models.V1Toleration \
		--import-mappings V1Volume=io.kubernetes.client.openapi.models.V1Volume \
		--import-mappings V1VolumeDevice=io.kubernetes.client.openapi.models.V1VolumeDevice \
		--import-mappings V1VolumeMount=io.kubernetes.client.openapi.models.V1VolumeMount \
		--import-mappings ResourceQuantity=io.kubernetes.client.custom.Quantity \
		--type-mappings ResourceQuantity=io.kubernetes.client.custom.Quantity \
		--import-mappings Condition=io.argoproj.events.models.common.Condition \
		--import-mappings Metadata=io.argoproj.events.models.common.Metadata \
		--generate-alias-as-model

	# event source
	docker run --rm -v `pwd -P`:/base openapitools/openapi-generator-cli:$(GENERATOR_VERSION) \
		generate \
		-i /base/dist/eventsource.swagger.json \
		-g java \
		-o /base \
		-p hideGenerationTimestamp=true \
		-p dateLibrary=joda \
		--global-property models,supportingFiles=pom.xml \
		--api-package io.argoproj.events.apis \
		--invoker-package io.argoproj.events \
		--model-package io.argoproj.events.models.eventsource \
		--group-id io.argoproj.events \
		--artifact-id argo-events-client-java \
		--artifact-version $(VERSION) \
		--import-mappings V1Time=org.joda.time.DateTime \
		--type-mappings V1Time=org.joda.time.DateTime \
		--import-mappings V1Affinity=io.kubernetes.client.openapi.models.V1Affinity \
		--import-mappings V1ConfigMapKeySelector=io.kubernetes.client.openapi.models.V1ConfigMapKeySelector \
		--import-mappings V1Container=io.kubernetes.client.openapi.models.V1Container \
		--import-mappings V1ContainerPort=io.kubernetes.client.openapi.models.V1ContainerPort \
		--import-mappings V1EnvFromSource=io.kubernetes.client.openapi.models.V1EnvFromSource \
		--import-mappings V1EnvVar=io.kubernetes.client.openapi.models.V1EnvVar \
		--import-mappings V1HostAlias=io.kubernetes.client.openapi.models.V1HostAlias \
		--import-mappings V1Lifecycle=io.kubernetes.client.openapi.models.V1Lifecycle \
		--import-mappings V1ListMeta=io.kubernetes.client.openapi.models.V1ListMeta \
		--import-mappings V1LocalObjectReference=io.kubernetes.client.openapi.models.V1LocalObjectReference \
		--import-mappings V1ObjectMeta=io.kubernetes.client.openapi.models.V1ObjectMeta \
		--import-mappings V1ObjectReference=io.kubernetes.client.openapi.models.V1ObjectReference \
		--import-mappings V1PersistentVolumeClaim=io.kubernetes.client.openapi.models.V1PersistentVolumeClaim \
		--import-mappings V1PodDisruptionBudgetSpec=io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec \
		--import-mappings V1PodDNSConfig=io.kubernetes.client.openapi.models.V1PodDNSConfig \
		--import-mappings V1PodSecurityContext=io.kubernetes.client.openapi.models.V1PodSecurityContext \
		--import-mappings V1Probe=io.kubernetes.client.openapi.models.V1Probe \
		--import-mappings V1ResourceRequirements=io.kubernetes.client.openapi.models.V1ResourceRequirements \
		--import-mappings V1SecretKeySelector=io.kubernetes.client.openapi.models.V1SecretKeySelector \
		--import-mappings V1SecurityContext=io.kubernetes.client.openapi.models.V1SecurityContext \
		--import-mappings V1Toleration=io.kubernetes.client.openapi.models.V1Toleration \
		--import-mappings V1Volume=io.kubernetes.client.openapi.models.V1Volume \
		--import-mappings V1VolumeDevice=io.kubernetes.client.openapi.models.V1VolumeDevice \
		--import-mappings V1VolumeMount=io.kubernetes.client.openapi.models.V1VolumeMount \
		--import-mappings V1ServicePort=io.kubernetes.client.openapi.models.V1ServicePort \
		--import-mappings Condition=io.argoproj.events.models.common.Condition \
		--import-mappings TLSConfig=io.argoproj.events.models.common.TLSConfig \
		--import-mappings Backoff=io.argoproj.events.models.common.Backoff \
		--import-mappings S3Artifact=io.argoproj.events.models.common.S3Artifact \
		--import-mappings Metadata=io.argoproj.events.models.common.Metadata \
		--import-mappings BasicAuth=io.argoproj.events.models.common.BasicAuth \
                --import-mappings SecureHeader=io.argoproj.events.models.common.SecureHeader \
                --import-mappings SASLConfig=io.argoproj.events.models.common.SASLConfig \
		--generate-alias-as-model
	
	# sensor
	docker run --rm -v `pwd -P`:/base openapitools/openapi-generator-cli:$(GENERATOR_VERSION) \
		generate \
		-i /base/dist/sensor.swagger.json \
		-g java \
		-o /base \
		-p hideGenerationTimestamp=true \
		-p dateLibrary=joda \
		--global-property models,supportingFiles=pom.xml \
		--api-package io.argoproj.events.apis \
		--invoker-package io.argoproj.events \
		--model-package io.argoproj.events.models.sensor \
		--group-id io.argoproj.events \
		--artifact-id argo-events-client-java \
		--artifact-version $(VERSION) \
		--import-mappings V1Time=org.joda.time.DateTime \
		--type-mappings V1Time=org.joda.time.DateTime \
		--import-mappings V1Affinity=io.kubernetes.client.openapi.models.V1Affinity \
		--import-mappings V1ConfigMapKeySelector=io.kubernetes.client.openapi.models.V1ConfigMapKeySelector \
		--import-mappings V1Container=io.kubernetes.client.openapi.models.V1Container \
		--import-mappings V1ContainerPort=io.kubernetes.client.openapi.models.V1ContainerPort \
		--import-mappings V1EnvFromSource=io.kubernetes.client.openapi.models.V1EnvFromSource \
		--import-mappings V1EnvVar=io.kubernetes.client.openapi.models.V1EnvVar \
		--import-mappings V1HostAlias=io.kubernetes.client.openapi.models.V1HostAlias \
		--import-mappings V1Lifecycle=io.kubernetes.client.openapi.models.V1Lifecycle \
		--import-mappings V1ListMeta=io.kubernetes.client.openapi.models.V1ListMeta \
		--import-mappings V1LocalObjectReference=io.kubernetes.client.openapi.models.V1LocalObjectReference \
		--import-mappings V1ObjectMeta=io.kubernetes.client.openapi.models.V1ObjectMeta \
		--import-mappings V1ObjectReference=io.kubernetes.client.openapi.models.V1ObjectReference \
		--import-mappings V1PersistentVolumeClaim=io.kubernetes.client.openapi.models.V1PersistentVolumeClaim \
  		--import-mappings V1PodDisruptionBudgetSpec=io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec \
		--import-mappings V1PodDNSConfig=io.kubernetes.client.openapi.models.V1PodDNSConfig \
  		--import-mappings V1PodSecurityContext=io.kubernetes.client.openapi.models.V1PodSecurityContext \
		--import-mappings V1Probe=io.kubernetes.client.openapi.models.V1Probe \
		--import-mappings V1ResourceRequirements=io.kubernetes.client.openapi.models.V1ResourceRequirements \
		--import-mappings V1SecretKeySelector=io.kubernetes.client.openapi.models.V1SecretKeySelector \
		--import-mappings V1SecurityContext=io.kubernetes.client.openapi.models.V1SecurityContext \
		--import-mappings V1Toleration=io.kubernetes.client.openapi.models.V1Toleration \
		--import-mappings V1Volume=io.kubernetes.client.openapi.models.V1Volume \
		--import-mappings V1VolumeDevice=io.kubernetes.client.openapi.models.V1VolumeDevice \
		--import-mappings V1VolumeMount=io.kubernetes.client.openapi.models.V1VolumeMount \
		--import-mappings Condition=io.argoproj.events.models.common.Condition \
		--import-mappings TLSConfig=io.argoproj.events.models.common.TLSConfig \
		--import-mappings Backoff=io.argoproj.events.models.common.Backoff \
		--import-mappings S3Artifact=io.argoproj.events.models.common.S3Artifact \
		--import-mappings Metadata=io.argoproj.events.models.common.Metadata \
		--import-mappings BasicAuth=io.argoproj.events.models.common.BasicAuth \
                --import-mappings SecureHeader=io.argoproj.events.models.common.SecureHeader \
                --import-mappings SASLConfig=io.argoproj.events.models.common.SASLConfig \
		--import-mappings Resource=java.lang.Object \
		--generate-alias-as-model
	
	sed 's/public class EventBus/public class EventBus implements io.kubernetes.client.common.KubernetesObject/g' src/main/java/io/argoproj/events/models/eventbus/EventBus.java > tmp && mv tmp src/main/java/io/argoproj/events/models/eventbus/EventBus.java
	sed 's/public class EventBusList/public class EventBusList implements io.kubernetes.client.common.KubernetesListObject/g' src/main/java/io/argoproj/events/models/eventbus/EventBusList.java > tmp && mv tmp src/main/java/io/argoproj/events/models/eventbus/EventBusList.java
	sed 's/public class EventSource/public class EventSource implements io.kubernetes.client.common.KubernetesObject/g' src/main/java/io/argoproj/events/models/eventsource/EventSource.java > tmp && mv tmp src/main/java/io/argoproj/events/models/eventsource/EventSource.java
	sed 's/public class EventSourceList/public class EventSourceList implements io.kubernetes.client.common.KubernetesListObject/g' src/main/java/io/argoproj/events/models/eventsource/EventSourceList.java > tmp && mv tmp src/main/java/io/argoproj/events/models/eventsource/EventSourceList.java
	sed 's/public class Sensor/public class Sensor implements io.kubernetes.client.common.KubernetesObject/g' src/main/java/io/argoproj/events/models/sensor/Sensor.java > tmp && mv tmp src/main/java/io/argoproj/events/models/sensor/Sensor.java
	sed 's/public class SensorList/public class SensorList implements io.kubernetes.client.common.KubernetesListObject/g' src/main/java/io/argoproj/events/models/sensor/SensorList.java > tmp && mv tmp src/main/java/io/argoproj/events/models/sensor/SensorList.java
	
	sed 's/<dependencies>/<dependencies><dependency><groupId>io.kubernetes<\/groupId><artifactId>client-java<\/artifactId><version>9.0.2<\/version><\/dependency>/g' pom.xml > tmp && mv tmp pom.xml
	docker run -v ~/.m2:/root/.m2 -v `pwd`:/base -w /base maven:3-openjdk-8 \
		mvn install -DskipTests -Dmaven.javadoc.skip

.PHONY: publish
publish: build
	# https://help.github.com/en/packages/using-github-packages-with-your-projects-ecosystem/configuring-apache-maven-for-use-with-github-packages
	docker run -v ~/.m2:/root/.m2 -v `pwd`:/base -w /base maven:3-openjdk-8 \
		mvn -DskipTests -Dmaven.javadoc.skip -DaltDeploymentRepository=github::default::https://maven.pkg.github.com/argoproj-labs/argo-events-client-java deploy

.PHONY: clean
clean:
	rm -Rf dist
