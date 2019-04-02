//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		Scanner scan = new Scanner(sentence);
		Scanner scan2 = new Scanner(sentence);
		int index = 0;
		int count = 0;
		while(scan.hasNext()) {
			count++;
		}
		wordRay = new String[count];
		while(scan2.hasNext()) {
			wordRay[index] = scan.nextLine();
			index++;
		}
	}

	public void sort()
	{
		
		
	}

	public String toString()
	{
		String output = wordRay.toString();
		return output+"\n\n";
	}
}