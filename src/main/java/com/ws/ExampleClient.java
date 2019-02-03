//package com.ws;
//
//import java.net.MalformedURLException;
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.util.HashMap;
//import java.util.Map;
//import java.net.URL;
//
//import org.java_websocket.client.WebSocketClient;
//import org.java_websocket.drafts.Draft;
//import org.java_websocket.drafts.Draft_6455;
//import org.java_websocket.framing.Framedata;
//import org.java_websocket.handshake.ServerHandshake;
//
///** This example demonstrates how to create a websocket connection to a server. Only the most important callbacks are overloaded. */
//public class ExampleClient extends WebSocketClient {
//
//    public ExampleClient( URI serverUri , Draft draft ) {
//        super( serverUri, draft );
//    }
//
//    public ExampleClient( URI serverURI ) {
//        super( serverURI );
//    }
//
//    public ExampleClient( URI serverUri, Map<String, String> httpHeaders ) {
//        super(serverUri, httpHeaders);
//    }
//
//    @Override
//    public void onOpen( ServerHandshake handshakedata ) {
////        send("Hello, it is me. Mario :)");
//        System.out.println( "opened connection" );
//        // if you plan to refuse connection based on ip or httpfields overload: onWebsocketHandshakeReceivedAsClient
//    }
//
//    @Override
//    public void onMessage( String message ) {
//        System.out.println( "received: " + message );
//    }
//
//    @Override
//    public void onClose( int code, String reason, boolean remote ) {
//        // The codecodes are documented in class org.java_websocket.framing.CloseFrame
//        System.out.println( "Connection closed by " + ( remote ? "remote peer" : "us" ) + " Code: " + code + " Reason: " + reason );
//    }
//
//    @Override
//    public void onError( Exception ex ) {
//        ex.printStackTrace();
//        // if the error is fatal then onClose will be called additionally
//    }
//
//    public static void main( String[] args ) throws URISyntaxException {
//        Map<String, String> parmas = new HashMap<String, String>() {
//            {
//                put("Cookie", "sap-usercontext=sap-client=001; MYSAPSSO2=AjQxMDMBABhUAEUAUwBUAEkARAAwADEAIAAgACAAIAACAAYwADAAMQADABBOAFAATAAgACAAIAAgACAABAAYMgAwADEAOAAxADIAMgA0ADAAMwA1ADEABQAEAAAACAYAAlgACQACRQD%2fAPswgfgGCSqGSIb3DQEHAqCB6jCB5wIBATELMAkGBSsOAwIaBQAwCwYJKoZIhvcNAQcBMYHHMIHEAgEBMBowDjEMMAoGA1UEAxMDTlBMAggKIBcCGSAmATAJBgUrDgMCGgUAoF0wGAYJKoZIhvcNAQkDMQsGCSqGSIb3DQEHATAcBgkqhkiG9w0BCQUxDxcNMTgxMjI0MDM1MTU0WjAjBgkqhkiG9w0BCQQxFgQUqLR2U4eXmt77FwjQhN52c%21k7RTAwCQYHKoZIzjgEAwQuMCwCFCgFrHONJpq594UkxNRpcV%2fQZ2hPAhQJmBxGPDen4f%2fToqwGRlUrbYRhLA%3d%3d; SAP_SESSIONID_NPL_001=c1L7HZ3Y3DZbicHneTmL_UCkCpEHLxHpoFAADTqjtuk%3d");
//            }
//        };
//        ExampleClient c = new ExampleClient( new URI( "wss://sap752sp01.southeastasia.cloudapp.azure.com:44300/sap(cz1TSUQlM2FBTk9OJTNhdmhjYWxucGxjaV9OUExfMDAlM2FfSkRDd3A3ZjhwSFh6SElPQVhjZ1ZJNWp4ak5lcXoyNlVUX25SMDh2LUFUVA==)/bc/apc/sap/ping" ), parmas); // more about drafts here: http://github.com/TooTallNate/Java-WebSocket/wiki/Drafts
//        c.connect();
//    }
//
//}
