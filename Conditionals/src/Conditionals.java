import java.util.Scanner;
public class Conditionals {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int age; 
		String name;
		
		System.out.print("Hello, what is your name? ");
		name = input.nextLine();
		
		System.out.println("Nice to meet you " + name + "!");
		System.out.println();
		
		System.out.print("What is your age? ");
		age = input.nextInt();
		
		if (age >= 12 ) {
			System.out.println("Awesome! Want to go to homecoming?");
		}// end conditional 
	} //end main method

} //end conditional class
