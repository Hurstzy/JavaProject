/*
 * Author: Lucas Hurst
 * Date: 11/29/2021
 * Purpose: Practice for the programming test
 */
import java.util.Scanner;

public class PracticeTest {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		System.out.println("Main Menu");
		System.out.println();
		System.out.println ("1: Add");
		System.out.println ("2: Subtract");
		System.out.println("3: Multiply");
		System.out.print("Please Choose: ");
		int choice = input.nextInt();

		if (choice == 1){
			System.out.print("Number 1 = ");
			int num1 = input.nextInt();
			System.out.print("Number 2 = ");
			int num2 = input.nextInt();
			System.out.println(num1 +" + " +num2 +" = " +num1+num2);
		}//end of choice 1 if
		if (choice == 2){
			System.out.print("Number 1 = ");
			int num1 = input.nextInt();
			System.out.print("Number 2 = ");
			int num2 = input.nextInt();
			System.out.println(num1 +" - " +num2 +" = " + (num1-num2));
		}//end of choice 2 if
		if (choice == 3){
			System.out.print("Number 1 = ");
			int num1 = input.nextInt();
			System.out.print("Number 2 = ");
			int num2 = input.nextInt();
			System.out.println(num1 +" * " +num2 +" = " + (num1*num2));
		}//end of choice 3 if
	}//end main method
}//end of PracticeTest class