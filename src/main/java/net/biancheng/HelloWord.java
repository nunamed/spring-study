package net.biancheng;

public class HelloWord {
	private String message;

	public void getMessage() {
		System.out.println("message:" + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void init() {
		System.out.println("初始化");
	}
	public void destroy() {
		System.out.println("即将被销毁");
	}

}
