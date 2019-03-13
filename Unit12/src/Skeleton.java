//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables
	String name;
	int size;

	//add a constructor
	public Skeleton(int a, String n) {
		name = n;
		size = a;
	}
	//add code to implement the Monster interface
	public String getName()
    {
    	return name;
    }
	public Monster clone ()
	{
		return this;
	}
	//add a toString
	public int getHowBig() {
		return size;
	}
	public boolean isBigger(Monster other) {
		return size > other.getHowBig();
	}
	public boolean isSmaller(Monster other) {
		return other.getHowBig() > size;
	}
	public boolean namesTheSame(Monster other) {
		return other.getName().equals(name);
	}
	 public String toString() {
	    	return name + " " + size;
	    }

}