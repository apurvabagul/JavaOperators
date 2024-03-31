package com.MathematicalOperations;

public class TenaryConditional {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a=20;
		int b=40;
		
	boolean bl= (a > b ? true : false);
	boolean bll= (a < b ? true : false);
	System.out.println(bl);
	System.out.println(bll);
	
	int no=6;
	
	String s=(no % 2 == 0 ? "Even":"odd");
	
	System.out.println(s);
				
	String s1=(no % 2 == 1 ? "Even":"odd");
	System.out.println(s1);
	
	int marks = 78;
	String result=(marks <= 40 ?  "pass" : "fail");
	System.out.println(result);
	
	int f2=(10 > 5 ? 10 : 5);
	System.out.println(10);
	
	}

}
