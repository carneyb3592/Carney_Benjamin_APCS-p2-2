//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
    String v = "aeiouAEIOU";
	public String go( String a ) {
	
	   if (v.contains(a.substring(0,1)) || v.contains(a.substring(a.length()-1))) {
		   return "yes";
	   }
	   else {
		   return "no";
	   }
	}
}