/*
 * Date: 11/30/2021-12/10/2021
 * Author: Mark Hentz, Lucas Hurst, & Iain Bronson
 * Purpose: Rock paper scissors game 
 */

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RockPaperScissors {
	
	public static int Input(String text) {
		
		System.out.print(text + ": ");
		
		Scanner input = new Scanner (System.in);
		int retval = input.nextInt();
		
		return retval;
	}
	
	public static void Spacer(int num) {
		
		for (int i=1; i<=num; i++) {
			System.out.println();
		}
	}
	
	public static void Wait(int time) {
		
		try {
			TimeUnit.SECONDS.sleep(time);
		} catch (InterruptedException e) {
			System.out.println("An error has occured. Please relaunch the application.");
		}
	}
	
	public static void Logo() {
		System.out.println("\r\n"
				+ " ____                   _        ____                                    ____           _                                  \r\n"
				+ "|  _ \\    ___     ___  | | __   |  _ \\    __ _   _ __     ___   _ __    / ___|    ___  (_)  ___   ___    ___    _ __   ___ \r\n"
				+ "| |_) |  / _ \\   / __| | |/ /   | |_) |  / _` | | '_ \\   / _ \\ | '__|   \\___ \\   / __| | | / __| / __|  / _ \\  | '__| / __|\r\n"
				+ "|  _ <  | (_) | | (__  |   <    |  __/  | (_| | | |_) | |  __/ | |       ___) | | (__  | | \\__ \\ \\__ \\ | (_) | | |    \\__ \\\r\n"
				+ "|_| \\_\\  \\___/   \\___| |_|\\_\\   |_|      \\__,_| | .__/   \\___| |_|      |____/   \\___| |_| |___/ |___/  \\___/  |_|    |___/\r\n"
				+ "                                                 |_|                                                                        \r"
				+ "By: Lucas Hurst, Mark Hentz, & Iain Brunson\n\n"
				+ "---------------------------------------------------------------------------------------------------------------------------------------"
				);
	}
	
	public static void MainMenu() {
		System.out.println("1: Player vs Player");
		System.out.println("2: Player vs Computer");
		System.out.println("3: Leaderboard");
		System.out.println("9: Exit");
	}
	
	public static void PvP() {
		int player1Choice;
		int player2Choice;
		
		System.out.println("Player 1");
		System.out.println("1: Rock");
		System.out.println("2: Paper");
		System.out.println("3: Scissors");
		Spacer(1);
		player1Choice = Input("Enter Your Move");
	}
	
	public static void PvC() {
		
	}

	public static void main(String[] args) {
		
		int mode;

		Logo();
		Spacer(1);
		MainMenu();
		Spacer(1);
		mode = Input("Select Mode");
		
		if (mode == 1) {
			PvP();
		} else if (mode == 2) {
			PvC();
		}
		
	} // end of main method
} // end of RockPaperScissors class