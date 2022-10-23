package com.INTERVIEW;

public class Amstrong {
	public static void main(String[] args) {
		
		int a,b,c,sum=0;

		a=371;
		b=a;
		while(a>0){
		c=a%10;
		sum=sum+(c*c*c);
		a=a/10;
		}
		if(b==sum){
		System.out.println("AMstrong");
		}
		else{
		System.out.println("Not");
		}
		
		
	}

}
