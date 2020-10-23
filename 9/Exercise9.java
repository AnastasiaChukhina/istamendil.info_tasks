public class Exercise9 {
	public static void main(String[] args) {
		
		double x0 = Double.parseDouble(args[0]);
		double y0 = Double.parseDouble(args[1]);
		double radius = Double.parseDouble(args[2]);
		double x = Double.parseDouble(args[3]);
		double y = Double.parseDouble(args[4]);
		
		if ((args.length != 0) && (radius > 0)) {
				
			if ((Math.pow((x - x0), 2) + Math.pow((y - y0), 2)) <= Math.pow(radius, 2)) {
				
				System.out.println("Point belongs to the circle.");
			}
			else {
				
				System.out.println("Point doesn't belong to the circle.");
			}
		}
		else {
			
			System.out.println("Please, add correct values.");
		}
	}
}
		