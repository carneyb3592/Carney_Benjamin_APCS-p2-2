//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("src/words.dat"));
		int size = file.nextInt();
		String word = "";
		while(file.hasNext()){
			word += file.next() + " ";
		}
		Word w = new Word(word);
		w.toString();
		











	}
}