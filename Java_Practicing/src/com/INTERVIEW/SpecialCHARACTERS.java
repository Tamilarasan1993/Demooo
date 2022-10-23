package com.INTERVIEW;

public class SpecialCHARACTERS {
	public static void main(String[] args) {
		
		String s = "###  Tamil&&  1993))";
		
		String spl =s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(spl);	
		
	}
}
