public class Exercise8 {
	public static void main(String[] args) {
		
		int n = Integer.valueOf(args[0]);
		double x = Double.valueOf(args[1]);
		double result;
		
		if ((n > 0) && (args.length != 0)) {
		    
			double currentValue = Math.cos(x);
		
			if (n > 1) {
				
				for (int i = 1; i < n+1 ; i++) {
					
					currentValue = Math.cos(x + currentValue);
				}
			}
			result = currentValue;
			System.out.println("The result is " + result);
		}
		else {
			
			System.out.println("Please, check input data and add correct values.");
	    }
	}
}	
