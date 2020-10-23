public class Exercise6{
	public static void main(String[] args) {
		
		int n = Integer.valueOf(args[0]);
		double sum = 0.0;
		double numerator = 1.0;
		double denumerator = 1.0;
		double currentResult;
	    
		if ((n > 0) && (args.length != 0)) {
			
			for (int m = 1; m < n+1; m = m+1) {
				
				for (int a = 1; a < m; a = a+1) {
					
					if (a == 1) {
						
						numerator *= 1;
					}
					else {
						
						numerator *= (a-1);
					}
				}
				numerator = Math.pow(numerator, 2);
				
				for (int b = 1; b < 2*m+1; b = b+1) {
					
					denumerator *= b;
				}
				
				currentResult = numerator / denumerator;
				sum += currentResult;
			}
			
			System.out.println("Sum = " + sum);
			numerator = 1.0;
			denumerator = 1.0;
		}
		else {
			
			System.out.println("Please, check input data and add correct values");
		}	
	}		
}				

	