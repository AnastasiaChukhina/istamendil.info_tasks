import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, add 2 numbers.");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min_number;
		int max = 1;
		int min_multiple;
		
		if ( (a > 0) && (b > 0) ) {
			
			int[] arra = new int[a+1];
			int[] arrb = new int[b+1];
		
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
					if ( (i == j) && (i > max) && (a%i == 0) && (b%i == 0) ) {
						max = i;
					}
				}
			}
			
			min_multiple = a*b/max;
			System.out.println("Minimal multiple is " + min_multiple + ".");
			
		}
		else {
			System.out.println("Please, add correct values.");
		}
	}
}

		