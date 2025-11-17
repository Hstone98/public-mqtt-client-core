package com.hsgd.public_mqtt_client_core;

import org.eclipse.paho.mqttv5.client.MqttConnectionOptions;
import org.eclipse.paho.mqttv5.common.MqttException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.hsgd.public_mqtt_client_core.configuration.Client;

@SpringBootTest
class PublicMqttClientCoreApplicationTests 
{
    //--------------------------------------------------------------------------------------------//
    // Context Loads
    //--------------------------------------------------------------------------------------------//
	@Test
	void contextLoads() 
	{
		// TODO: Add tests here
	}
    //--------------------------------------------------------------------------------------------//
    // Test Client
    //--------------------------------------------------------------------------------------------//
    @Test
    void testClient() 
    {
        // TODO: Add tests here
        Client client = new Client();
		MqttConnectionOptions options = new MqttConnectionOptions();
        
        // Automatic Reconnect
        options.setAutomaticReconnect(true);
        
        // Clean Start
        options.setCleanStart(true);
        
        // Connection Timeout
        options.setConnectionTimeout(30);
        
        // Keep Alive Interval
        options.setKeepAliveInterval(60);
        
        // Max Reconnect Delay
        options.setMaxReconnectDelay(10000);

        client.build("tcp://localhost:1883", "testClient", "test", "test", options);

		try
		{
			client.connect();
			client.setTopic("testTopic");
			client.setQos(0);

			client.publish("testMessage");
			
		}
		catch(MqttException e)
		{
			e.printStackTrace();
		}
        
    }

}
