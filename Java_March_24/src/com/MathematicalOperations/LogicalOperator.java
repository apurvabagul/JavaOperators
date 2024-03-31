package com.MathematicalOperations;

public class LogicalOperator 
{

	public static void main(String[] args)																
	{
		//in And(&&) Operator if one condition is  true and one is false then result always false.
		//in And (&&) operator both condition are true then result is true only.
		// TODO Auto-generated method stub
		int a=20;
		int b=40;
		System.out.println(a > b && a < b);//false
		//a > b &&	a <	b
	    //20 > 40 && 20 < 40
		
		System.out.println(a < b && a < b);//true
		//a < b &&	a <	b
		//20 < 40 && 20 < 40
		
	//Logical or operator
		
	System.out.println(a > b || a < b );
	//20 > 40 || 20 < 40
	
	
System.out.println(a < b || a < b );
//20 > 40 || 20 < 40


System.out.println(a >= b || a <=b );
//20 > 40 || 20 < 40

System.out.println(a > b || a > b );
//20 > 40 || 20 < 40
	
	}

}
