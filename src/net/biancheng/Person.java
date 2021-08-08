package net.biancheng;

public class Person {
	private Man man;
	public Person() {
		System.out.println("在Person的无参构造函数中");
	}
	public void man() {
		man.show();
	}
	public Man getMan() {
		return man;
	}
	public void setMan(Man man) {
		this.man = man;
	}
	
}
