//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		Scanner reader = new Scanner(System.in);
		System.out.println("Type a number :: ");
		int num = reader.nextInt();
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		System.out.println(num + " is even :: " + NumberVerify.isEven(num));
		System.out.println(num + " is Odd :: " + NumberVerify.isOdd(num));
		for(int i = 0;i<3;i++) {
			num = reader.nextInt();
			System.out.println(num + " is even :: " + NumberVerify.isEven(num));
			System.out.println(num + " is Odd :: " + NumberVerify.isOdd(num));
		}
		//add in more test cases
	}
}