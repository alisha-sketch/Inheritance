package Numberr;
import java.util.Scanner;
public class Arrayyy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter the number of elements in the array: ");
		        int n = scanner.nextInt();
		        
		        int[] array = new int[n];
		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < n; i++) {
		            array[i] = scanner.nextInt();
		        }
		        
		        double sum = 0;
		        for (int num : array) {
		            sum += num;
		        }
		        
		        double average = sum / n;
		        
		        System.out.println("The average is: " + average);
		        System.out.println("Numbers greater than the average:");
		        
		        for (int num : array) {
		            if (num > average) {
		                System.out.println(num);
		            }
		        }
		        
		        scanner.close();
		    }
		
		

	}


