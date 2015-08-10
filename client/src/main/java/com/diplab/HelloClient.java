package com.diplab;

public class HelloClient {

	public static void main(String[] args) {
		HelloService helloServiceImplPort = new HelloServiceImplService().getHelloServiceImplPort();

		System.out.println(helloServiceImplPort.sayHello("JavaHash.com"));

	}

}
