package com.java.practice;
//{68,89,34,20,45} set in descending order
public class Decending {

	static int arraylist[]={68,89,34,20,45};
	static 	int temp=0;
	
	public static void descendingOrder()
	{
		for(int i=0; i<arraylist.length; i++)
		{
			for(int j=i+1; j<arraylist.length; j++)
			{
				if(arraylist[i]<arraylist[j])
				{
					temp=arraylist[i];
					arraylist[i]=arraylist[j];
					arraylist[j]=temp;
							
				}
			}
			System.err.println(arraylist[i]);
		}
	}
	public static void main(String[] args) {
	Decending.descendingOrder();

	}

}
