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
		int amt = amount;
		int amt2= amount;
		for(int y = 0; y< amount;y++){
			char holder = letter;
			amt = amount;
			for(int i = 0; i< amt2;i++){
				for(int p = 0; p< amt;p++){
					output+=holder;
				}
				output+= ' ';
				if(holder == 'Z')
				{
					holder = 'A';
				}
				else
				{
					holder = (char)(holder+1);
				}
				amt--;
			}
			amt2--;
		output+= '\n';
	 }
		return output;
	}
	public String toString()
	{
		String output=Triangle();
		return output;
	}
}