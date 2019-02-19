//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;
   private int a2;
   private int b2;
   private int c2;

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
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		for(int n = 0;n<= number; n++)
		{
		int max = number;
		for(a = 1; a <= max; a++ ) {
			a=n;
			for(b = a+1; b <= max; b++ ) {
				b=n;
				for(c = b+1; c <= max; c++ ) {
					c=n;
					if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c,2)) 
					{
						if((a%2 == 0 && b%2 >0 && c%2 >0) || (a%2 > 0 && b%2 == 0 && c%2 >0))
						{
							int limit = Math.min(a, b);
						    limit = Math.min(limit, c);
						    for(int h = limit; h >= 2; h--)
						    {
						        if ( (a % h == 0) && (b % h == 0) && (c % h == 0) ) {
						            a2 = a;
						            b2 = b;
						            c2 = c;
						            return h;
						        }
						    }
						    
						}
					}
					
						
					}
				}
			}
		}
		return 1;
		}
	

	public String toString()
	{
		String output=a2 + " " + b2 + " " + c2;
		return output+"\n";
	}
}