public class Exercise5 {
	public static void main(String[] args) {
	    
		int n = Integer.valueOf(args[0]);
		double x = Double.valueOf(args[1]);
	    double sum = 1.0;
		double summand;
		boolean flag = true;
		double a = 0.0;
		
		if ((n > 0) && (args.length != 0)) {
			
			for (int i = n; i > 0; i = i-1) {
				
				if (flag) {
					
					summand = x / (i+1);
					a = summand;
					flag = false;
				}
				else {
					
					if ( (x + (i+1)) != 0) {
				        summand = x / ( (i+1) + a );
					    a = summand;
					}
					else {
						System.out.println("Please, add another value. Denumerator can't be equal to zero.");
					}
				}
			}	
			sum += a;
			System.out.println("sum is " + sum);
		}
		
		else if (n == 0) {
			System.out.println("sum is " + sum);
		}
		
		else {
			System.out.println("Please, check input data and add correct values.");
		}
	}
}	
