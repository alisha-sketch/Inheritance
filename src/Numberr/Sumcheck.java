package Numberr;
import java.util.Scanner;

public class Sumcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check the conditions and print the appropriate message
        if (number < 50) {
            System.out.println("Less than 50");
        } else if (number >= 50 && number <= 100) {
            System.out.println("Greater than or equal to 50 and less than or equal to 100");
        } else {
            System.out.println("Greater than 100");
        }


	}

}
