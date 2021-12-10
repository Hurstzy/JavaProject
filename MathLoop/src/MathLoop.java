/*
 * Date: 11/9/2021
 * Author: Me
 * Purpose: To create a program that performs mathematical calculations using loops
 */
import java.util.Scanner;
public class MathLoop {
	
	public static void menu () {
		System.out.println("Below are the methods this calculator can do. Please select one.");
		System.out.println();
		System.out.println("1: Multiplication");
		System.out.println("2: Power");
		System.out.println("3: Factorial");
	}
	
	public static int inputNum (String numId) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter " + numId);
		int retval = input.nextInt();
		
		return retval;
	}//end inputNum
	
	public static int multiplication (int num1, int num2) {
		
		int retval = 0;
		for(int x = 1; x <= num1; x++) {
			retval += num2;
		}//end of for loop
		
		return retval;
	}//end multiplication method
	
	public static int toPower (int num1, int num2) {
		
		int retval = 1;
		for(int x = 1; x <= num2; x++) {
			retval *= num1;
		}//end of for loop
		
		return retval;
	}//end toPower method
	
	public static int factorial (int num) {

		int retval = 1;
		for(int x = 1; x <= num; x++) {
			retval *= x;
		}//end of for loop
		
		return retval;
	}//end factorial method

	public static void main(String[] args) {
		
		int option;
		int num1 = 0;
		int num2 = 0;
		int answer = 0;
		boolean userCont = true;
		
		do {
			menu();
			option = inputNum("Please Select a Method: ");
			
			if (option != 3) {
				
				num1 = inputNum("Enter Number 1: ");
				num2 = inputNum("Enter Number 2: ");
			} else {
				
				num1 = inputNum("Enter Number: ");
			}
			
			switch (option) {
			case 1:
				
				answer = multiplication(num1, num2);
				System.out.println("The product of " + num1 + " * " + num2 + " is " + answer);
				
				break;
			case 2:
				
				answer = toPower(num1, num2);
				System.out.println(num1 + " ^ " + num2 + " is " + answer);
				
				break;
			case 3:
				
				answer = factorial(num1);
				System.out.println("The factorial of " + num1 + " is " + answer);
				
				break;
			default:
				menu();
				break;
			} // end of switch
		} while (userCont); //end of while
	}//end of main method
}//end of MathLoop class