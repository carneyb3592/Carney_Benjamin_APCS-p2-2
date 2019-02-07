//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word w = new Word();
		w.setString("Hello");
		System.out.println(w.toString());
		System.out.println("\n");
		w.setString("World");
		System.out.println(w.toString());
		System.out.println("\n");
		w.setString("JukeBox");
		System.out.println(w.toString());
		System.out.println("\n");
		w.setString("TCEA");
		System.out.println(w.toString());
		System.out.println("\n");
		w.setString("UIL");
		System.out.println(w.toString());
	}
}