import java.text.DecimalFormat;
import java.util.Scanner;
public class EggCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("##########.##");
		
		int eggs;
		double total;
		int dzn;
		int sngl;
		
		System.out.println("\t\t\tEgg Calculator");
		System.out.println();
		System.out.println("\t\t    <<<Price Structure>>>");
		System.out.println("0 upto (not including) 4 dozen\t\t $0.50 per dozen");
		System.out.println("4 upto (not including) 6 dozen\t\t $0.45 per dozen");
		System.out.println("6 upto (not including) 11 dozen\t\t $0.40 per dozen");
		System.out.println("11 or more dozen\t\t\t\t $0.35 per dozen");
		System.out.println("Extra eggs are 1/12 price of per dozen");
		System.out.println();
		
		System.out.print("Eggs Purchased: ");
		eggs = input.nextInt();
		
		if (eggs < 48) {
			dzn = (eggs/12);
			sngl = (eggs % 12);
			total = ((dzn*0.50) + (sngl*(0.50*0.083333333333333)));
		} else if (eggs < 72) {
			dzn = (eggs/12);
			sngl = (eggs % 12);
			total = ((dzn*0.45) + (sngl*(0.45*0.083333333333333)));
		} else if (eggs < 132) {
			dzn = (eggs/12);
			sngl = (eggs % 12);
			total = ((dzn*0.40) + (sngl*(0.40*0.083333333333333)));
		} else {
			dzn = (eggs/12);
			sngl = (eggs % 12);
			total = ((dzn*0.35) + (sngl*(0.35*0.083333333333333)));
		}
		
		System.out.println("Total $" + df.format(total));
	} // end main method
} // end EggCalculator