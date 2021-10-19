package cglib.proxy;

public class TestCglibProxy {
	public static void main(String[] args) {
		CglibProxyExample cglibProxyExample =new CglibProxyExample();
		Hello obj = (Hello) cglibProxyExample.getProxy(Hello.class);
		obj.sayHello("张三");
	}
}
