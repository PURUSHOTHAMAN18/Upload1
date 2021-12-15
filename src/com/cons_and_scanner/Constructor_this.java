package com.cons_and_scanner;

public class Constructor_this {
	public Constructor_this() {
System.out.println("INDIA IS A DEMOCRATIC COUNTRY");
	}
	public Constructor_this(char x) {
		this("PURUSHOTHAMAN G");
		System.out.println(x);
		
	}
	public Constructor_this(String z) {
		this(60000d);
		System.out.println(z);
	}
	public Constructor_this(short y) {
		this(21);
		System.out.println(y);
	}
	public Constructor_this(double w) {
		this();
		System.out.println(w);
	}
 
	
	
	public static void main(String[] args) {
		Constructor_this q = new Constructor_this('M');
	
	
	}
}








//SHOULD ADD "THIS"---> ALONG WITH THE DESIGNATED DATA TYPE
//THE VALUE FOR "THIS" WILL NOT CONSIST THE CURRENT METHOD TYPE
//THEN ADD CREATE SYNTAX FOR THE LEFT OUT METHOD..
              // SYNTAX --> CLASS REF NAME = NEW CLASS NAME ALONG WITH THE LEFTOUT ARGUMENTS
