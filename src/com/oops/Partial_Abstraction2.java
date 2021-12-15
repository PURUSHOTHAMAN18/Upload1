package com.oops;

public class Partial_Abstraction2 extends Partial_abstraction1 {

	public static void main(String[] args) {
		Partial_Abstraction2 p= new Partial_Abstraction2();
			p.customer_id();
			p.tranfer_amount();
			p.transaction_password();
			System.out.println("confidential password2000");
	}

	@Override
	public void transaction_password() {
		// TODO Auto-generated method stub
		
	}
}

















// (*) POINTING CURRENT CLASS EXTENDING ANOTHER CLASS SELECT "add unimplemented methods"
// (*) NOW PROVIDE THE IMPLEMENTATION PART FOR THE ABSTRACT METHOD.