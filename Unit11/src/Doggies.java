//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;
	
	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
		pups[spot] = new Dog(age,name);
	}

	public String getNameOfOldest()
	{
		int oldest = pups[0].getAge();
		String oldName = pups[0].getName();
		for(Dog i : pups) {
			if(i.getAge() > oldest) {
				oldest = i.getAge();
				oldName = i.getName();
			}
		}
		
		return oldName;
	}

	public String getNameOfYoungest()
	{
		int youngest = pups[0].getAge();
		String youngName = pups[0].getName();
		for(Dog i : pups) {
			if(i.getAge() < youngest) {
				youngest = i.getAge();
				youngName = i.getName();
			}
		}
		
		return youngName;	
		}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}