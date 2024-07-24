package number;

public class Sum {
	public static boolean isSumEqual(int p, int q, int r) {
        return (p + q == r) || (q + r == p) || (r + p == q);
    }

    public static void main(String[] args) {
        // Test cases
        int p = 5, q = 10, r = 15;
      
        boolean result1 = isSumEqual(p, q, r);
        System.out.println("The sum of any two of (" + p + ", " + q + ", " + r + ") equals the third: " + result1);

        

	}

}
