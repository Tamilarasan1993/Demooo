package com.INTERVIEW;

public class COuntTheWOrds {
public static void main(String[] args) {
	

	String s ="india is my country";
	String[] s1 = s.split(" ");
		for(int i =0;i<=s1.length-1;i++) {
			System.out.println(s1[i]);
		}
System.out.println(s1.length);


	int count=1;
	for(int i =0;i<=s.length()-1;i++) {
		char ch = s.charAt(i);
		if(ch==' ') {
			count++;
		}
	}
	System.out.println(count);
}
}

