package Numberr;
import java.util.Scanner;

public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		    
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the first integer: ");
		        int num1 = scanner.nextInt();
		        
		        System.out.print("Enter the second integer: ");
		        int num2 = scanner.nextInt();
		        
		        System.out.print("Enter the third integer: ");
		        int num3 = scanner.nextInt();
		        
		        System.out.print("Enter the fourth integer: ");
		        int num4 = scanner.nextInt();

		        if (num1 == num2 && num2 == num3 && num3 == num4) {
		            System.out.println("Equal");
		        } else {
		            System.out.println("Not Equal");

	}
	}
}
