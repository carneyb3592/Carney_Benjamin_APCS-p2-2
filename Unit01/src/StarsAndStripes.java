//� A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	 System.out.println("********************");
	   
   }

   public void printTwentyDashes()
   {
	 System.out.println("--------------------");
	   
   }

   public void printTwoBlankLines()
   {
	   for(int x = 0; x <2; x++) {
		   System.out.println("");
	   }
   }
   
   public void printASmallBox()
   {
	   for(int i =0; i <3; i++) {
		   printTwentyDashes();
		   printTwentyStars();
	   }
	   printTwentyDashes();
   }
 
   public void printABigBox()
   { 	
	   for(int i =0; i <2; i++) {
		   printASmallBox();
	   }
   }   
}