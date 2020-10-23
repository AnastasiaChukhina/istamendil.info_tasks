import java.util.Scanner;

public class Bracket {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, add a string.");
		
		String a = sc.nextLine();
		
		if (a.length() == 0) {
			
			System.out.println("Please, add correct string.");
			System.exit(1);
		}
		else {
			
			System.out.println(checkBrackets(a));
		}
	}

	public static boolean checkBrackets(String a) {
		
		char[] str = a.toCharArray();
		
		return checkBrackets(str, 0, 0);
		
	
	}
	
	public static boolean checkBrackets(char[] str, int i, int openBrackets) {
		
		if (i == (str.length-1)) {
			
			switch (str[i]) {
				
				case ('('):
				
					return false;
					
				case (')'):
					
					return ((openBrackets == 1) ? true : false);
				
				default:
					
					return ((openBrackets == 0) ? true : false);
			}
		}
		
		switch (str[i]) {
			
			case('('):
			
				return (true && checkBrackets(str, i+1, openBrackets+1));
				
			
			case(')'):
			
				return ((( (openBrackets - 1) < 0) ? false : true) && checkBrackets(str, i+1, openBrackets-1));

			default:
			
				return (true && checkBrackets(str, i+1, openBrackets));
				
		}
		
	}
}