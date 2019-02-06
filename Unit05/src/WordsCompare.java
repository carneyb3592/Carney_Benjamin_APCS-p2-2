//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
   private int compare;

	public WordsCompare()
	{
	}

	public WordsCompare(String one, String two)
	{
		setWords(one,two);
		compare();
		toString();
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;

	}

	public void compare()
	{
		if(wordOne.compareTo(wordTwo)<0) {
			compare = -1;
		}
		else {
			compare = 1;
		}
	}

	public String toString()
	{
		if(compare<0)
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}