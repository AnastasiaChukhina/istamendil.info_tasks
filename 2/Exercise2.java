public class Exercise2 {
	public static void main(String[] args){
		
		double radius, curcumference, area;
		radius = Double.valueOf(args[0]);
		
		
		if (radius>0) {
		    
			curcumference = Math.round((2 * 3.14 * radius * 100.0) / 100.0);
		    area = Math.round((3.14 * Math.pow(radius, 2) * 100.0) / 100.0);
		    System.out.println("Curcumference = " + curcumference);
	        System.out.println("Area = " + area);
		}
		else {
			
			System.out.println("Please, add correct value.");
		}
	}
}
