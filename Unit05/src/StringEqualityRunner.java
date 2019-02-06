//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Type a word:: ");
		String one = keyboard.next();
		System.out.println("Type a word:: ");
		String two = keyboard.next();
		StringEquality s = new StringEquality(one,two);
		s.setWords(one,two);
		s.checkEquality();
		System.out.println(s.toString());
		
		
	}
}