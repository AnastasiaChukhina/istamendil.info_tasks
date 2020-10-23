import java.util.Scanner;
import java.util.Arrays;

public class Exercise27 {
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int a = 1;
		int firstIndex = -1;
		int arr1Size;
		int arr2Size;
		boolean flag = true;
		
		System.out.println("Please, add the quontities of numbers in arrays. Second array should contain more numbers than first. Add each number on new line.");
		
		arr1Size = sc.nextInt();
		arr2Size = sc.nextInt();
		
		if ( (arr2Size >= arr1Size) && (arr1Size > 0) && (arr2Size > 0) ) {
			
			int[] arr1 = new int[arr1Size];
			int[] arr2 = new int[arr2Size];
		
			System.out.println("Add first array. Each number on new line.");
			
			for (int i = 0; i < arr1Size; i++) {
				
				arr1[i] = sc.nextInt();
			}
			System.out.println("The end of the first array.");	
			
			System.out.println("Add second array. It should contains more numbers than first. Each number on new line.");
			
			for (int j = 0; j < arr2Size; j++) {
					
					arr2[j] = sc.nextInt();
			}
			System.out.println("The end of the the second array.");
			
			if (flag) {
				
				for (int i = 0; i <= (arr2Size - arr1Size); i++) {
					
					if ((arr2[i] == arr1[0]) && (flag)) {
						
						n += 1;
						firstIndex = i;
						
						if (arr1Size > 1) {
							
							for (int j = firstIndex+1; j <(firstIndex + arr1Size); j++) {
								
								if (arr2[j] == arr1[a]) {
									
									n += 1 ;
									
									if (a < arr1Size-1) {
										a += 1;
									}
								}
							}
							if (n == arr1Size) {
									
								System.out.println("First array contains in second." + '\n' + "First Index is " + firstIndex + ".");
								flag = false;
							}
							else {
								n = 0;
								firstIndex = -1;
							}
						}
						else {
							System.out.println("First array contains in second." + '\n' + "Firts Index is " + firstIndex + ".");
							flag = false;
						}
						
					}
				}		
				if ( (flag) && (firstIndex == -1)) {
					
					System.out.println("First array doesn't contain in second.");
				}
			}
		}
		else {
			
			System.out.println("Please, choose correct quontities of numbers.");
		}
	}
}
			
				


		
		
		
		