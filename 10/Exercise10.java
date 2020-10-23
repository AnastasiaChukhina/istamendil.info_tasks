public class Exercise10 {
	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		
		if ((n > 0) && (args.length != 0)) {
			
			if (n != 1) {
			    
				for (int i = 1; i < (n+1); i++) {
				    
					for (int j = 1; j < (n+1); j++) {
				        
						System.out.print("* ");
				    }
					System.out.println();	
			    }
			}	
			else {
			    
				System.out.println("Please, add a value not equal to 'one'.");
		    }
		}
		else {
			
			System.out.println("Please, add correct value.");
		}
	}
}
