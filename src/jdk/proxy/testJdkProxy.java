package jdk.proxy;

public class testJdkProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IdkProxyExample Jdk = new IdkProxyExample();
		HelloWorld proxy = (HelloWorld) IdkProxyExample.bind(new HelloWorldImpl(), "jdk.proxy.MyInterceptor");
		HelloWorld proxy1 = (HelloWorld) IdkProxyExample.bind(proxy, "jdk.proxy.Interceptor1");
		HelloWorld proxy2 = (HelloWorld) IdkProxyExample.bind(proxy1, "jdk.proxy.Interceptor2");
		HelloWorld proxy3 = (HelloWorld) IdkProxyExample.bind(proxy2, "jdk.proxy.Interceptor3");
		proxy3.sayHelloWorld();
	}

}
