import java.util.Scanner;

public class FibbonachiNumbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, add the number of Fibbonachi row.");
		
		int num = sc.nextInt();
		
		if (num < 1) {
			
			System.out.println("Please, add the correct value.");
			System.exit(1);
		}
		
		else {
			
			long[] numbers = new long[num+1];
			
			// calculate numbers using recursion
			
			long startTime1 = System.nanoTime();
			long answer = calcFib(num, numbers);
			long finishTime1 = System.nanoTime();
			
			// calculate numbers using recursion
			
			System.out.println("The number is " + answer + "." + '\n' + "Time of recursion program is " + (finishTime1 - startTime1) + "ns.");
			
			// calculate numbers using array
			
			long startTime2 = System.nanoTime();
			
			for (int i = 3; i <= num; i++) {
				
				numbers[1] = 1;
				numbers[2] = 1;
				numbers[i] = numbers[i-1] + numbers[i-2];
			}
			
			long finishTime2 = System.nanoTime();
			
			// calculate numbers using array
			
			System.out.println("The number is " + numbers[num] + "." + '\n' + "Time of array program is " + (finishTime2 - startTime2) + "ns.");
			
			
		}
	}
	
	
	// calculate numbers
	
	public static long calcFib(int num, long[] numbers) {
		
		numbers[1] = 1;
		numbers[2] = 1;
		
		if ( (num == 1) || (num == 2) ) {
			
			return 1;
		}
		else {
			
			numbers[num] = calcFib(num-1, numbers) + calcFib(num-2, numbers);
			
			return numbers[num];
			
		}
	}
	
	// calculate numbers
}
	
	
	  