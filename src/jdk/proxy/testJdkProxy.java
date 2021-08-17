package jdk.proxy;

public class testJdkProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IdkProxyExample Jdk = new IdkProxyExample();
		HelloWorld proxy = (HelloWorld) IdkProxyExample.bind(new HelloWorldImpl(), "jdk.proxy.MyInterceptor");
		proxy.sayHelloWorld();
	}

}
