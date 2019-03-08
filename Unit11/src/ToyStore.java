//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Scanner;

public class ToyStore
{
	private ArrayList<Toy> toyList;
	
	public ToyStore(String toys)
	{
		toyList = new ArrayList<Toy>();
		loadToys(toys);
	}

	public void loadToys( String toys )
	{
		Scanner scan = new Scanner(toys);
		while(scan.hasNext()){
			String t = scan.next();
			Toy hi = getThatToy(t);
			if(hi == null) {
				Toy ne = new Toy(t);
				toyList.add(ne);
			} else {
				hi.setCount(hi.getCount()+1);
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		
  		for(Toy i : toyList) {
  			if(i.getName().equals(nm)) {
  				return i;
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int max = toyList.get(0).getCount();
  		String max2 = toyList.get(0).getName();
  		for(Toy i : toyList) {
  			if (i.getCount() > max) {
  				max = i.getCount();
  				max2 = i.getName();
  			}
  		}
  		return max2;
  	}  
  
  	public void sortToysByCount()
  	{
  		
  	}  
  	  
	public String toString()
	{
		return toyList.toString() + "\nmax == " + getMostFrequentToy();
	}
}