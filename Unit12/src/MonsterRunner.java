//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		//ask for name and size
		out.print("Enter 1st Monster's name: ");
		String name = keyboard.next();
		out.print("Enter 1st Monster's size: ");
		int size = keyboard.nextInt();
		//instantiate monster one
		Monster mon1 = new Skeleton(size,name);
		//ask for name and size
		out.print("Enter 2nd Monster's name: ");
		name = keyboard.next();
		out.print("Enter 2nd Monster's size: ");
		size = keyboard.nextInt();
		//instantiate monster two
		Monster mon2 = new Skeleton(size,name);
		
		if(mon1.isBigger(mon2)) {
			out.println("Monster one is bigger than Monster two.");
		}
		if(mon1.isSmaller(mon2)) {
			out.println("Monster one is smaller than Monster two.");
		}
		if(mon1.namesTheSame(mon2)) {
			out.println("Monster one has the same name as Monster two.");
		}
		if(!mon1.namesTheSame(mon2)) {
			out.println("Monster one has a different name as Monster two.");
		}
	}
}