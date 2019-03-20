//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Word implements Comparable<Word>
{
	private String word = "";
	private int length;
	public Word( String s )
	{
		word = s;
		length = s.length();
	}
	public int compareTo( Word rhs )
	{		
		int size1 = length;
		int size2 = rhs.word.length();
		if(size1 > size2) {
			return 1;
		}
		if(size2 > size1) {
			return -1;
		}
		else {
			return word.compareTo(rhs.word);
		}
	}
	public String toString()
	{
		return word;
	}
}