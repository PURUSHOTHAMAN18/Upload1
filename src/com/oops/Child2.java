package com.oops;

public class Child2 extends Child_1 {
	@Override
	public void furnitures() {
		super.furnitures();
	}

	private void currencies() {
		System.out.println("Chess");

	}

	private void currency() {
		System.out.println("Ludo");
	}

	public static void main(String[] args) {
		Child2 a = new Child2();
	a.sports();
	a.furnitures();
	a.furniture();
	a.board_games();
	a.currencies();
	a.currency();
		
	}

}
