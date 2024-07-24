package Exp;
import java.util.Scanner;
class AgelimitException extends RuntimeException{
	public AgelimitException(String string) {
		// TODO Auto-generated constructor stub
	}

	public void Agelimitexception(String message) {
}
}
public class Votting {

	private static final Scanner SC = null;

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
			try {
				
				Scanner Sc=new Scanner(System.in);
				System.out.println("Enter your age:");
				int age=SC.nextInt();
				if (age<18) {
					throw new AgelimitException("below 18 not eligible");
					
				}
						
				else
					System.out.println("eligible for votting");
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
		

	}

}
