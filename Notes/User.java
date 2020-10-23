import java.util.Scanner;

public class User {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        String[] notes = new String[1000];
        int counter = 0;
		
        while (true) {
			
            System.out.println("Please, enter a command.");
            String command = sc.nextLine();
			
            switch (command) {
				
                case "add":
				
                    if ((counter < 1000) && (notes[counter] == null)) {
						
						add(counter, notes, sc);
						
						if ((counter != 999) && (notes[counter] != null) {
							
							counter++;
						}
					}
					else if ((counter == 999) && (notes[counter] != null)) {
						
						System.out.println("Array is under the limit, you need to remove something.");
					}
                    break;
					
				case "remove":
				
					if ((counter >= 0) && (notes[counter] != null)) {
				
						remove(counter, notes, sc);
						
						if ((counter-1) >= 0) and (notes[counter] == null) {
							
							counter--;
						}
					}
					else if ((counter == 0) && (notes[counter] == null)) {
							
						System.out.println("Array is empty, there is nothing to remove. 'n/' Please, add something.");
					}	
					break;
					
					
                case "findMaxLine":
                    
					findMaxLine(notes, counter);
                    break;
					
				case "showLine":
				
					showLine(notes, sc);
					break;
					
                case "exit":
				
                    System.exit(0);
                    break;
					
                default:
				
                    System.out.println("Command not found! Try again");
			}
		}
	}
	

    public static void add(int counter, String[] notes, Scanner sc){
        
		notes[counter] = sc.nextLine();
    }
	
	public static void remove(int counter, String[] notes, Scanner sc) {
		
		notes[counter] = null;
	}
	
	public static void findMaxLine(String[] notes,int counter){
		
		int maxlength = 0;
		String maxString = null;
		
		for (int i = 0; i < 1000; i++) {
			
			if ((notes[i] != null) && (notes[i].length() > maxlength)) {
				
				maxlength = notes[i].length();
				maxString = notes[i];
			}
		}
		if (maxString != null) {
			
			System.out.println(maxString);
		}
		else {
			
			System.out.println("String not found.");
		}
	}
	
	public static void showLine(String[] notes, Scanner sc) {
		
		System.out.println("Add the index of array's elenment.");
		int showLineNumber = Integer.valueOf(sc.nextLine());
		
		if ((showLineNumber >= 0) && (showLineNumber < 1000) && (notes[showLineNumber] != null)) {
			
			System.out.println(notes[showLineNumber]);
		}
		else if ((showLineNumber >= 0) && (showLineNumber < 1000) && (notes[showLineNumber] == null)) {
			
			System.out.println("Line is null.");
		}
		else {
			
			System.out.println("Line with this index is not found.");
		}
	}
}
 