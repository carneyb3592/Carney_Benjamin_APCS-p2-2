//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("src/words.dat"));
		int size = file.nextInt();
		ArrayList<Word> list = new ArrayList<Word>();
		for(int i = 0; i <= size; i++) {
			list.add(new Word(file.nextLine()));
			
		}
		ArrayList<Word> temp = new ArrayList<Word>();
		Word min = list.get(0);
		
		while(list.size() > 0) {
			min = list.get(0);
			for(Word i : list) {
				if (min.compareTo(i) > 0) {
					min = i;
				}
			}
			temp.add(min);
			list.remove(min);
		}
		list = temp;
		for(int i = 0; i <list.size(); i++) {
			out.println(list.get(i));
		}









	}
}