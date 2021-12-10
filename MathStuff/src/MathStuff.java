
import java.util.Scanner;
public class MathStuff {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double num1, num2, num3;
		
		System.out.print("Num 1:");
		num1 = input.nextDouble();
		
		System.out.print("Num 2:");
		num2 = input.nextDouble();
		
		num3 = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + num3);
		
		num3 = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + num3);
		
		num3 = num1 * num2;
		System.out.println(num1 + " x " + num2 + " = " + num3);
		
		num3 = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + num3);
		
		System.out.print("Radius = ");
		int radius = input.nextInt();
		double circumference = 2 * Math.PI * radius;
		double area = Math.pow(radius, 2) * Math.PI;
		
		System.out.println("Circumference = " + circumference);
		System.out.println("Area = " + area);
		
		double ranNum = Math.random();
		System.out.println("Random Number: " + ranNum);
		
	}

}
