package com.example.rpcdemo.client;

import com.example.rpcdemo.server.service.SayHelloWorldService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8888/rpc/helloWorld");

        QName serviceQName = new QName("http://impl.service.server.rpcdemo.example.com/", "SayHelloWorldServiceImplService");
        QName portQName = new QName("http://impl.service.server.rpcdemo.example.com/", "SayHelloWorldServiceImplPort");

        Service service = Service.create(url, serviceQName);
        SayHelloWorldService proxy = service.getPort(portQName, SayHelloWorldService.class);

        String result = proxy.sayHelloWorldToName("Jarvan");
        System.out.println(result);
    }
}
