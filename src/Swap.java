
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 9;
        int n = 5;

        System.out.println("Before swapping:");
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        // Using a third variable to swap the values
        int temp = m;
        m = n;
        n = temp;

        System.out.println("After swapping:");
        System.out.println("m = " + m);
        System.out.println("n = " + n);
	}

}
