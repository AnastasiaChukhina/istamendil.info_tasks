import java.util.Scanner;

public class SubstringRegIgnore {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write the string.");
		String a = sc.nextLine();
		
		System.out.println("Write the substring.");
		String b = sc.nextLine();
		
		char[] str = a.toCharArray();
		char[] substr = b.toCharArray();
		
		boolean flag = true;
		boolean localflag = true;
		int dif = 'a' - 'A';
		int n = 0;
		int firstSymbol = -1;
		
		
		if ( (a.length() < b.length()) || (a.length() == 0) || (b.length() == 0) ) {
			
			System.out.println("Substring cannot be longer than a string. Try again.");
			System.exit(1);
		}
		else {
			
			for (int i = 0; i <= (a.length() - b.length()); i++) {
					
					if ( ( (str[i] == substr[0]) || ((int)str[i] == dif+(int)substr[0]) || (dif+(int)str[i]) == (int)substr[0] ) && (flag)) {
						
						n += 1;
						firstSymbol = i+1;
						int y = 1;
							
						for (int k = firstSymbol; k < firstSymbol + b.length() - 1; k++) {
								
							if ( (str[k] == substr[y]) || ((int)str[k] == dif+(int)substr[y]) || (dif+(int)str[k]) == (int)substr[y] ) {
								
								n += 1;
								
								if (y < b.length() - 1 ) {
									
									y += 1;
								}	
							}	
						}
						if (n == b.length()) {
											
							System.out.println("String contains a verifiable substring." + '\n' + "The first symbol of the substring is " + firstSymbol + ".");
							flag = false;
						}
						else {
							
							n = 0;
							firstSymbol = -1;
						}	
					}
				}
				if ( firstSymbol == -1) {
					
					System.out.println("Substring is not found in the recieved string.");
				}
			}
	}
}