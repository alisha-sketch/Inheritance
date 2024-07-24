package Numberr;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Armstrong numbers between 1 and 500:");
        
        for (int num = 1; num <= 500; num++) {
            int sumOfCubes = 0;
            int temp = num;
            
            while (temp != 0) {
                int digit = temp % 10;
                sumOfCubes += digit * digit * digit;
                temp /= 10;
            }
            
            if (sumOfCubes == num) {
                System.out.println(num);
            }
        }
    
}








	}


