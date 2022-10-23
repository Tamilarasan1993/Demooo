package com.sampletest;

public class FIBONACCI {
	
	
	public static void Fibonacci() {
		System.out.println("FIBONACCI SERIES::::");
		int a=0,b=1,c,n=10;

		System.out.print(a+" "+b);

		for(int i =0;i<=n;i++){
			c= a+b;
			System.out.print(" "+c);

			a=b;
			b=c;
		}


	}

public static void Factorial() {
	System.out.println("FACTORIAL");

	int a =3;

	int fact =1;
	for(int i=1;i<=a;i++){

		fact =fact*i;
	}

	System.out.println(fact);
	
	int count=0;
	for(int i=1;i<=fact;i++) {
		
		if(fact%i==0) {
			count++;
		}	
	}
	if(count==2) {
		System.out.println("PRIME NUMBER");
	}
	else {
		System.out.println("NOT PRIME NUMBER");
	}
	
	int prime;
	for(int i=0;i<=fact;i++) {
		prime =0;
	for(int j=2;j<=i/2;j++) {
		if(i%j==0) {
			
		
		prime++;
		break;
	}
	}
	if(prime==0) {
		System.out.println(i);
	}
	}
	}


public static void Vowels() {
	
	String s = "Sulaiman Tamil logesh asik siva";
	String low = s.toLowerCase();
		int a=0,e=0,i=0,o=0,u=0;
	
	for(int j=0;j<=low.length()-1;j++) {
		char ch = low.charAt(j);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {

			if(ch=='a')
			a++;
			else if(ch=='e')
			e++;
			else if(ch=='i')
			i++;
			else if(ch=='o')
			o++;
			else if(ch=='u')
			u++;
			}
		}	
	System.out.println("a ="+a+"\ne ="+e+"\ni ="+i+"\no ="+o+"\nu ="+u);	

}
	



	public static void main(String[] args) {
	
Vowels();		
						
		
}

}
