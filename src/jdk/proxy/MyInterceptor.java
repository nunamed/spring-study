package jdk.proxy;

import java.lang.reflect.Method;

public class MyInterceptor implements Interceptor {

	@Override
	public Boolean before(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		System.out.println("反射方法前逻辑");
		return true;
	}

	@Override
	public void around(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		System.out.println("取代了被代理对象的方法");

	}

	@Override
	public void after(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		System.out.println("反射方法后逻辑");

	}

}
