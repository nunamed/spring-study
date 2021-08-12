package jdk.proxy;

public class testJdkProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdkProxyExample Jdk = new IdkProxyExample();
		HelloWorld proxy = (HelloWorld) Jdk.bind(new HelloWorldImpl());
		proxy.sayHelloWorld();
	}

}
