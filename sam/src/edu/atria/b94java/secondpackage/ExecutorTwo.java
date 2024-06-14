package edu.atria.b94java.secondpackage;

import edu.atria.b94java.firstpackage.Base;

public class ExecutorTwo extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Base bTwo=new Base();
				//private numbers are not visible outside the first package
				//System.out.println(bTwo.variablePrivate};
				
				//default numbers are not visible outside the first package
				//System.out.println(bTwo.variableDefault);
				
	    ExecutorTwo ex = new ExecutorTwo();
	    System.out.println(ex.variableProtected);
				
		System.out.println(bTwo.variablePublic);
	}

}
