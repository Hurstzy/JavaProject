import java.util.Scanner;
public class WhatIsYourGrade {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int avg;
		
		System.out.print("What is your average? ");
		avg = input.nextInt();
		
		if ((avg <= 100) && (avg >= 90)) {
			System.out.println("You have an A.");
		}
		if ((avg <= 89) && (avg >= 80)) {
			System.out.println("You have a B.");
		}
		if ((avg <= 79) && (avg >= 70)) {
			System.out.println("You have a C.");
		}
		if ((avg <= 69) && (avg >= 60)) {
			System.out.println("You have a D.");
		}
		if ((avg <= 59) && (avg >= 0)) {
			System.out.println("You have a F.");
		}
	}// end main method

}// end WhatIsYourGrade class
