package com.diplab;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService(endpointInterface = "com.diplab.HelloService")
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return "JAVA-WS " + name;
	}

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9004/webservice/sayHello", new HelloServiceImpl());
	}
}
