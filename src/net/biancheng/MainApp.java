package net.biancheng;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWord obj = (HelloWord) context.getBean("helloWorld");
		obj.setMessage("message");
		obj.getMessage();
		HelloWord ob = (HelloWord)context.getBean("helloWorld");
		ob.getMessage();
		context.registerShutdownHook();
	}
}
