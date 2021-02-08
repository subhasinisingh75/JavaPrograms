package com.java.practice;

//{5,2,7,3,4,1} set this in ascending order
public class Ascending {

	static int arr[]= {50,2,70,3,49,1};
	static int temp=0;
	
	public static int[] ascendingOrder()
	{
	for(int i=0; i<arr.length; i++)
	{
		for(int j=i+1; j<arr.length; j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.println(arr[i]);
	}
	return arr;
	}
	
	public static void main(String[] args) {
		int result[]=Ascending.ascendingOrder();
		
	}
}
