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
    	for(int outer = 0; outer < m.length; outer++) {
    		for(int inner = 0; inner < m[outer].length; inner++) {
    			if( checkRight(word, outer, inner) == true || checkLeft(word , outer , inner) == true || checkUp(word,outer,inner) == true || checkDown(word,outer,inner) == true || checkDiagUpLeft(word,outer,inner) == true || checkDiagUpRight(word,outer,inner) == true || checkDiagDownLeft(word,outer,inner) == true || checkDiagDownRight(word,outer,inner) == true) {
    				return true;
    			}
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		String word = "";
		if(c + 1 + w.length() > m[r].length);
		else {
			for(int i = 0; i < w.length(); i++) {
				word += m[r][c+i];
			}
			if(w.compareTo(word) == 0) {
				return true;
			}
		}
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		String word = "";
		if(c + 1 - w.length() < 0);
		else {
			for(int i = 0; i < w.length(); i++) {
				word += m[r][c-i];
			}
			if(w.compareTo(word) == 0) {
				return true;
			}
		}
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		String word = "";
		if(r + 1 - w.length() < 0);
		else {
			for(int i = 0; i < w.length(); i++) {
				word += m[r-i][c];
			}
			if(w.compareTo(word) == 0) {
				return true;
			}
		}
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
		String word = "";
		if(r + 1 + w.length() > m.length);
		else {
			for(int i = 0; i < w.length(); i++) {
				word += m[r+i][c];
			}
			if(w.compareTo(word) == 0) {
				return true;
			}
		}
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		String word = "";
		if(r + 1 - w.length() < 0 || c + 1 + w.length() > m[r].length );
		else {
			for(int i = 0; i < w.length(); i++) {
				word += m[r-i][c+i];
			}
			if(w.compareTo(word) == 0) {
				return true;
			}
		}
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		String word = "";
		if(r + 1 - w.length() < 0 || c + 1- w.length() < 0 );
		else {
			for(int i = 0; i < w.length(); i++) {
				word += m[r-i][c-i];
			}
			if(w.compareTo(word) == 0) {
				return true;
			}
		}
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		String word = "";
		if(r + 1 + w.length() > m.length || c + 1 - w.length() < 0 );
		else {
			for(int i = 0; i < w.length(); i++) {
				word += m[r+i][c-i];
			}
			if(w.compareTo(word) == 0) {
				return true;
			}
		}
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		String word = "";
		if(r + 1 + w.length() > m.length || c + 1 + w.length() > m[r].length );
		else {
			for(int i = 0; i < w.length(); i++) {
				word += m[r+i][c+i];
			}
			if(w.compareTo(word) == 0) {
				return true;
			}
		}
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
