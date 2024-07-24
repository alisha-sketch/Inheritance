package Exp;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hai");
		try{
			int num=10;
			int a=num/0;
			System.out.println(a);
			
		}
		catch(ArithmeticException e1) {
			System.out.println("/zero");
		
		}
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println(e2);
		}
		catch(Exception e) {
			System.out.println("/zero");
		}
		finally {
			System.out.println("java");
			System.out.println("program");
			System.out.println("highh");
		}

	}

}
