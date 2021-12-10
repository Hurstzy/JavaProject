
/*
 * Date: 09/22/2021
 * Authors: Lucas Hurst, Mark Hentz
 * Purpose: Guessing Game 
 */
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GuessingGameProject {
	
	public static int genNumber(int num1, int num2) {
		return (int) (Math.random() * 100.0) % (num1 - num2);
	}

	public static void guess(int guesses, int winningNum, int attemptNum) {
		Scanner input = new Scanner (System.in);
			
		System.out.print("What is guess number " + attemptNum + "? ");
		int curGuess = input.nextInt();
		
		  if (curGuess == winningNum) {
			  System.out.println("You win!");
		  } else {
			  System.out.println("Not it!");
			  
			  if (attemptNum < guesses) {
				  attemptNum = attemptNum + 1;
				  guess(guesses, winningNum, attemptNum);
			  } else {
				  System.out.println("You are out of guesses, my number was " + winningNum + ", you lose!");
				  mainMenu();
			  }
		  }
	}
	
	public static void guess2(int guesses, int winningNum, int attemptNum) {
			
		int guess = genNumber(1, winningNum);
		System.out.println("The computers guess is " + guess + ".");
		
		  if (guess == winningNum) {
			  System.out.println("The computer wins!");
		  } else {
			  System.out.println("The computer got it wrong!");
			  
			  if (attemptNum < guesses) {
				  attemptNum = attemptNum + 1;
				  try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  guess2(guesses, winningNum, attemptNum);
			  } else {
				  System.out.println("The computer is out of guesses, you win!");
				  mainMenu();
			  }
		  }
	}
	
	public static void mainMenu() {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Select Gamemode");
		System.out.println("1: Guess Computer's Number");
		System.out.println("2: Computer Guesses Your Number");
		System.out.println("3: Exit");
		System.out.println();
		System.out.print("Input: ");

		int gamemode;

		do {
			try {
				gamemode = input.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Invalid choice. Please try again.");
				mainMenu();
			}
		} while (true); // taken from https://www.w3schools.com/java/java_try_catch.asp (for error
						// handling)

		if (gamemode == 1) {
			gameMode2();
		} else if (gamemode == 2) {			
			gameMode1();
		} else if (gamemode == 3) {
			// close prompt
		}
	}
	
	public static void gameMode1() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("The computer will be guessing your number. Please pick your number. ");
		int num = input.nextInt();
		
		System.out.print("How many guesses would you like the computer to have? ");
		int guesses = input.nextInt();
		
		System.out.println("The computer has " + guesses + " to guess the right number (" + num + ").");

		guess2(guesses, num, 1);
	}

	public static void gameMode2() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("You will be picking 2 numbers to guess between. Enter your first number 1-100. ");
		int num1 = input.nextInt();
		
		System.out.print("Enter your second number " + num1 + "-100. ");
		int num2 = input.nextInt();
		if (num2 < num1) {
			System.out.println("That number is lower than your first number. Try again.");
			gameMode2();
		}
		
		System.out.print("How many guesses would you like? ");
		int guesses = input.nextInt();
		
		System.out.println("You have " + guesses + " guesses to get the right number between " + num1 + " and " + num2 + ".");
		
		int winningNumber = genNumber(num1, num2);
		System.out.println("I have thought of the number.");

		guess(guesses, winningNumber, 1);
	}

	public static void main(String[] args) {
		mainMenu();
	}
}