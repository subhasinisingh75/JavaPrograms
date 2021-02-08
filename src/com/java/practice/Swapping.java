package com.java.practice;
// swapping of two numbers with temp variable

public class Swapping {

	int temp;
	
	public void swappingNumbers(int x, int y)
	{	
		System.out.println("--Original value of x & y --");
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	temp=x; //temp=8
	x=y;    //x=4
	y=temp; //y=8
	
	System.out.println("--Swapping value of a & b by using temp variable--");
	System.out.println("x:"+x);
	System.out.println("y:"+y);
	
	}
	
	// swapping of two numbers without temp variable
	public void swappingwithoutTemp(int m, int n)
	{
		System.out.println("--Original value of m & n --");
		System.out.println("m:"+m);
		System.out.println("n:"+n);

		m=m+n; //m=15
		n=m-n; //n=9
		m=m-n; //m=6
	
		System.out.println("--Swapping value of c & d without using temp variable--");
		System.out.println("m:"+m);
		System.out.println("n:"+n);
	}
	
	public static void main(String[] args) {
		Swapping obj= new Swapping();
		obj.swappingNumbers(8,4);
		obj.swappingwithoutTemp(9,6);
	}

}
