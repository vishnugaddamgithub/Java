package Vishnu;

import java.util.Scanner;

public class VishnuGaddam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter something");
		Scanner input = new Scanner(System.in);
	    int score=input.nextInt();
		input.close();
		//fwhile(score);
		//fdowhile(score);
		// farrays(score);
		//fforloop(score);
		//fstring();
		//MyClass Vish=new MyClass();//Vishnu is object r instance
		//Vish.id=1;
		//Vish.naem="Vishnu";
		////Vish.age=45;
		////System.out.println();
		//cube cube1=new cube();
		//System.out.println(cube1.getcudevolume());
		//cube cube2=new cube(20,20,20);
		//System.out.println(cube2.getcudevolume());
		
		
	}
	public static void fstring()
	{
		String myString = "Vishnu"+"Gaddam";
		int myStringLength = myString.length();
		String myStringLowercase = myString.toLowerCase();
		String myStringUppercase = myString.toUpperCase();
		System.out.println(myStringUppercase+myStringLowercase+myStringLength);
		System.out.println(myString.replace('V', 'g'));
		
	}
	public static void fforloop(int a) {
		char[] chararray=new char[] {'t','y','v'};
		for(int i=0;i<a;i++)
			System.out.println(chararray[i]);
	}
	public static void farrays(int a)
	{
		int[] myintarray= {1,2,3,4,5};
		//int[] myintarray = new int[3];
		//int[] myintarray = new int[]{1,2,3,4,5};
		while(a<myintarray.length) {
			System.out.println(myintarray[a]);
			a++;
	}
	}
	public static void fdowhile(int a)
	{
		do {
			
			System.out.println(a);
			a++;
			
		} while (a<=10);
		
		
	}
	public static void fwhile(int a)
	{
		while(a<=10)
		{
			System.out.println(a);
			a++;
			
		}
	}
	public static void fswitch(int score)
	{
		
		switch(score)
		{
		
		case 90 :
			System.out.println("Very good");
			break;
		case 60 :
			System.out.println("good");
			break;
		case 40 :
			System.out.println("OK");
			break;
		default :
			System.out.println("grades are not efined");
			break;
		
		}
	}

}
