import java.text.DecimalFormat;
import java.util.Scanner;

public class SecondQtrMakeup {

	public static void mainMenu() {
		System.out.println ("Welcome to Lizzard Landing!");
		System.out.println ("Ordering Menu");
		System.out.println ("1: Fillet of Lizzard Sandwich");
		System.out.println ("2: Fried Lizzard Tail");
		System.out.println ("3: Bucket of Lizzard Gizzards");
		System.out.println ("9: Exit");
		System.out.print ("\nPlease choose: ");
	} // end mainMenu method

	public static void main(String[] args) {

		boolean userCont = true;

		do {

			DecimalFormat df = new DecimalFormat("##########.##");
			Scanner reader = new Scanner (System.in);
			double cost = 0, payment, change;

			mainMenu();
			int menuChoice = reader.nextInt();

			switch (menuChoice) {

			case 1:
				cost = 6.35;
				System.out.println ("Excellent Choice");
				break;
			case 2:
				cost = 4.99;
				System.out.println ("Extra Crunchy");
				break;
			case 3:
				cost = 4.00;
				System.out.println ("Finger Lickin Good");
				break;
			case 9:
				userCont = false;
				break;
			default:
				cost = 3.00;
				System.out.println ("Not a valid choice, so I will give you the gizzards.");
				break;
			} // end menuChoice switch

			if (menuChoice != 9) {
				System.out.print ("Your cost is " + cost +". How much would you like to pay? ");
				payment = reader.nextDouble();
				change = payment - cost;
				System.out.println ("Your change is " +df.format(change));
			} //end if check

		} // end do from while do loop
		while (userCont);	
	} // end main method
} // end SecondQtrMakeup class