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
// Client Class 
// - Only for MqttClient 
// - This class is used to connect to the MQTT broker and publish messages or subscribe to topics
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
    //
    //--------------------------------------------------------------------------------------------//
    public Client() { }
    //--------------------------------------------------------------------------------------------//
    // 
    //--------------------------------------------------------------------------------------------//
    public void build(String brokerUrl, String clientId, String username, String password
                    , MqttConnectionOptions mqttConnectOptions) 
    {
        this.brokerUrl = brokerUrl;
        this.clientId = clientId;
        this.username = username;
        this.password = password;
        // setTopic(topic);
        // setQos(qos);
        this.mqttConnectOptions = mqttConnectOptions;
    }
    //--------------------------------------------------------------------------------------------//
    // Setters for Topic and QoS / Other Options (Not Changed.)
    //--------------------------------------------------------------------------------------------//
    public void setTopic(String topic) {this.topic = topic; }
    
    public void setQos(int qos) {this.qos = qos; }
    //--------------------------------------------------------------------------------------------//
    // Connect
    //--------------------------------------------------------------------------------------------//
    public void connect() throws MqttException 
    {
        mqttClient = new MqttClient(brokerUrl, clientId);
        mqttClient.connect(new MqttConnectionOptions());
    }
    //--------------------------------------------------------------------------------------------//
    // Disconnect
    //--------------------------------------------------------------------------------------------//
    public void disconnect() throws MqttException 
    {
        mqttClient.disconnect();
    }
    //--------------------------------------------------------------------------------------------//
    // Publish
    //--------------------------------------------------------------------------------------------//
    public void publish(String message) throws MqttException 
    {
        mqttClient.publish(topic, message.getBytes(), qos, false);
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
