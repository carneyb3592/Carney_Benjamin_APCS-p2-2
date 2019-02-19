//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response = "";
		while(response != "n") {
			String player = "";
			
			out.print("type in your prompt [R,P,S] :: ");
			
			player = keyboard.nextLine();
		
			RockPaperScissors game = new RockPaperScissors();
			game.setPlayers(player);
			System.out.print(game.toString());
			out.print("Do you want to play again? (y/n) \n");
			response = keyboard.nextLine();
			if (response.equals("n")){
				break;
			}
		}
			
	}	
}




