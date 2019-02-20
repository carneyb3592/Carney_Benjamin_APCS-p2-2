//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		letter = ' ';
		amount = 0;
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}
	public String Triangle() {
		String output = "";
		for(int i = 0; i< amount;i++){
			for(int p = 0; p< amount;p++){
				for(int y = 0; y< amount;y++)
				{
					output+=letter;
					
				}
				output+= ' ';
				output+= (char)(letter+1);
			}
			
		}
		
		
		return output;
	}
	public String toString()
	{
		String output=Triangle();
		return output;
	}
}