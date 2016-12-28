package com.tarena.outman;

public class WelcomeAction {
	private String name;
	public String execute() {
		System.out.println("WelcomeAc tion.execute()...");
		System.out.println("name: " + name); //用于测试
		if ("monster".equalsIgnoreCase(name)) { 
			return "fail";
		}
		return "success"; 
	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
}
