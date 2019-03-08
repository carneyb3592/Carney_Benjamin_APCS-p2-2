//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the toy :: ");
		String game = keyboard.next();
		System.out.print("Enter the count :: ");
		String count  = keyboard.next();
		System.out.println(game + " " + count);
	}
}