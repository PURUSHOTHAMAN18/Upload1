package com.oops;

public class Over_Loading {
	private void salary(String  s) {
		System.out.println(s);

	}
private void expense(double e) {
System.out.println(e);
}
	
private void expense(float ex) {
	System.out.println(ex);

}
	private void savings(float saving) {
System.out.println(saving);
	}
	public static void main(String[] args) {
		System.out.println();
	
	Over_Loading o = new Over_Loading();
	o.salary("rs.20000");
	o.expense(8000);
	o.expense(4000);
	o.savings(8000);
	
	
	}
	
}
