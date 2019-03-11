//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num;
	private int den;
	//write two constructors
	public Rational() {
		num = 0;
		den = 0;
	}
	public Rational(int n, int d) {
		setRational(n,d);
	}
	//write a setRational method
	public void setRational(int numm, int denn) {
		setNumerator(numm);
		setDenominator(denn);
	}
	//write  a set method for numerator and denominator
	public void setNumerator(int n) {
		num = n;
	}
	public void setDenominator(int d) {
		den = d;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		int numerator = (num * other.den + other.num * den);
		int denominator = (den * other.den);
		num = numerator;
		den = denominator;
		reduce();
	}

	private void reduce()
	{
		
	}

	private int gcd(int numOne, int numTwo)
	{
		if()

		return 1;
	}

	public Object clone ()
	{
		return "";
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{


		return false;
	}

	public int compareTo(Rational other)
	{


		return -1;
	}



	
	//write  toString() method
	
	
}