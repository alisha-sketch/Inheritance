package number;

public class Valuee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double expression1 = 101 + 0.0 / 3;
        double expression2 = 3.0e-6 * 10000000.1;
        boolean expression3 = true && true;
        boolean expression4 = false && true;
        boolean expression5 = (false && false) || (true && true);
        boolean expression6 = (false || false) && (true && true);

        // Print the results
        System.out.println("101 + 0 / 3 = " + expression1);
        System.out.println("3.0e-6 * 10000000.1 = " + expression2);
        System.out.println("true && true = " + expression3);
        System.out.println("false && true = " + expression4);
        System.out.println("(false && false) || (true && true) = " + expression5);
        System.out.println("(false || false) && (true && true) = " + expression6);

	}

}
