package com.oops;

// SAME METHOD NAME, BUT DIFFERENT ARGUMENTS CAN BE PASSED

public class Polymorphism {
	private void gold(char g) {
		System.out.println(g);

	}

	private void gold(double cost) {
		System.out.println(cost);

	}

	private void gold(String color) {
		System.out.println(color);

	}

	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		p.gold("The symol of gold is :Ag");
		p.gold(4200d);
		p.gold("The color of gold is :yellow");

	}

}
