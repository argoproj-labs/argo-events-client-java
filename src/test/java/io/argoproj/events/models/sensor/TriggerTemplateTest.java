/*
 * Argo Events
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.events.models.sensor;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.events.models.sensor.AWSLambdaTrigger;
import io.argoproj.events.models.sensor.ArgoWorkflowTrigger;
import io.argoproj.events.models.sensor.CustomTrigger;
import io.argoproj.events.models.sensor.HTTPTrigger;
import io.argoproj.events.models.sensor.KafkaTrigger;
import io.argoproj.events.models.sensor.NATSTrigger;
import io.argoproj.events.models.sensor.OpenWhiskTrigger;
import io.argoproj.events.models.sensor.SlackTrigger;
import io.argoproj.events.models.sensor.StandardK8STrigger;
import io.argoproj.events.models.sensor.TriggerSwitch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for TriggerTemplate
 */
public class TriggerTemplateTest {
    private final TriggerTemplate model = new TriggerTemplate();

    /**
     * Model tests for TriggerTemplate
     */
    @Test
    public void testTriggerTemplate() {
        // TODO: test TriggerTemplate
    }

    /**
     * Test the property 'kafka'
     */
    @Test
    public void kafkaTest() {
        // TODO: test kafka
    }

    /**
     * Test the property 'http'
     */
    @Test
    public void httpTest() {
        // TODO: test http
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'nats'
     */
    @Test
    public void natsTest() {
        // TODO: test nats
    }

    /**
     * Test the property 'custom'
     */
    @Test
    public void customTest() {
        // TODO: test custom
    }

    /**
     * Test the property 'awsLambda'
     */
    @Test
    public void awsLambdaTest() {
        // TODO: test awsLambda
    }

    /**
     * Test the property 'openWhisk'
     */
    @Test
    public void openWhiskTest() {
        // TODO: test openWhisk
    }

    /**
     * Test the property '_switch'
     */
    @Test
    public void _switchTest() {
        // TODO: test _switch
    }

    /**
     * Test the property 'argoWorkflow'
     */
    @Test
    public void argoWorkflowTest() {
        // TODO: test argoWorkflow
    }

    /**
     * Test the property 'k8s'
     */
    @Test
    public void k8sTest() {
        // TODO: test k8s
    }

    /**
     * Test the property 'conditions'
     */
    @Test
    public void conditionsTest() {
        // TODO: test conditions
    }

    /**
     * Test the property 'slack'
     */
    @Test
    public void slackTest() {
        // TODO: test slack
    }

}