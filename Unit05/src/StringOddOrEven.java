//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;
	private int length;
	public StringOddOrEven()
	{
		setString(word);
		isEven();
	}

	public StringOddOrEven(String s)
	{
		setString(s);
		isEven();
	}

	public void setString(String s)
	{
		word = s;
		int result = s.length();
		length = result;
	}

 	public boolean isEven()
 	{
		if (length % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

 	public void print()
 	{
 		if(isEven()) {
 			System.out.println(word + " is even");
 		}
 		else {
 			System.out.println(word + " is odd");
 		}
 		
	}

}