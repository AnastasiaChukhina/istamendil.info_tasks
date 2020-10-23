public class Exercise11 {
	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		
		if ((n > 0) && (args.length != 0)) {
		   
		    for (int i = 1; i < n+1; i++) {
			    
				for (int j = 1; j < n+1; j++) {
				    
					System.out.print((i * j) + "   ");
			    }
				System.out.println();
		    }
	    }
		else {
			
			System.out.println("Please, add correct value.");
		}	
    }	
}
