package fr.insa.soap;

import javax.xml.ws.Endpoint;
import java.net.MalformedURLException;

public class AnalyserChaineApplication {
    public static String host="localhost";
    public static short port=8089;

    public void demarrerService(){
        String url="http://"+host+":"+port+"/";
        Endpoint.publish(url,new AnalyserChaineWS());
    }

    public static void main(String[] args) throws MalformedURLException {
        new AnalyserChaineApplication().demarrerService();
        System.out.println("Service a démarré.");
    }

}
