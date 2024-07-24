package number;
import java.util.Scanner;
public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Using ternary operator to check if the number is even
        String result = (number % 2 == 0) ? "The number is even." : "The number is odd.";
        
        System.out.println(result);
        
        scanner.close();


	}

}
