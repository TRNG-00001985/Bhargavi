package com.ece.hipdemo;

public class Swap 
{
	void meth1(int a ,int b ) {
		a=a^b;
		b=b^a;
		a=a^b;
		System.out.println("values of a , b:" +a+" "+b);	
	}
	public static void main(String[] args) {
		Swap obj = new Swap();
		obj.meth1(100, 111);
	}
}
