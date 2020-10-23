public class Exercise7 {
	public static void main(String[] args) {
		
		double sum = 0.0;
		int number_of_components = Integer.valueOf(args[0]);
		
		if (number_of_components > 0) {
		    
			for ( int x=1; x < number_of_components + 1; x = x + 1) {
			    
				if (x % 2 == 1) {
				    
					sum = sum + (1 / Math.pow((2*x - 1), 2));
			    }
			    else {
				   
				   sum =sum - (1 / Math.pow((2*x - 1), 2));
			    }
		    }
		    System.out.println("sum =" + sum);
		}
		else {
			
			System.out.println("Please, add correct value.");
		}
	}
}
