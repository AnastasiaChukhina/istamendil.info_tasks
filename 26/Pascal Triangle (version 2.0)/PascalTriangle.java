import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, add number of lines in the triangle.");
		
		int num = sc.nextInt();
		
		if (num < 1) {
			
			System.out.println("Add correct value.");
			System.exit(1);
		}
		
		else {
			
			long maxNumber = countElement(num, num/2);
			// finding max number in the triangle using function below
			
			long maxNumberLength =(int)Math.log10(maxNumber) + 1;
			// finding length of the max number like a result of log math function
			
			
			// max amount of free space in the beginning of line needed to make triangle smooth
			
			for (int n = 0; n < num; n++) {
				
				long space = (maxNumberLength + 1) * (num-1 -  n) / 2;
				
				for (int s = 0; s < space; s++) {
					
					System.out.print(" ");
				}
				
				for (int k = 0; k <= n; k++) {
					
					long element = countElement(n, k);
					
					System.out.printf("%-" + (maxNumberLength+1) + "d", element);
				}
				
				System.out.println();
			}
			
		}
	}
		
	// functions for counting triangle's elements
		
	public static long countElement(int n, int k) {
		
		return (countFactorial(n) / (countFactorial(k) * countFactorial(n - k)) );
	}
	
	public static long countFactorial(int num) {
		
		long f = 1;
		
		for (int m = 2; m <= num; m++) {
			
			f *= m;
		}
		return f;
	}
		
	// functions for counting triangle's elements
	
}
	