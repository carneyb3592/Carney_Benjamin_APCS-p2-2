//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner reader = new Scanner(System.in);
		out.println("Enter X1:");
		int x1 = reader.nextInt();
		out.println("Enter Y1:");
		int y1 = reader.nextInt();
		out.println("Enter X2:");
		int x2 = reader.nextInt();
		out.println("Enter Y2:");
		int y2 = reader.nextInt();
		Distance d = new Distance(x1, y1, x2, y2);
		d.calcDistance();
		d.getDistance();
		d.print();
		
		
		
		
	}
}