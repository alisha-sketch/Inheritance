
public class Swapnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 9;
        int n = 5;

        System.out.println("Before swapping:");
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        // Swapping without using a third variable
        m = m + n;
        n = m - n;
        m = m - n;

        System.out.println("After swapping:");
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }


	}


