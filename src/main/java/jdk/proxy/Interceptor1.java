package jdk.proxy;

import java.lang.reflect.Method;

public class Interceptor1 implements Interceptor {

	@Override
	public Boolean before(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		System.out.println("【拦截器1】的before方法");
		return true;
	}

	@Override
	public void around(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		System.out.println("【拦截器1】的around方法");
	}

	@Override
	public void after(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		System.out.println("【拦截器1】的after方法");
	}

}
