/*
 * Date: 11/12/2021
 * Author: Mr. Lind
 * Purpose: To create a program that performs mathematical calculations using loops and RECURSION
 */
import java.util.Scanner;
public class MathRecursion {

	public static void menu() {
		System.out.println("\nMATH MENU\n");
		System.out.println("1: Multiply");
		System.out.println("2: Multiply - Recursion");
		System.out.println("3: Power");
		System.out.println("4: Power - Recursion");
		System.out.println("5: Factorial");
		System.out.println("6: Factorial Recursion");
		System.out.println("7: Fibonacci");
		System.out.println("8: Fibonacci Recursion");
		System.out.println("9: Exit");
		System.out.print("\nPlease Choose: ");
	}//end of menu method

	public static int inputNumber (String n1) {
		Scanner input = new Scanner (System.in);
		System.out.print("Please input " +n1 +": ");
		int num1 = input.nextInt();
		return num1;
	}//end of inputNumber

	public static int multiply (int num1, int num2) {
		int product = 0;
		for (int i = 1; i <= num2; i++) {
			product += num1;
		}//end of for loop
		return product;
	}//end of multiply method
	
	public static int multiplyRecursion(int num1, int num2) {
	    if (num1 == 0 || num2 == 0) {
	        return 0;
	    } else {
	        if (num1 == 1) {
	            return num2;
	        } else {
	            return num1 + (multiplyRecursion(num1, num2 - 1));
	        } // end of if
	    } // end of if

	  } // end of multiplyRecursion method
	
	public static int power (int base, int exponent) {
		int power = 1;
		for (int i = 1; i <= exponent; i++) {
			power *= base;
		}//end of for loop
		return power;
	}//end of power method
	
	public static int powerRecursion(int base, int exponent) {     
	    if (exponent == 0)         
	        return 1;           
	    else        
	        return base * powerRecursion(base, exponent - 1);
	}
	
	public static int factorial (int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact *= i ;
		}//end of for loop
		return fact;
	}//end of factorial method
	
	public static int factorialRecursion(int num) {
		if(num == 1){
			return 1;
		}

		return factorialRecursion(num - 1) * num;
	}
	
	public static int fibonacciIterative(int pos) {

        int lastLastNum, lastNum = 0, curNum = 1;
        for (int i = 1; i < pos ; i++) {
        	lastLastNum = lastNum;
        	lastNum = curNum;
        	curNum = lastLastNum + lastNum;
        }
        return curNum;
	}
	
	public static int fibonacciRecursion(int pos) {
		if ((pos == 0) || (pos == 1))
			return pos;
		else
		return fibonacciRecursion(pos - 1) + fibonacciRecursion(pos - 2);
	}

	public static void main(String[] args) {

		Scanner keyboard = new Scanner (System.in);
		boolean userContinues = true;
		int num1, num2;
		do {
			menu();
			int choice = keyboard.nextInt();
			System.out.println();
			switch (choice) {
			case 1: // multiply
				num1 = inputNumber ("Number 1");
				num2 = inputNumber("Number 2");
				int product = multiply(num1,num2);
				System.out.println(num1 +" x " +num2 +" = " +product);
				break;
			case 2: // multiply recursion
				num1 = inputNumber ("Number 1");
				num2 = inputNumber("Number 2");
				int productRecur = multiplyRecursion(num1,num2);
				System.out.println(num1 +" x " +num2 +" = " +productRecur);
				break;
			case 3: // power
				num1 = inputNumber("Number");
				num2 = inputNumber("Exponent");
				int power = power(num1, num2);
				System.out.println(num1 + " ^ " + num2 + " = " + power);
				break;
			case 4: // power recursion
				num1 = inputNumber("Number");
				num2 = inputNumber("Exponent");
				int powerRecursion = powerRecursion(num1, num2);
				System.out.println(num1 + " ^ " + num2 + " = " + powerRecursion);
				break;
			case 5: // factorial
				num1 = inputNumber ("Number 1");
				int factorial = factorial(num1);
				System.out.println(num1 + "! = " + factorial);
				break;
			case 6: // factorial recursion
				num1 = inputNumber ("Number 1");
				int factorialRecursion = factorialRecursion(num1);
				System.out.println(num1 + "! = " + factorialRecursion);
				break;
			case 7:
				num1 = inputNumber("What position of the fibonacci sequence do you want to see?");
				int fibonacci = fibonacciIterative(num1);
				System.out.println("Result: " + fibonacci);
				break;
			case 8: // fibonacci recursion
				num1 = inputNumber("What position of the fibonacci sequence do you want to see?");
				long start = System.currentTimeMillis();
				int fibonacciRecursion = fibonacciRecursion(num1);
				long finish = System.currentTimeMillis();
				long timeElapsed = finish - start;
				System.out.println("Result: " + fibonacciRecursion + "\nTime to process: " + timeElapsed/1000 + " seconds");
				break;
			case 9:
				userContinues = false;
				System.out.println("Thanks for using CyberDyne Systems Software");
				break;
			default:
				System.out.println("Invalid input! Try again.");
				break;
			}//end of switch

		}//end of do-while body
		while (userContinues);
		

		

	}//end of main method

}//end of MathRecursion class