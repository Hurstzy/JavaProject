/*
 * Date: 3/21/2020
 * Author: Mr. Lind
 * Purpose: To demonstrate how to make a user customized rectangle print and discuss making
 * 			it hollow
 */
import java.util.Scanner;
public class Rectangles {
	
	public static String output = "=";

	public static void mainMenu() {
		System.out.println("\nMain Menu\n");
		System.out.println("1: Input Dimensions");
		System.out.println("2: Solid Rectangle");
		System.out.println("3: Hollow Rectangle");
		System.out.println("4: Change Output");
		System.out.println("9: Exit\n");
		System.out.print("Please Choose: ");
	}//end of mainMenu

	public static int inputDimension (String dim) {
		Scanner input = new Scanner (System.in);
		int dimension = -1;

		while (dimension < 1) {
			System.out.print(dim +": ");
			dimension = input.nextInt();
			if (dimension < 1) {
				error(2);
			}//end of if
		}//end of while
		return dimension;

	}//end of inputDimensions
	
	public static void setOutput() {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter your output symbol: ");
		output = input.nextLine();
	}
	
	public static void outputSolidRectangle(int length, int width) {
		for(int l = 1; l <= length; l++) {
			for (int w = 1; w <= width; w++) {
				System.out.print(output);
			}//end of inner loop
			System.out.println();
		}//end of outer for loop
	}//end of outputSolidRectangle

	public static void outpuHollowRectangle (int length, int width) {
		for(int l = 1; l <= length; l++) {
			for (int w = 1; w <= width; w++) {
				if (l == 1 || l == length || w == 1 || w == width) {
					System.out.print(output);
				} else {
					System.out.print(" ");
				}
			}//end of inner loop
			System.out.println();
		}//end of outer for loop
	}//end of hollowSolidRectangle

	public static void error (int e) {
		switch (e){
		case 1: 
			System.out.println("\nERROR: Please choose 1 - 3 or 9\n");
			break;
		case 2:
			System.out.println("\nERROR: Please choose a positive number\n");
			break;
		}//end of switch 

	}//end of error

	public static void exit() {
		System.out.println("\n<<<<<<<<<<<< Thanks for using CyberDyne Systems>>>>>>>>>>>>>>\n");
	}//end of exit

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int length = 1, width = 1;
		boolean userContinues = true;

		do {
			mainMenu();
			int userChoice = input.nextInt();
			switch (userChoice) {
			case 1: 
				length = inputDimension ("Length");
				width = inputDimension ("Width");
				break;
			case 2: 
				outputSolidRectangle(length,width);
				break;
			case 3: 
				outpuHollowRectangle (length, width);
				break;
			case 4:
				setOutput();
				break;
			case 9: 
				userContinues = false;
				exit ();
				break;
			default: error (1);
			break;
			}//end of switch
		}//end of do while body
		while (userContinues);
	}
}
