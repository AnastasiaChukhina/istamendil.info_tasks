import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Exercise26Triangle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, add number of lines in the triangle.");
		
		int n = sc.nextInt();
		
		if (n < 1) {
			
			System.out.println("Please, add correct value.");
			System.exit(1);
		}
		else {
			
			int[][] num = new int[n][n];
			num[0][0] = 1;
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					
					if ( (j == 0) || (j == i) ) {
						
						num[i][j] = 1;
					}
					else {
						
						num[i][j] = num[i-1][j-1] + num[i-1][j];
					}
				}
			}
			// find elements of the triangle
			
			int maxNumberLength = String.valueOf(num[n-1][n/2]).length();
			// length of the max number in the triangle
			
			int maxLineLength = n*maxNumberLength + (n-1);
			// length of the last lines
			
			for (int i = 0; i < n; i++) {
				
				int currentLineLength = maxNumberLength*(i+1) + i;
				
				int freeSpace = (maxLineLength - currentLineLength)/2;
				// amout of space in the beginning and in the and of each line
				
				for (int s = 0; s < freeSpace; s++) {
					
					System.out.print(" ");
				}
				
				for (int j = 0; j <= i; j++) {
					
					int currentNumberLength = String.valueOf(num[i][j]).length();
					
					int currentSpace = (maxNumberLength - currentNumberLength)/2;
					
					String tabs = String.join("", Collections.nCopies(currentSpace, " "));
					// amount of free space near the number needed to centalise it
					
					if ((maxNumberLength - currentNumberLength) % 2 == 0) {
						
						System.out.print(tabs + num[i][j] + tabs + " ");
						// make triangle smooth
					}
					else {
						
					System.out.print(tabs + " " + num[i][j] + tabs + " ");
					// make triangle smooth
					}	
				}	
				
				System.out.println();
			}
		}	
	}
}	
				
				
				
				
			
			
			

