package com.diplab;

import java.net.MalformedURLException;

public class HelloClient {

	public static void main(String[] args) throws MalformedURLException {
		HelloService helloServiceImplPort = new HelloServiceImplService().getHelloServiceImplPort();

		System.out.println(helloServiceImplPort.sayHello("JavaHash.com"));

	}

}
