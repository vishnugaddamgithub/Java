package com.company;
import java.util.Scanner;
public class Student {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1 for palindrome and 2 for permutations:");
		int iDecide=scan.nextInt();
		if(iDecide==1) {
			System.out.print("Enter a number: ");
			int inp=scan.nextInt();
			scan.close();
			//Student Palindrome = new Student(); 
			//permutation.permute(str, 0, n-1);
			//Palindrome.palindrm(inp);
			palindrm(inp);
		}
		else if(iDecide==2){
			//All possible combinations of a string
			System.out.print("Enter text: ");
			String str=scan.next();
			scan.close();
		
			int n = str.length(); 
			//Student permutation = new Student(); 
			//1permutation.Combinations(str, 0, n-1);	
			Combinations(str, 0, n-1);
		}
	
	}
	private static void palindrm(int inp)
	{
		int rev=0,temp=inp;
		 while(inp != 0) {
		     int digit = inp % 10;
		     rev = rev * 10 + digit;
		     inp /= 10;
		 }
		System.out.print("Reversed number: " +rev);
		if(temp==rev) {
		System.out.print("\nNumber is a Palindrome");
		}
		else {
		System.out.print("\nNot a palindrome number");
		}	
	
	}
	private static void Combinations(String str, int l, int r) 
	{ 
	    if (l == r) 
	    {
	    	System.out.print(str+",");
	    }
	         
	    else
	    { 
	        for (int i = l; i <= r; i++) 
	        { 
	            str = swap(str,l,i); 
	            Combinations(str, l+1, r); 
	            str = swap(str,l,i); 
	        } 
	    } 
	} 
	
	public static String swap(String a, int i, int j) 
	{ 
	    char temp; 
	    char[] charArray = a.toCharArray(); 
	    temp = charArray[i] ; 
	    charArray[i] = charArray[j]; 
	    charArray[j] = temp; 
	    return String.valueOf(charArray); 
	} 

}
