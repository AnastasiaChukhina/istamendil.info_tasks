import java.util.Scanner;

public class Exercise20 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, add number.");
		
		int a = sc.nextInt();
		int[] arr = new int[a+1];
		
		if (a != 0) {
			
			if (a%2 == 0) {
				
				for (int i = 1; i <= a/2; i++) {
				
					if (a % i == 0) {
						
						if (i*2 > a/2) {
							
							System.out.println((-i)*2);
							System.out.println(-i);
						    System.out.println(i);
							System.out.println(i*2);
					    }
						else {
							System.out.println(-i);
						    System.out.println(i);
						}		
					}	
				}
				
			}
			else {
				
				for (int i=1; i <= a; i+=2) {
					
					if (a % i == 0) {
						
						System.out.println(-i);
						System.out.println(i);
					}
				}
			}
		}			
		else {
			
			System.out.println("All numbers are divided by zero.");
		}	
	}	
}
