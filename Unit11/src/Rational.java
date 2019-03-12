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
		num = 1;
		den = 1;
	}
	public Rational(int n, int d) {
		setRational(n,d);
	}
	//write a setRational method
	public void setRational(int numm, int denn) {
		setNumerator(numm);
		setDenominator(denn);
		reduce();
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
		int gcd = gcd(num,den);
		num/=gcd;
		den/=gcd;
	}

	private int gcd(int numOne, int numTwo)
	{
		int lower = 0;
		int gcd = 1;
		if(numOne > numTwo) {
			lower = numTwo;
		}
		else {
			lower = numOne;
		}
		for(int i = 1; i <= lower; i++) {
			if(numOne%i == 0 && numTwo%i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

	public Object clone ()
	{
		return this;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator() {
		return num;
	}
	public int getDenominator() {
		return den;
	}
	public boolean equals( Object obj)
	{
		if(obj == null) {
			return false;
		}
		if(obj == this) {
			return true;
		}
		if(obj instanceof Rational) {
			Rational compare = (Rational) obj;
			return compare.getDenominator() == den && compare.getNumerator() == num;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		if(equals(other)) {
			return 0;
		}
		int total = num/den;
		int otherTotal = other.num/other.den;
		if(otherTotal > total) {
			return 1;
		}
		return -1;
	}



	
	//write  toString() method
	
	public String toString() {
		return num + "/" + den;
	}
}