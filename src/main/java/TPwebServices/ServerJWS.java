package TPwebServices;

import jakarta.xml.ws.Endpoint;

import javax.print.DocFlavor;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8787/";
        Endpoint.publish(url,new BanqService());
        System.out.println("web service deployed in "+url);
    }
}
