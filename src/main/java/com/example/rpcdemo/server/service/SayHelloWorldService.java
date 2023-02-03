package com.example.rpcdemo.server.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SayHelloWorldService {

    @WebMethod
    String sayHelloWorldToName(String name);
}
