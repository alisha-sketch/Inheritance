package Numberr;
import java.util.Scanner;
public class Blooddonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Prompt the user to enter their weight
        System.out.print("Enter your weight in kg: ");
        int weight = scanner.nextInt();

        // Check the eligibility using nested if statements
        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("Eligible to donate blood");
            } else {
                System.out.println("Not eligible to donate blood: Weight is less than 50 kg");
            }
        } else {
            System.out.println("Not eligible to donate blood: Age is less than 18 years");
        }


	}

}
