public class Exercise3 {
	public static void main(String[] args) {
		
		double oneSecondOfPi = 1.0;
		double pi;
		int numberOfMultipliers = Integer.valueOf(args[0]);
		
		if (numberOfMultipliers > 0) {
			
		    for (int x=1; x < numberOfMultipliers+1 ; x++) {
				
				oneSecondOfPi = oneSecondOfPi * (4.0*x*x)/((2.0*x-1.0)*(2.0*x+1.0));
			}
			
			pi = oneSecondOfPi * 2.0;
			System.out.println("Pi = " + pi);
		}
		else {
			
			System.out.println("Please, add correct value.");
		}
	}	
}		
