package jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class IdkProxyExample implements InvocationHandler {
	private String interceptorClass =null;
	private Object target=null;
	public IdkProxyExample(Object target,String interceptorClass) {
		this.target=target;
		this.interceptorClass=interceptorClass;
	}

	public static Object bind(Object target,String interceptorClass) {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new IdkProxyExample(target,interceptorClass));
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//没有设置拦截器则直接反射原有方法
		if (interceptorClass==null) {
			return method.invoke(target, args);
		}
		Object result = null;
		//通过反射生成拦截器
		Interceptor interceptor = (Interceptor) Class.forName(interceptorClass).getConstructor().newInstance();
		//调用前置方法
		if(interceptor.before(proxy,target,method,args)) {
			//反射原有对象方法
			result = method.invoke(target, args);
		}else {//返回false执行around方法
			interceptor.around(proxy, target, method, args);
		}
		interceptor.after(proxy,target,method,args);
		return result;
	}

}
