package com.INTERVIEW;

public class VOWELS {
	public static void main(String[] args) {
		
	
	
	String s = "AeIoU aEiOu";
	int count=0;

	for(int i =0;i<=s.length()-1;i++){
	char ch=s.charAt(i);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
	ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
		count++;
	System.out.print(ch+" ");
	
	}
	}
	System.out.println("\n"+count);
	}				
}
