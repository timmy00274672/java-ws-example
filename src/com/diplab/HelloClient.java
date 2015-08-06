package com.diplab;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloClient {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:9004/webservice/sayHello");
		QName qname = new QName("http://diplab.com/", "HelloServiceImplService");
		Service service = Service.create(url, qname);

		HelloService hello = service.getPort(HelloService.class);
		System.out.println(hello.sayHello("JavaHash.com"));

	}

}
