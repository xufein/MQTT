package client;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

public class client {
	
	public static String s;
	
	public static void setS(){
		s = "test";
	}
	
	public static void main(String[] args) throws MqttException {
		String client = "tcp://localhost:1883";
	    MqttClient mqttClient;
		mqttClient = new MqttClient(client, MqttClient.generateClientId());	    
		System.out.println("Start to subscribe: " + client);
		mqttClient.setCallback( new SimpleMqttCallBack() );
		mqttClient.connect();
		mqttClient.subscribe("TRS");
		setS();
	}

	
}
