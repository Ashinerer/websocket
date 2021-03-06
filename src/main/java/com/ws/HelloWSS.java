package com.ws;

import com.neovisionaries.ws.client.WebSocket;
import com.neovisionaries.ws.client.WebSocketAdapter;
import com.neovisionaries.ws.client.WebSocketFactory;

import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;

public class HelloWSS {
    public static void main(String[] args) throws Exception {
//        String endpoint = System.getenv("ENDPOINT");
//        String user = System.getenv("USER");
//        String password = System.getenv("PASSWORD");
        String endpoint = "wss://sap752sp01.southeastasia.cloudapp.azure.com:44300/sap(cz1TSUQlM2FBTk9OJTNhdmhjYWxucGxjaV9OUExfMDAlM2FfSkRDd3A3ZjhwSFh6SElPQVhjZ1ZJNWp4ak5lcXoyNlVUX25SMDh2LUFUVA==)/bc/apc/sap/ping";
        String user = "XINYI";
        String password = "xiexinyi1206";

        // Create a custom SSL context.
        SSLContext context = NaiveSSLContext.getInstance("TLS");

        // Set the custom SSL context.
        new WebSocketFactory()
                .setSSLContext(context)
                .setVerifyHostname(false)
                .setSocketFactory(SocketFactory.getDefault())
                .setVerifyHostname(false)
                .createSocket(endpoint)
                .addListener(new WebSocketAdapter() {
                    @Override
                    public void onTextMessage(WebSocket ws, String message) {
                        System.out.println("Received:" + message);
                    }
                })
                .setUserInfo(user, password)
                .connect()
                .sendText("Hello...");
    }
}