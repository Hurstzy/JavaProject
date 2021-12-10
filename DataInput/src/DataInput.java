/*
 * Date: 8/30/2021
 * Name: Lucas Hurst
 * Purpose: 
 */

import java.util.Scanner;
public class DataInput {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		int age;
		
		System.out.println("Hello my name is Computer. How old are you?");
		age = keyboard.nextInt();
		System.out.println("Wow, that is awesome, I am exactly double your age. I am " +age*2+ " year old.");
		
	}//end of main method

}//end of DataInput class
