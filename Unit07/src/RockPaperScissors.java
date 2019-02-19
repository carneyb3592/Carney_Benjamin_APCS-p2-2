//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice = "";
		compChoice = "";
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		int choice = (int)(Math.random()*3);
		switch(choice) 
		{
			case 0 : compChoice = "R";
			break;
			case 1 : compChoice = "P";
			break;
			case 2 : compChoice = "S";
			break;
			
		}
		playChoice = player;
	}

	public String determineWinner()
	{
		String winner="";
		if(compChoice.equals(playChoice)) {
			winner = "Draw game\n";
		}
		else if(compChoice.equals("R") && playChoice.equals("S"))
		{
			winner = "Computer wins! <<Rock beats scissors>> \n";
		}
		else if(compChoice.equals("R") && playChoice.equals("P"))
		{
			winner = "Player wins! <<Paper beats rock>> \n";
		}
		else if(compChoice.equals("P") && playChoice.equals("S"))
		{
			winner = "Player wins! <<Scissors beats paper>> \n";
		}
		else if(compChoice.equals("P") && playChoice.equals("R"))
		{
			winner = "Computer wins! <<Paper beats rock>> \n";
		}
		else if(compChoice.equals("S") && playChoice.equals("P"))
		{
			winner = "Computer wins! <<Scissors beats paper>> \n";
		}
		else if(compChoice.equals("S") && playChoice.equals("R"))
		{
			winner = "Player wins! <<Rock beats scissors>> \n";
		}
		else
		{
			winner = "Invalid input. \n";
		}
		return winner;
	}

	public String toString()
	{
		String output=  "player had " + playChoice + "\n" + "computer had " + compChoice + "\n" + determineWinner() ;
		return output;
	}
}