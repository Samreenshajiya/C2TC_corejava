package edu.atria.java.finalkeyword;

public class FinalVariable {
	
	//final int x;// final instance variable must be initialized
	final int x = 100;
	
	//declare a static blank final variable.
	final static int y;
	
	// declare & initialize static final variable.
	final static int z = 10;
	
	//instance method 
	void change() {
		//x = 30; //final variables can't be reassigned
		//y = 200; // final static variable can't be reassigned
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", y= " +y+ "]";
	}
	
	//Declare a static block to initialize the final static variable.
	static {
		y = 20;
		//z = 100; // the final variable can;t be reassigned.
		System.out.println("Value of y:" + y);
	}

}
