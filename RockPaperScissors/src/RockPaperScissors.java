/*
 * Date: 12/1/2021
 * Author: Lucas Hurst, Mark Hentz, Iain Bronson
 * Purpose: Rock, Paper, Scissors game
 */

import java.util.Scanner;
public class RockPaperScissors {

	public static int InputInt(String msg) {
		System.out.print(msg + ": ");

		Scanner input = new Scanner (System.in);
		int retval = input.nextInt();

		return retval;
	} // end of InputInt method

	public static String InputStr(String msg) {
		System.out.print(msg + ": ");

		Scanner input = new Scanner (System.in);
		String retval = input.nextLine();

		return retval;
	} // end of InputInt method
	
	public static int GetRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}

	public static void Wait(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			System.out.println("An error has occured. Contact the developer.");
		} // end of try catch for wait timer
	} // end of Wait method

	public static void Logo() {
		System.out.println(""
				+ "# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #\n"
				+ "#                                                                                                     #\n"
				+ "#      _____            _      _____                         _____      _                             #\n"
				+ "#     |  __ \\          | |    |  __ \\                       / ____|    (_)                            #\n"
				+ "#     | |__) |___   ___| | __ | |__) |_ _ _ __   ___ _ __  | (___   ___ _ ___ ___  ___  _ __ ___      #\n"
				+ "#     |  _  // _ \\ / __| |/ / |  ___/ _` | '_ \\ / _ \\ '__|  \\___ \\ / __| / __/ __|/ _ \\| '__/ __|     #\n"
				+ "#     | | \\ \\ (_) | (__|   <  | |  | (_| | |_) |  __/ |     ____) | (__| \\__ \\__ \\ (_) | |  \\__ \\     #\n"
				+ "#     |_|  \\_\\___/ \\___|_|\\_\\ |_|   \\__,_| .__/ \\___|_|    |_____/ \\___|_|___/___/\\___/|_|  |___/     #\n"
				+ "#                                        | |                                                          #\n"
				+ "#                                        |_|                                                          #\n"
				+ "#                                                                                                     #\n" 
				+ "# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #\n");
	} // end of Logo method

	public static void MainMenu() {
		Logo();
		System.out.println("1: Player vs Player");
		System.out.println("2: Player vs Computer");
		System.out.println("9: Exit");
	} // end of MainMenu method

	public static void ShootOptions() {
		System.out.println("1: Rock");
		System.out.println("2: Paper");
		System.out.println("3: Scissors");
		System.out.println();
	}
	
	public static void DifficultyMenu() {
		System.out.println("1: Easy");
		System.out.println("2: Hard");
		System.out.println();
	}
	
	public static int GetComputerChoice(int difficulty) {
		
		int retval;
		if (difficulty == 1) {
			retval = GetRandomNumber(1, 3);
		} else {
			retval = 3;
		}
		
		return retval;
	}

	public static void PlayervsPlayer() {

		boolean winner = false;
		String playerOne;
		String playerTwo;
		int playerOneChoice;
		int playerTwoChoice;

		playerOne = InputStr("(Player 1) Enter Name");
		System.out.println("Welcome " + playerOne + "!");
		System.out.println();

		playerTwo = InputStr("(Player 2) Enter Name");
		System.out.println("Welcome " + playerTwo + "!");
		System.out.println();

		while (!winner) {

			System.out.println(playerOne + " your turn! \n");
			ShootOptions();
			playerOneChoice = InputInt("Enter Option");
			System.out.println();

			System.out.println(playerTwo + " your turn! \n");
			ShootOptions();
			playerTwoChoice = InputInt("Enter Option");
			System.out.println();

			if (playerOneChoice <= 3 && playerTwoChoice <= 3) {
				if (playerTwoChoice == 1 && playerOneChoice == 2) {
					winner = true;
					System.out.println("Paper beats rock. " + playerOne + " wins!");
				} else if (playerOneChoice == 1 && playerTwoChoice == 2) {
					winner = true;
					System.out.println("Paper beats rock. " + playerTwo + " wins!");
				} else if (playerTwoChoice == 2 && playerOneChoice == 3) {
					winner = true;
					System.out.println("Scissors beats paper. " + playerOne + " wins!");
				} else if (playerOneChoice == 2 && playerTwoChoice == 3) {
					winner = true;
					System.out.println("Scissors beats paper. " + playerTwo + " wins!");
				} else if (playerTwoChoice == 1 && playerOneChoice == 3) {
					winner = true;
					System.out.println("Rock beats scissors. " + playerTwo + " wins!");
				} else if (playerOneChoice == 1 && playerTwoChoice == 3) {
					winner = true;
					System.out.println("Rock beats scissors. " + playerOne + " wins!");
				} else {
					System.out.println("Tie! Go again.");
				}
			} else {
				System.out.println("Invalid input. Try again.");
			}
		}
	} // end of PlayervsPlayer method

	public static void PlayervsComputer() {
		
		boolean winner = false;
		int difficulty = 1;
		String playerOne;
		String computer = "Computer";
		int playerChoice;
		int computerChoice = 1;

		playerOne = InputStr("(Player 1) Enter Name");
		System.out.println("Welcome " + playerOne + "!");
		System.out.println();
		
		DifficultyMenu();
		difficulty = InputInt("Enter Difficulty");
		System.out.println();

		while (!winner) {

			System.out.println(playerOne + " your turn! \n");
			ShootOptions();
			playerChoice = InputInt("Enter Option");
			System.out.println();
			
			if (difficulty == 2) {
				
				if (playerChoice == 1) {
					computerChoice = 2;
				} else if (playerChoice == 2) {
					computerChoice = 3;
				} else if (playerChoice == 3) {
					computerChoice = 1;
				}
			} else {
				computerChoice = GetComputerChoice(difficulty);
			}
			
			if (playerChoice <= 3) {
				if (computerChoice == 1 && playerChoice == 2) {
					winner = true;
					System.out.println("Paper beats rock. " + playerOne + " wins!");
				} else if (playerChoice == 1 && computerChoice == 2) {
					winner = true;
					System.out.println("Paper beats rock. Computer wins!");
				} else if (computerChoice == 2 && playerChoice == 3) {
					winner = true;
					System.out.println("Scissors beats paper. " + playerOne + " wins!");
				} else if (playerChoice == 2 && computerChoice == 3) {
					winner = true;
					System.out.println("Scissors beats paper. Computer wins!");
				} else if (computerChoice == 1 && playerChoice == 3) {
					winner = true;
					System.out.println("Rock beats scissors. Computer wins!");
				} else if (playerChoice == 1 && computerChoice == 3) {
					winner = true;
					System.out.println("Rock beats scissors. " + playerOne + " wins!");
				} else {
					System.out.println("Tie! Go again.");
				}
			} else {
				System.out.println("Invalid input. Try again.");
			}
		}
	} // end of PlayervsComputer method

	public static void main(String[] args) {

		boolean userCont = true;

		while (userCont) {

			MainMenu();
			System.out.println();
			int choice = InputInt("Select Mode");
			System.out.println();

			switch (choice) {
			case 1: PlayervsPlayer();
					break;
			case 2: PlayervsComputer();
					break;
			case 9: userCont = false;
					break;
			default: System.out.println("Invalid Input!");
			} // end of choice switch

		} // end of useCont while loop

	} // end of main method

} // end of RockPaperScissors class