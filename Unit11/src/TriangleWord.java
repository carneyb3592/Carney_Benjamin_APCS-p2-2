//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		String current = word.substring(0,1);
		int amount = 1;
		for(int i = 1; i <= word.length(); i++) 
		{
			current = word.substring(0, i);
			for(int y = 0; y < amount; y++) {
				System.out.print(current);
				
			}
			System.out.print("\n");
			amount += 1;
		}
		
	}
}