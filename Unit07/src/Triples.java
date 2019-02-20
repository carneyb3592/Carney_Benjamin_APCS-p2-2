//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;
   
	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;
		
	}
	public String findTriple()
	{
		String output = "";
		int max = number;
		
		for(int a = 1; a <= max; a++ ) {
			
			for(int b = a+1; b <= max; b++ ) {
				
				for(int c = b+1; c <= max; c++ ) {
					
					if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c,2)) 
					{
						if((a%2 == 0 && b%2 >0 && c%2 >0) || (a%2 > 0 && b%2 == 0 && c%2 >0))
						{
							if(greatestCommonFactor(a,b,c) == 1)
							{ 
								output += a + " " + b + " " + c + "\n";
							}
						}
					}
				}
			}
		}
		
		return output;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int limit = Math.min(a, b);
	    limit = Math.min(limit, c);
	    for(int h = limit; h >= 0; h--)
	    {
	        if ( (a % h == 0) && (b % h == 0) && (c % h == 0) ) {
	            return h;
	        }
	    }
	    return 1;
	}	

	public String toString()
	{
		String output= "" + findTriple()+ "\n";
		return output+"\n";
	}
}