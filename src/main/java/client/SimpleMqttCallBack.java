package client;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class SimpleMqttCallBack extends client implements MqttCallback {
	
	public void connectionLost(Throwable throwable) {
		System.out.println("Connection lost");
	}

	public void messageArrived(String topic, MqttMessage mqttMessage) throws Exception {
		String message = new String(mqttMessage.getPayload());
		System.out.println("Message received: "+ message);
		if (message.equalsIgnoreCase("test")) {
			System.out.println("match");
		}
	}

	public void deliveryComplete(IMqttDeliveryToken token) {
	}

}
