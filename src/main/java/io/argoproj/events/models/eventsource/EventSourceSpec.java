/*
 * Argo Events
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.5.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.events.models.eventsource;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.events.models.eventsource.AMQPEventSource;
import io.argoproj.events.models.eventsource.AzureEventsHubEventSource;
import io.argoproj.events.models.eventsource.BitbucketServerEventSource;
import io.argoproj.events.models.eventsource.CalendarEventSource;
import io.argoproj.events.models.eventsource.EmitterEventSource;
import io.argoproj.events.models.eventsource.FileEventSource;
import io.argoproj.events.models.eventsource.GenericEventSource;
import io.argoproj.events.models.eventsource.GithubEventSource;
import io.argoproj.events.models.eventsource.GitlabEventSource;
import io.argoproj.events.models.eventsource.HDFSEventSource;
import io.argoproj.events.models.eventsource.KafkaEventSource;
import io.argoproj.events.models.eventsource.MQTTEventSource;
import io.argoproj.events.models.eventsource.NATSEventsSource;
import io.argoproj.events.models.eventsource.NSQEventSource;
import io.argoproj.events.models.eventsource.PubSubEventSource;
import io.argoproj.events.models.eventsource.PulsarEventSource;
import io.argoproj.events.models.eventsource.RedisEventSource;
import io.argoproj.events.models.eventsource.ResourceEventSource;
import io.argoproj.events.models.eventsource.SNSEventSource;
import io.argoproj.events.models.eventsource.SQSEventSource;
import io.argoproj.events.models.eventsource.Service;
import io.argoproj.events.models.eventsource.SlackEventSource;
import io.argoproj.events.models.eventsource.StorageGridEventSource;
import io.argoproj.events.models.eventsource.StripeEventSource;
import io.argoproj.events.models.eventsource.Template;
import io.argoproj.events.models.eventsource.WebhookContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * EventSourceSpec refers to specification of event-source resource
 */
@ApiModel(description = "EventSourceSpec refers to specification of event-source resource")

public class EventSourceSpec {
  public static final String SERIALIZED_NAME_GITLAB = "gitlab";
  @SerializedName(SERIALIZED_NAME_GITLAB)
  private Map<String, GitlabEventSource> gitlab = null;

  public static final String SERIALIZED_NAME_MINIO = "minio";
  @SerializedName(SERIALIZED_NAME_MINIO)
  private Map<String, io.argoproj.events.models.common.S3Artifact> minio = null;

  public static final String SERIALIZED_NAME_KAFKA = "kafka";
  @SerializedName(SERIALIZED_NAME_KAFKA)
  private Map<String, KafkaEventSource> kafka = null;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private Map<String, FileEventSource> file = null;

  public static final String SERIALIZED_NAME_NSQ = "nsq";
  @SerializedName(SERIALIZED_NAME_NSQ)
  private Map<String, NSQEventSource> nsq = null;

  public static final String SERIALIZED_NAME_PULSAR = "pulsar";
  @SerializedName(SERIALIZED_NAME_PULSAR)
  private Map<String, PulsarEventSource> pulsar = null;

  public static final String SERIALIZED_NAME_CALENDAR = "calendar";
  @SerializedName(SERIALIZED_NAME_CALENDAR)
  private Map<String, CalendarEventSource> calendar = null;

  public static final String SERIALIZED_NAME_HDFS = "hdfs";
  @SerializedName(SERIALIZED_NAME_HDFS)
  private Map<String, HDFSEventSource> hdfs = null;

  public static final String SERIALIZED_NAME_AMQP = "amqp";
  @SerializedName(SERIALIZED_NAME_AMQP)
  private Map<String, AMQPEventSource> amqp = null;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private Service service;

  public static final String SERIALIZED_NAME_GENERIC = "generic";
  @SerializedName(SERIALIZED_NAME_GENERIC)
  private Map<String, GenericEventSource> generic = null;

  public static final String SERIALIZED_NAME_REDIS = "redis";
  @SerializedName(SERIALIZED_NAME_REDIS)
  private Map<String, RedisEventSource> redis = null;

  public static final String SERIALIZED_NAME_MQTT = "mqtt";
  @SerializedName(SERIALIZED_NAME_MQTT)
  private Map<String, MQTTEventSource> mqtt = null;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private Template template;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_SQS = "sqs";
  @SerializedName(SERIALIZED_NAME_SQS)
  private Map<String, SQSEventSource> sqs = null;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private Map<String, WebhookContext> webhook = null;

  public static final String SERIALIZED_NAME_AZURE_EVENTS_HUB = "azureEventsHub";
  @SerializedName(SERIALIZED_NAME_AZURE_EVENTS_HUB)
  private Map<String, AzureEventsHubEventSource> azureEventsHub = null;

  public static final String SERIALIZED_NAME_SNS = "sns";
  @SerializedName(SERIALIZED_NAME_SNS)
  private Map<String, SNSEventSource> sns = null;

  public static final String SERIALIZED_NAME_EMITTER = "emitter";
  @SerializedName(SERIALIZED_NAME_EMITTER)
  private Map<String, EmitterEventSource> emitter = null;

  public static final String SERIALIZED_NAME_PUB_SUB = "pubSub";
  @SerializedName(SERIALIZED_NAME_PUB_SUB)
  private Map<String, PubSubEventSource> pubSub = null;

  public static final String SERIALIZED_NAME_GITHUB = "github";
  @SerializedName(SERIALIZED_NAME_GITHUB)
  private Map<String, GithubEventSource> github = null;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private Map<String, ResourceEventSource> resource = null;

  public static final String SERIALIZED_NAME_SLACK = "slack";
  @SerializedName(SERIALIZED_NAME_SLACK)
  private Map<String, SlackEventSource> slack = null;

  public static final String SERIALIZED_NAME_EVENT_BUS_NAME = "eventBusName";
  @SerializedName(SERIALIZED_NAME_EVENT_BUS_NAME)
  private String eventBusName;

  public static final String SERIALIZED_NAME_NATS = "nats";
  @SerializedName(SERIALIZED_NAME_NATS)
  private Map<String, NATSEventsSource> nats = null;

  public static final String SERIALIZED_NAME_STORAGE_GRID = "storageGrid";
  @SerializedName(SERIALIZED_NAME_STORAGE_GRID)
  private Map<String, StorageGridEventSource> storageGrid = null;

  public static final String SERIALIZED_NAME_BITBUCKETSERVER = "bitbucketserver";
  @SerializedName(SERIALIZED_NAME_BITBUCKETSERVER)
  private Map<String, BitbucketServerEventSource> bitbucketserver = null;

  public static final String SERIALIZED_NAME_STRIPE = "stripe";
  @SerializedName(SERIALIZED_NAME_STRIPE)
  private Map<String, StripeEventSource> stripe = null;


  public EventSourceSpec gitlab(Map<String, GitlabEventSource> gitlab) {
    
    this.gitlab = gitlab;
    return this;
  }

  public EventSourceSpec putGitlabItem(String key, GitlabEventSource gitlabItem) {
    if (this.gitlab == null) {
      this.gitlab = new HashMap<String, GitlabEventSource>();
    }
    this.gitlab.put(key, gitlabItem);
    return this;
  }

   /**
   * Gitlab event sources
   * @return gitlab
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gitlab event sources")

  public Map<String, GitlabEventSource> getGitlab() {
    return gitlab;
  }


  public void setGitlab(Map<String, GitlabEventSource> gitlab) {
    this.gitlab = gitlab;
  }


  public EventSourceSpec minio(Map<String, io.argoproj.events.models.common.S3Artifact> minio) {
    
    this.minio = minio;
    return this;
  }

  public EventSourceSpec putMinioItem(String key, io.argoproj.events.models.common.S3Artifact minioItem) {
    if (this.minio == null) {
      this.minio = new HashMap<String, io.argoproj.events.models.common.S3Artifact>();
    }
    this.minio.put(key, minioItem);
    return this;
  }

   /**
   * Minio event sources
   * @return minio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minio event sources")

  public Map<String, io.argoproj.events.models.common.S3Artifact> getMinio() {
    return minio;
  }


  public void setMinio(Map<String, io.argoproj.events.models.common.S3Artifact> minio) {
    this.minio = minio;
  }


  public EventSourceSpec kafka(Map<String, KafkaEventSource> kafka) {
    
    this.kafka = kafka;
    return this;
  }

  public EventSourceSpec putKafkaItem(String key, KafkaEventSource kafkaItem) {
    if (this.kafka == null) {
      this.kafka = new HashMap<String, KafkaEventSource>();
    }
    this.kafka.put(key, kafkaItem);
    return this;
  }

   /**
   * Kafka event sources
   * @return kafka
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kafka event sources")

  public Map<String, KafkaEventSource> getKafka() {
    return kafka;
  }


  public void setKafka(Map<String, KafkaEventSource> kafka) {
    this.kafka = kafka;
  }


  public EventSourceSpec file(Map<String, FileEventSource> file) {
    
    this.file = file;
    return this;
  }

  public EventSourceSpec putFileItem(String key, FileEventSource fileItem) {
    if (this.file == null) {
      this.file = new HashMap<String, FileEventSource>();
    }
    this.file.put(key, fileItem);
    return this;
  }

   /**
   * File event sources
   * @return file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File event sources")

  public Map<String, FileEventSource> getFile() {
    return file;
  }


  public void setFile(Map<String, FileEventSource> file) {
    this.file = file;
  }


  public EventSourceSpec nsq(Map<String, NSQEventSource> nsq) {
    
    this.nsq = nsq;
    return this;
  }

  public EventSourceSpec putNsqItem(String key, NSQEventSource nsqItem) {
    if (this.nsq == null) {
      this.nsq = new HashMap<String, NSQEventSource>();
    }
    this.nsq.put(key, nsqItem);
    return this;
  }

   /**
   * NSQ event source
   * @return nsq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NSQ event source")

  public Map<String, NSQEventSource> getNsq() {
    return nsq;
  }


  public void setNsq(Map<String, NSQEventSource> nsq) {
    this.nsq = nsq;
  }


  public EventSourceSpec pulsar(Map<String, PulsarEventSource> pulsar) {
    
    this.pulsar = pulsar;
    return this;
  }

  public EventSourceSpec putPulsarItem(String key, PulsarEventSource pulsarItem) {
    if (this.pulsar == null) {
      this.pulsar = new HashMap<String, PulsarEventSource>();
    }
    this.pulsar.put(key, pulsarItem);
    return this;
  }

   /**
   * Pulsar event source
   * @return pulsar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pulsar event source")

  public Map<String, PulsarEventSource> getPulsar() {
    return pulsar;
  }


  public void setPulsar(Map<String, PulsarEventSource> pulsar) {
    this.pulsar = pulsar;
  }


  public EventSourceSpec calendar(Map<String, CalendarEventSource> calendar) {
    
    this.calendar = calendar;
    return this;
  }

  public EventSourceSpec putCalendarItem(String key, CalendarEventSource calendarItem) {
    if (this.calendar == null) {
      this.calendar = new HashMap<String, CalendarEventSource>();
    }
    this.calendar.put(key, calendarItem);
    return this;
  }

   /**
   * Calendar event sources
   * @return calendar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Calendar event sources")

  public Map<String, CalendarEventSource> getCalendar() {
    return calendar;
  }


  public void setCalendar(Map<String, CalendarEventSource> calendar) {
    this.calendar = calendar;
  }


  public EventSourceSpec hdfs(Map<String, HDFSEventSource> hdfs) {
    
    this.hdfs = hdfs;
    return this;
  }

  public EventSourceSpec putHdfsItem(String key, HDFSEventSource hdfsItem) {
    if (this.hdfs == null) {
      this.hdfs = new HashMap<String, HDFSEventSource>();
    }
    this.hdfs.put(key, hdfsItem);
    return this;
  }

   /**
   * HDFS event sources
   * @return hdfs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HDFS event sources")

  public Map<String, HDFSEventSource> getHdfs() {
    return hdfs;
  }


  public void setHdfs(Map<String, HDFSEventSource> hdfs) {
    this.hdfs = hdfs;
  }


  public EventSourceSpec amqp(Map<String, AMQPEventSource> amqp) {
    
    this.amqp = amqp;
    return this;
  }

  public EventSourceSpec putAmqpItem(String key, AMQPEventSource amqpItem) {
    if (this.amqp == null) {
      this.amqp = new HashMap<String, AMQPEventSource>();
    }
    this.amqp.put(key, amqpItem);
    return this;
  }

   /**
   * AMQP event sources
   * @return amqp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AMQP event sources")

  public Map<String, AMQPEventSource> getAmqp() {
    return amqp;
  }


  public void setAmqp(Map<String, AMQPEventSource> amqp) {
    this.amqp = amqp;
  }


  public EventSourceSpec service(Service service) {
    
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Service getService() {
    return service;
  }


  public void setService(Service service) {
    this.service = service;
  }


  public EventSourceSpec generic(Map<String, GenericEventSource> generic) {
    
    this.generic = generic;
    return this;
  }

  public EventSourceSpec putGenericItem(String key, GenericEventSource genericItem) {
    if (this.generic == null) {
      this.generic = new HashMap<String, GenericEventSource>();
    }
    this.generic.put(key, genericItem);
    return this;
  }

   /**
   * Generic event source
   * @return generic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Generic event source")

  public Map<String, GenericEventSource> getGeneric() {
    return generic;
  }


  public void setGeneric(Map<String, GenericEventSource> generic) {
    this.generic = generic;
  }


  public EventSourceSpec redis(Map<String, RedisEventSource> redis) {
    
    this.redis = redis;
    return this;
  }

  public EventSourceSpec putRedisItem(String key, RedisEventSource redisItem) {
    if (this.redis == null) {
      this.redis = new HashMap<String, RedisEventSource>();
    }
    this.redis.put(key, redisItem);
    return this;
  }

   /**
   * Redis event source
   * @return redis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Redis event source")

  public Map<String, RedisEventSource> getRedis() {
    return redis;
  }


  public void setRedis(Map<String, RedisEventSource> redis) {
    this.redis = redis;
  }


  public EventSourceSpec mqtt(Map<String, MQTTEventSource> mqtt) {
    
    this.mqtt = mqtt;
    return this;
  }

  public EventSourceSpec putMqttItem(String key, MQTTEventSource mqttItem) {
    if (this.mqtt == null) {
      this.mqtt = new HashMap<String, MQTTEventSource>();
    }
    this.mqtt.put(key, mqttItem);
    return this;
  }

   /**
   * MQTT event sources
   * @return mqtt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MQTT event sources")

  public Map<String, MQTTEventSource> getMqtt() {
    return mqtt;
  }


  public void setMqtt(Map<String, MQTTEventSource> mqtt) {
    this.mqtt = mqtt;
  }


  public EventSourceSpec template(Template template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Template getTemplate() {
    return template;
  }


  public void setTemplate(Template template) {
    this.template = template;
  }


  public EventSourceSpec replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Replicas is the event source deployment replicas
   * @return replicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Replicas is the event source deployment replicas")

  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public EventSourceSpec sqs(Map<String, SQSEventSource> sqs) {
    
    this.sqs = sqs;
    return this;
  }

  public EventSourceSpec putSqsItem(String key, SQSEventSource sqsItem) {
    if (this.sqs == null) {
      this.sqs = new HashMap<String, SQSEventSource>();
    }
    this.sqs.put(key, sqsItem);
    return this;
  }

   /**
   * SQS event sources
   * @return sqs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SQS event sources")

  public Map<String, SQSEventSource> getSqs() {
    return sqs;
  }


  public void setSqs(Map<String, SQSEventSource> sqs) {
    this.sqs = sqs;
  }


  public EventSourceSpec webhook(Map<String, WebhookContext> webhook) {
    
    this.webhook = webhook;
    return this;
  }

  public EventSourceSpec putWebhookItem(String key, WebhookContext webhookItem) {
    if (this.webhook == null) {
      this.webhook = new HashMap<String, WebhookContext>();
    }
    this.webhook.put(key, webhookItem);
    return this;
  }

   /**
   * Webhook event sources
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Webhook event sources")

  public Map<String, WebhookContext> getWebhook() {
    return webhook;
  }


  public void setWebhook(Map<String, WebhookContext> webhook) {
    this.webhook = webhook;
  }


  public EventSourceSpec azureEventsHub(Map<String, AzureEventsHubEventSource> azureEventsHub) {
    
    this.azureEventsHub = azureEventsHub;
    return this;
  }

  public EventSourceSpec putAzureEventsHubItem(String key, AzureEventsHubEventSource azureEventsHubItem) {
    if (this.azureEventsHub == null) {
      this.azureEventsHub = new HashMap<String, AzureEventsHubEventSource>();
    }
    this.azureEventsHub.put(key, azureEventsHubItem);
    return this;
  }

   /**
   * AzureEventsHub event sources
   * @return azureEventsHub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AzureEventsHub event sources")

  public Map<String, AzureEventsHubEventSource> getAzureEventsHub() {
    return azureEventsHub;
  }


  public void setAzureEventsHub(Map<String, AzureEventsHubEventSource> azureEventsHub) {
    this.azureEventsHub = azureEventsHub;
  }


  public EventSourceSpec sns(Map<String, SNSEventSource> sns) {
    
    this.sns = sns;
    return this;
  }

  public EventSourceSpec putSnsItem(String key, SNSEventSource snsItem) {
    if (this.sns == null) {
      this.sns = new HashMap<String, SNSEventSource>();
    }
    this.sns.put(key, snsItem);
    return this;
  }

   /**
   * SNS event sources
   * @return sns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SNS event sources")

  public Map<String, SNSEventSource> getSns() {
    return sns;
  }


  public void setSns(Map<String, SNSEventSource> sns) {
    this.sns = sns;
  }


  public EventSourceSpec emitter(Map<String, EmitterEventSource> emitter) {
    
    this.emitter = emitter;
    return this;
  }

  public EventSourceSpec putEmitterItem(String key, EmitterEventSource emitterItem) {
    if (this.emitter == null) {
      this.emitter = new HashMap<String, EmitterEventSource>();
    }
    this.emitter.put(key, emitterItem);
    return this;
  }

   /**
   * Emitter event source
   * @return emitter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Emitter event source")

  public Map<String, EmitterEventSource> getEmitter() {
    return emitter;
  }


  public void setEmitter(Map<String, EmitterEventSource> emitter) {
    this.emitter = emitter;
  }


  public EventSourceSpec pubSub(Map<String, PubSubEventSource> pubSub) {
    
    this.pubSub = pubSub;
    return this;
  }

  public EventSourceSpec putPubSubItem(String key, PubSubEventSource pubSubItem) {
    if (this.pubSub == null) {
      this.pubSub = new HashMap<String, PubSubEventSource>();
    }
    this.pubSub.put(key, pubSubItem);
    return this;
  }

   /**
   * PubSub event sources
   * @return pubSub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PubSub event sources")

  public Map<String, PubSubEventSource> getPubSub() {
    return pubSub;
  }


  public void setPubSub(Map<String, PubSubEventSource> pubSub) {
    this.pubSub = pubSub;
  }


  public EventSourceSpec github(Map<String, GithubEventSource> github) {
    
    this.github = github;
    return this;
  }

  public EventSourceSpec putGithubItem(String key, GithubEventSource githubItem) {
    if (this.github == null) {
      this.github = new HashMap<String, GithubEventSource>();
    }
    this.github.put(key, githubItem);
    return this;
  }

   /**
   * Github event sources
   * @return github
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Github event sources")

  public Map<String, GithubEventSource> getGithub() {
    return github;
  }


  public void setGithub(Map<String, GithubEventSource> github) {
    this.github = github;
  }


  public EventSourceSpec resource(Map<String, ResourceEventSource> resource) {
    
    this.resource = resource;
    return this;
  }

  public EventSourceSpec putResourceItem(String key, ResourceEventSource resourceItem) {
    if (this.resource == null) {
      this.resource = new HashMap<String, ResourceEventSource>();
    }
    this.resource.put(key, resourceItem);
    return this;
  }

   /**
   * Resource event sources
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resource event sources")

  public Map<String, ResourceEventSource> getResource() {
    return resource;
  }


  public void setResource(Map<String, ResourceEventSource> resource) {
    this.resource = resource;
  }


  public EventSourceSpec slack(Map<String, SlackEventSource> slack) {
    
    this.slack = slack;
    return this;
  }

  public EventSourceSpec putSlackItem(String key, SlackEventSource slackItem) {
    if (this.slack == null) {
      this.slack = new HashMap<String, SlackEventSource>();
    }
    this.slack.put(key, slackItem);
    return this;
  }

   /**
   * Slack event sources
   * @return slack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Slack event sources")

  public Map<String, SlackEventSource> getSlack() {
    return slack;
  }


  public void setSlack(Map<String, SlackEventSource> slack) {
    this.slack = slack;
  }


  public EventSourceSpec eventBusName(String eventBusName) {
    
    this.eventBusName = eventBusName;
    return this;
  }

   /**
   * EventBusName references to a EventBus name. By default the value is \&quot;default\&quot;
   * @return eventBusName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EventBusName references to a EventBus name. By default the value is \"default\"")

  public String getEventBusName() {
    return eventBusName;
  }


  public void setEventBusName(String eventBusName) {
    this.eventBusName = eventBusName;
  }


  public EventSourceSpec nats(Map<String, NATSEventsSource> nats) {
    
    this.nats = nats;
    return this;
  }

  public EventSourceSpec putNatsItem(String key, NATSEventsSource natsItem) {
    if (this.nats == null) {
      this.nats = new HashMap<String, NATSEventsSource>();
    }
    this.nats.put(key, natsItem);
    return this;
  }

   /**
   * NATS event sources
   * @return nats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NATS event sources")

  public Map<String, NATSEventsSource> getNats() {
    return nats;
  }


  public void setNats(Map<String, NATSEventsSource> nats) {
    this.nats = nats;
  }


  public EventSourceSpec storageGrid(Map<String, StorageGridEventSource> storageGrid) {
    
    this.storageGrid = storageGrid;
    return this;
  }

  public EventSourceSpec putStorageGridItem(String key, StorageGridEventSource storageGridItem) {
    if (this.storageGrid == null) {
      this.storageGrid = new HashMap<String, StorageGridEventSource>();
    }
    this.storageGrid.put(key, storageGridItem);
    return this;
  }

   /**
   * StorageGrid event sources
   * @return storageGrid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "StorageGrid event sources")

  public Map<String, StorageGridEventSource> getStorageGrid() {
    return storageGrid;
  }


  public void setStorageGrid(Map<String, StorageGridEventSource> storageGrid) {
    this.storageGrid = storageGrid;
  }


  public EventSourceSpec bitbucketserver(Map<String, BitbucketServerEventSource> bitbucketserver) {
    
    this.bitbucketserver = bitbucketserver;
    return this;
  }

  public EventSourceSpec putBitbucketserverItem(String key, BitbucketServerEventSource bitbucketserverItem) {
    if (this.bitbucketserver == null) {
      this.bitbucketserver = new HashMap<String, BitbucketServerEventSource>();
    }
    this.bitbucketserver.put(key, bitbucketserverItem);
    return this;
  }

   /**
   * Bitbucket Server event sources
   * @return bitbucketserver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bitbucket Server event sources")

  public Map<String, BitbucketServerEventSource> getBitbucketserver() {
    return bitbucketserver;
  }


  public void setBitbucketserver(Map<String, BitbucketServerEventSource> bitbucketserver) {
    this.bitbucketserver = bitbucketserver;
  }


  public EventSourceSpec stripe(Map<String, StripeEventSource> stripe) {
    
    this.stripe = stripe;
    return this;
  }

  public EventSourceSpec putStripeItem(String key, StripeEventSource stripeItem) {
    if (this.stripe == null) {
      this.stripe = new HashMap<String, StripeEventSource>();
    }
    this.stripe.put(key, stripeItem);
    return this;
  }

   /**
   * Stripe event sources
   * @return stripe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Stripe event sources")

  public Map<String, StripeEventSource> getStripe() {
    return stripe;
  }


  public void setStripe(Map<String, StripeEventSource> stripe) {
    this.stripe = stripe;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSourceSpec eventSourceSpec = (EventSourceSpec) o;
    return Objects.equals(this.gitlab, eventSourceSpec.gitlab) &&
        Objects.equals(this.minio, eventSourceSpec.minio) &&
        Objects.equals(this.kafka, eventSourceSpec.kafka) &&
        Objects.equals(this.file, eventSourceSpec.file) &&
        Objects.equals(this.nsq, eventSourceSpec.nsq) &&
        Objects.equals(this.pulsar, eventSourceSpec.pulsar) &&
        Objects.equals(this.calendar, eventSourceSpec.calendar) &&
        Objects.equals(this.hdfs, eventSourceSpec.hdfs) &&
        Objects.equals(this.amqp, eventSourceSpec.amqp) &&
        Objects.equals(this.service, eventSourceSpec.service) &&
        Objects.equals(this.generic, eventSourceSpec.generic) &&
        Objects.equals(this.redis, eventSourceSpec.redis) &&
        Objects.equals(this.mqtt, eventSourceSpec.mqtt) &&
        Objects.equals(this.template, eventSourceSpec.template) &&
        Objects.equals(this.replicas, eventSourceSpec.replicas) &&
        Objects.equals(this.sqs, eventSourceSpec.sqs) &&
        Objects.equals(this.webhook, eventSourceSpec.webhook) &&
        Objects.equals(this.azureEventsHub, eventSourceSpec.azureEventsHub) &&
        Objects.equals(this.sns, eventSourceSpec.sns) &&
        Objects.equals(this.emitter, eventSourceSpec.emitter) &&
        Objects.equals(this.pubSub, eventSourceSpec.pubSub) &&
        Objects.equals(this.github, eventSourceSpec.github) &&
        Objects.equals(this.resource, eventSourceSpec.resource) &&
        Objects.equals(this.slack, eventSourceSpec.slack) &&
        Objects.equals(this.eventBusName, eventSourceSpec.eventBusName) &&
        Objects.equals(this.nats, eventSourceSpec.nats) &&
        Objects.equals(this.storageGrid, eventSourceSpec.storageGrid) &&
        Objects.equals(this.bitbucketserver, eventSourceSpec.bitbucketserver) &&
        Objects.equals(this.stripe, eventSourceSpec.stripe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gitlab, minio, kafka, file, nsq, pulsar, calendar, hdfs, amqp, service, generic, redis, mqtt, template, replicas, sqs, webhook, azureEventsHub, sns, emitter, pubSub, github, resource, slack, eventBusName, nats, storageGrid, bitbucketserver, stripe);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSourceSpec {\n");
    sb.append("    gitlab: ").append(toIndentedString(gitlab)).append("\n");
    sb.append("    minio: ").append(toIndentedString(minio)).append("\n");
    sb.append("    kafka: ").append(toIndentedString(kafka)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    nsq: ").append(toIndentedString(nsq)).append("\n");
    sb.append("    pulsar: ").append(toIndentedString(pulsar)).append("\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
    sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
    sb.append("    amqp: ").append(toIndentedString(amqp)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    generic: ").append(toIndentedString(generic)).append("\n");
    sb.append("    redis: ").append(toIndentedString(redis)).append("\n");
    sb.append("    mqtt: ").append(toIndentedString(mqtt)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    sqs: ").append(toIndentedString(sqs)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    azureEventsHub: ").append(toIndentedString(azureEventsHub)).append("\n");
    sb.append("    sns: ").append(toIndentedString(sns)).append("\n");
    sb.append("    emitter: ").append(toIndentedString(emitter)).append("\n");
    sb.append("    pubSub: ").append(toIndentedString(pubSub)).append("\n");
    sb.append("    github: ").append(toIndentedString(github)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    slack: ").append(toIndentedString(slack)).append("\n");
    sb.append("    eventBusName: ").append(toIndentedString(eventBusName)).append("\n");
    sb.append("    nats: ").append(toIndentedString(nats)).append("\n");
    sb.append("    storageGrid: ").append(toIndentedString(storageGrid)).append("\n");
    sb.append("    bitbucketserver: ").append(toIndentedString(bitbucketserver)).append("\n");
    sb.append("    stripe: ").append(toIndentedString(stripe)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

