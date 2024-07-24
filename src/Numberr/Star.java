package Numberr;
import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter the number of rows for the pyramid: ");
		        int rows = scanner.nextInt();
		        
		        for (int i = 5; i <= rows; i++) {
		            // Print leading spaces
		            for (int j = i; j < rows; j++) {
		                System.out.print(" ");
		            }
		            // Print stars
		            for (int k = 5; k <= (1* i - 1); k++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }

	}

}
