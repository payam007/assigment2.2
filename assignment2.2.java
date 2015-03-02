import java.util.Scanner;
public class assigment2.2{
	public static void main(String[] args){
	
	System.out.println("Enter five numbers: ");
	System.out.println("I am going to find the sum and average of those five numbers for you.");
	
	int n1, n2, n3, n4, n5;
	float sum, average;
	Scanner keyboard = new Scanner(System.in);
	n1 = keyboard.nextInt();
	n2 = keyboard.nextInt();
	n3 = keyboard.nextInt();
	n4 = keyboard.nextInt();
	n5 = keyboard.nextInt();

	sum = n1 + n2 + n3 + n4 + n5;
	average = (n1+n2+n3+n4+n5)/5;
	System.out.println("The sum is \"" + sum + "\""
			+ "\n" + "The Average is \"" + average + "\"");

	}
}