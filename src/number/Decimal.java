package number;
import java.util.Scanner;
public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // Convert decimal to binary
        String binary = Integer.toBinaryString(decimal);

        // Display the result
        System.out.println("The binary representation is: " + binary);


	}

}
