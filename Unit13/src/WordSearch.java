//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	int index = 1;
    	int row=0;
    	int col=0;
    	m = new String[size][size];
    	for(String[] i : m) {
    		for(String y : i) {
    			m[row][col] = str.substring(index-1,index);
    			index++;
    			col++;
    		}
    		col = 0;
    		row++;
    	}
    }

    public boolean isFound( String word )
    {
    	if(checkRight(word,))
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		return false;
	}

    public String toString()
    {
    	String output = "";
    	for(String[] i : m) {
    		for(String y : i) {
    			output += y + " ";
    		}
    		output += "\n";
    	}
    	
 		return output;
    }
}
