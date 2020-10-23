import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Add number.");
		int num = sc.nextInt();
		
		if (num < 0) {
			
			System.out.println("Please, add correct value.");
			System.exit(1);
		}
		
		else {
			
			long factorial = calcFact(num);
			System.out.println("The factorial of number " + num + " is " + factorial + ".");
		}
	}
	
	public static long calcFact(int num) {
		
		if ((num == 0) || (num == 1)) {
			
			return 1;
		}
		else {
			
			return num*calcFact(num-1);
		}
	}
}