package jdk.proxy;

import java.lang.reflect.Method;

public interface Interceptor {
	Boolean before(Object proxy,Object target,Method method,Object[] args);
	void around(Object proxy,Object target,Method method,Object[] args);
	void after(Object proxy,Object target,Method method,Object[] args);
}
