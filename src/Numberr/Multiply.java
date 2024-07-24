package Numberr;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {50};
		


		

        for (int number : numbers) {
            System.out.println("Multiplication Table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
            System.out.println(); 
        }
    }


	}


