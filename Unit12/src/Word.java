//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Word implements Comparable<Word>
{
	private String word;
	private ArrayList<Word>wordList = new ArrayList<Word>();
	public Word( String s )
	{
		word = s;
		Scanner scan = new Scanner(word);
		while(scan.hasNext()){
			String t = scan.next();
			Word w = new Word(t);
			wordList.add(w);
		}
		/**ArrayList<Word>temp = new ArrayList<Word>();
		for(Word i : wordList) {
			if(compareTo(i)==0|| compareTo(i)> 1) {
				temp.add(i);
			}
			if(compareTo(i) < 1) {
				temp.add(i);
			}
		}
		wordList = temp;*/
	}

	public int compareTo( Word rhs )
	{		
		return word.compareTo(rhs.word);
	}

	public String toString()
	{
		return wordList.toString();
	}
}