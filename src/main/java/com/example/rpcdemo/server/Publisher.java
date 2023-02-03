package com.example.rpcdemo.server;

import com.example.rpcdemo.server.service.impl.SayHelloWorldServiceImpl;

import javax.xml.ws.Endpoint;

public class Publisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/rpc/helloWorld", new SayHelloWorldServiceImpl());
    }
}
