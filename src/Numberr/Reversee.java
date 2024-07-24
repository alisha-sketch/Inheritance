package Numberr;

public class Reversee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println("Original array:");
        printArray(array);

        // Reverse the array
        reverseArray(array);

        System.out.println("Reversed array:");
        printArray(array);
    }
	public static void reverseArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            // Swap elements at index i and n-i-1
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }
	 public static void printArray(int[] array) {
	        for (int element : array) {
	            System.out.print(element + " ");
	        }
	        System.out.println();

	}

}
