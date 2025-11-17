package com.hsgd.public_mqtt_client_core.configuration;

import org.eclipse.paho.mqttv5.client.IMqttToken;
import org.eclipse.paho.mqttv5.client.MqttCallback;
import org.eclipse.paho.mqttv5.client.MqttClient;
import org.eclipse.paho.mqttv5.client.MqttConnectionOptions;
import org.eclipse.paho.mqttv5.client.MqttDisconnectResponse;
import org.eclipse.paho.mqttv5.common.MqttException;
import org.eclipse.paho.mqttv5.common.MqttMessage;
import org.eclipse.paho.mqttv5.common.packet.MqttProperties;
//------------------------------------------------------------------------------------------------//
//
//------------------------------------------------------------------------------------------------//
public class Client implements MqttCallback 
{
    private MqttClient mqttClient;
    private String brokerUrl;
    private String clientId;
    private String username;
    private String password;
    private String topic;
    private int qos;
    private boolean isConnected;
    private MqttConnectionOptions mqttConnectOptions;
    //--------------------------------------------------------------------------------------------//
    // Constructor
    //--------------------------------------------------------------------------------------------//
    public Client(String brokerUrl, String clientId, String username, String password, String topic, int qos) {
        this.brokerUrl = brokerUrl;
        this.clientId = clientId;
        this.username = username;
        this.password = password;
        this.topic = topic;
        this.qos = qos;
    }

    //--------------------------------------------------------------------------------------------//
    // Connect
    //--------------------------------------------------------------------------------------------//
    public void connect() throws MqttException {
        mqttClient = new MqttClient(brokerUrl, clientId);
        mqttClient.connect(new MqttConnectionOptions());
    }

    //--------------------------------------------------------------------------------------------//
    // Message Arrived
    //--------------------------------------------------------------------------------------------//
    @Override
    public void messageArrived(String topic, MqttMessage message) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'messageArrived'");
    }

    //--------------------------------------------------------------------------------------------//
    // Delivery Complete
    //--------------------------------------------------------------------------------------------//
    @Override
    public void deliveryComplete(IMqttToken token) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deliveryComplete'");
    }

    //--------------------------------------------------------------------------------------------//
    // Connect Complete
    //--------------------------------------------------------------------------------------------//
    @Override
    public void connectComplete(boolean reconnect, String serverURI) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'connectComplete'");
    }

    //--------------------------------------------------------------------------------------------//
    // Disconnected
    //--------------------------------------------------------------------------------------------//
    @Override
    public void disconnected(MqttDisconnectResponse response) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'disconnected'");
    }

    //--------------------------------------------------------------------------------------------//
    // MQTT Error Occurred
    //--------------------------------------------------------------------------------------------//
    @Override
    public void mqttErrorOccurred(MqttException cause) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mqttErrorOccurred'");
    }
    
    //--------------------------------------------------------------------------------------------//
    // Auth Packet Arrived
    //--------------------------------------------------------------------------------------------//
    @Override
    public void authPacketArrived(int reasonCode, MqttProperties properties) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'authPacketArrived'");
    }
}
