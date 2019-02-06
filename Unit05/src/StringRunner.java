//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner reader = new Scanner(System.in);
		out.println("Enter a word:");
		String str = reader.next();
		StringOddOrEven s = new StringOddOrEven(str);
		s.setString(str);
		s.isEven();
		s.print();
	}
}