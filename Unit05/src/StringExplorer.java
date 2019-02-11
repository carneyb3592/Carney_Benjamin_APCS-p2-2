/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		int pos = sample.indexOf("slow");
		if(pos != -1)
		   System.out.println("slow is found at position " + pos);
		else
		   System.out.println("slow is not found");

		
		//  Try other methods here:
		String sentence = "Computer Science is the best, the greatest, and the most wonderful subject to study";
		String occurances = "";
		int count = 0;
		for(int i = 0; i <sentence.length()-3;i++) {
			if(sentence.substring(i,i+3).equals("the")) {
				count++;
				occurances = occurances + i + ", ";
				
			}
		}
		
		System.out.println("There are " + count + " occurances of the in the string at: " + occurances);
	}

	private static void indexOf(String string, int start) {
		// TODO Auto-generated method stub
		
	}

}
