package com.cons_and_scanner;

public class Constructor {
	public Constructor() {
		System.out.println("INDIA IS A DEMOCRATIC COUNTRY");
	}
	
	public Constructor(char  x) {
		System.out.println(x);
		
	}
	public Constructor(String z ) {
			System.out.println(z);
		}
		public Constructor(short y) {
			System.out.println(y);
	}
		public Constructor(double w) {
		System.out.println(w);
	}
	public static void main(String[] args) throws Throwable {
		
		Constructor o = new Constructor();
		Constructor p = new Constructor("INDIAN ADMINISTRATIVE SERVICE");
		Constructor s = new Constructor("POSTING AS DEPUTY COLLECTOR");
		Constructor q = new Constructor(21);
		Constructor r = new Constructor(60000d);
	
	
	o.finalize();
	p.finalize();
	q.finalize();
	r.finalize();
	s.finalize();
	
	
	
	
	}
	
	
	
	
	
	
	
	}
