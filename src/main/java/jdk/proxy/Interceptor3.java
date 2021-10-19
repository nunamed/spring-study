package jdk.proxy;

import java.lang.reflect.Method;

public class Interceptor3 implements Interceptor {

	@Override
	public Boolean before(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		System.out.println("【拦截器3】的before方法");
		return true;
	}

	@Override
	public void around(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void after(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		System.out.println("【拦截器3】的after方法");
	}

}
