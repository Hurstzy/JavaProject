/*
 * Date: 10/29/2021
 * Author: Mr. Lind
 * Purpose: to teach methods in context of a math calculator menu
 */
import java.util.Scanner;
import java.lang.Math;
public class MathCalculator {

	public static void mainMenu() {
		System.out.println("1: Add");
		System.out.println("2: Subtract");
		System.out.println("3: Multiply");
		System.out.println("4: Divide");
		System.out.println("5: Power");
		System.out.println("6: Sqaure Root");
		System.out.println("9: Exit");
		System.out.print("\nChoose: ");
	}//end of mainMenu method
	
	public static void addition() {
		Scanner input = new Scanner (System.in);
		int num1, num2;
		System.out.println("Please input number 1: ");
		num1 = input.nextInt();
		System.out.println("Please input number 2: ");
		num2 = input.nextInt();
		int sum = num1 + num2;
		System.out.println(num1 +" + " +num2 +" = " +sum);
	}//end of addition method
	
	public static void subtraction() {
		Scanner input = new Scanner (System.in);
		int num1, num2;
		System.out.println("Please input number 1: ");
		num1 = input.nextInt();
		System.out.println("Please input number 2: ");
		num2 = input.nextInt();
		int diff = num1 - num2;
		System.out.println(num1 +" - " +num2 +" = " +diff);
		
	}//end of subtraction method
	
	public static void multiplication() {
		Scanner input = new Scanner (System.in);
		int num1, num2;
		System.out.println("Please input number 1: ");
		num1 = input.nextInt();
		System.out.println("Please input number 2: ");
		num2 = input.nextInt();
		int prod = num1 * num2;
		System.out.println(num1 +" x " +num2 +" = " +prod);
	}//end of multiplication method
	
	public static void division () {
		Scanner input = new Scanner (System.in);
		int num1, num2;
		System.out.println("Please input number 1: ");
		num1 = input.nextInt();
		System.out.println("Please input number 2: ");
		num2 = input.nextInt();
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		System.out.println(num1 +" / " +num2 +" = " +quotient + " r " +remainder);
	}//end of division method
	
	public static void power() {
		Scanner input = new Scanner (System.in);
		int num1, num2;
		System.out.println("Please input a number: ");
		num1 = input.nextInt();
		System.out.println("Please input the power: ");
		num2 = input.nextInt();
		System.out.println(num1 +" ^ " +num2 +" = " + Math.pow(num1, num2));
	}//end of division method
	
	public static void squareRoot() {
		Scanner input = new Scanner (System.in);
		int num1;
		System.out.println("Please input a number: ");
		num1 = input.nextInt();

		System.out.println("The square root of " + num1 +" = " + Math.sqrt(num1));
	}//end of division method
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);h

		boolean userContinues = true;
		int num1, num2;
		do {
			mainMenu();
			int choice = input.nextInt();

			switch(choice){
			case 1:
				addition();
				break;
			case 2:
				subtraction ();
				break;
			case 3:
				multiplication ();
				break;
			case 4: 
				division();
				break;
			case 5:
				power();
				break;
			case 6:
				squareRoot();
				break;
			case 9: 
				userContinues = false;
				break;
			default: 
				System.out.println("Pick 1 - 4 or 9.");
				break;
			}//end of case

		}//end of do-while body
		while (userContinues);


	}//end of main method

}//end of MathCalculator
