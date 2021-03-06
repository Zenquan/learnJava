package com.zenquan.designpattern;

abstract class Human {
	abstract void eat();
	abstract void sleep();
	abstract void beat();
}
class Man extends Human {
	public void eat() {
		System.out.println("Man can eat");
	}
	public void sleep() {
		System.out.println("Man can sleep");
	}
	public void beat() {
		System.out.println("Man can beat");
	}
}
class Female extends Human {
	public void eat() {
		System.out.println("Female can eat");
	}
	public void sleep() {
		System.out.println("Female can sleep");
	}
	public void beat() {
		System.out.println("Female can beat");
	}
}
public class HumanFactory {
	public static Human createHuman(String gender) {
		Human human = null;
		if(gender.equals("man")) {
			human = new Man();
		}else if (gender.equals("female")) {
			human = new Female();
		}
		return human;
	}
}
