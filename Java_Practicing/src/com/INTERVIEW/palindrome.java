package com.INTERVIEW;

public class palindrome {
	public static void main(String[] args) {
		
		String s = "malayalam";
		String rev = "";

		for(int i = s.length()-1;i>=0;i--){
		rev = rev+s.charAt(i);
		}
		System.out.print(rev);
		
		if (rev.equals(s)) {
			System.out.println("\nPalimdrome");
		}
		else {
			System.out.println("\nNot a palindrome");
		}
		
		
		
		
		
		
	}

}
