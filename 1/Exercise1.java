public class Exercise1 {
	public static void main(String[] args) {
		
		double depth;
		double time = Double.valueOf(args[0]);
		
		if (time > 0) {
			
			depth = Math.round( ( 9.8 * Math.pow(time, 2) / 2) *100.0 / 100.0 );
			System.out.println("depth = " + depth);
		}
		
		else {
			
			System.out.println("Please, add correct value.");
		}
	}
}
	