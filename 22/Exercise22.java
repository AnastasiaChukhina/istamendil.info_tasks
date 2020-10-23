import java.util.Scanner;

public class Exercise22 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, add 2 numbers.");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min_number;
		int min_multiple1 = 1;
		int min_multiple2;
		
		if ( (a > 0) && (b > 0) ) {
			
			int[] arra = new int[a+1];
			int[] arrb = new int[b+1];
			
			// find min multiple with 1 way
			
			long start1 = System.nanoTime();
			
			for (int i=1; i <= a; i++) {
				arra[i] = i;
			}
			for (int j=1; j <= b; j++) {
				arrb[j] = j;
			}
			
			if (a<=b) {
				min_number = a;
			}
			else {
				min_number = b;
			}
			  
			for (int i=1; i <= min_number; i++) {
				for (int j=1; j <= min_number; j++) {
					if ( (i == j) && (i > min_multiple1) && (a%i == 0) && (b%i == 0) ) {
						min_multiple1 = i;
					}
				}
			}
			
			long finish1 = System.nanoTime();
			
			System.out.println("Minimal multiple 1 result is " + min_multiple1);
			System.out.println("Time of working of 1 algorithm is " + (finish1 - start1) + "ns.");
			
			// find min multiple with 1 way
			
			// find min_multiple with 2 way
			
			long start2 = System.nanoTime();
			
			if (a != b) {
				
				while (a != b) {
					
					if (a > b) {
						a = a-b;
					}
					else {
						b = b-a;
					}
				}
				min_multiple2 = a;
			}
			else {
				min_multiple2 = a;
			}
			long finish2 = System.nanoTime();
			
			System.out.println("Minimal multiple 2 result is " + min_multiple2);
			System.out.println("Time of working of 2 algorithm is " + (finish2 - start2) + "ns.");
			
			// find min_multiple with 2 way
			
		}
		else {
			System.out.println("Please, add correct values.");
		}
	}
}
		
			
			
				
			
			
			
			
			
			
			
			
			
			
			