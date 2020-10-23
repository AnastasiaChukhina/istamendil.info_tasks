import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;

public class Integral {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("Integral.txt", true);
		
		Scanner sc = new Scanner(System.in);
		double square;
		
		System.out.println("Write the value of the left border.");
		double a = Double.valueOf(sc.nextLine());
			
		System.out.println("Write the value of the right border.");
		double b = Double.valueOf(sc.nextLine());
		
		System.out.println("Write the number of peaces you want to divide the line segment on.");
		int num = Integer.valueOf(sc.nextLine());
		
		System.out.println("Write, what method of calculating integral you want to use: Rectangle, Simpson or Trapeze.");
		String wayOfCalcIntegral = sc.nextLine();
		
		String file1 = "";
		
		if (b <= a) {
				
			System.out.println("Left border should be bigger. Add correct values.");
			System.exit(1);
		}
		else {
		
			double[] values = new double[num+1];
			
			for (int i = 0; i < num+1; i++) {
				
				values[i] = a + ((b-a)/(num+1))*i;
			}
			
			if (wayOfCalcIntegral != null) {

				// user choose the way of calculating value
				switch(wayOfCalcIntegral) {
				
					case "Rectangle":
						
						square = calcRectangle(values, num, a, b);
						System.out.printf("%.4f", square);
						file1 = String.format("%.4f", square);
						break;
						
					case "Simpson":
					
						square = calcSimpson(values, num);
						System.out.printf("%.4f", square);
						file1 = String.format("%.4f", square);
						break;
						
					case "Trapeze":
						
						square = calcTrapeze(values, num, a, b);
						System.out.printf("%.4f", square);
						file1 = String.format("%.4f", square);
						break;
						
					default:
						
						System.out.println("Such way of calculating integral is not found. Choose one of available methods. Try again!");
						file1 = "Unknown method";
						break;
				}
				// user choose the way of calculating value
				file.write(file1.getBytes());
				file.close();
			}
			else {
				
				System.out.println("You add nothing. Try again.");
				System.exit(1);
			}
		}
	}
	
	// functions for calculating values with different methods
	public static double calcRectangle(double[] values, int num, double a, double b) {
	
		double sum = 0.0;
		
		for (int i = 0; i < (num+1); i++) {
			
			sum += calcF(values[i]) * (b-a)/num;
		}
		return sum;	
	}
	
	public static double calcSimpson(double[] values, int num) {
	
		double sum = 0.0;
		
		for (int i = 0; i < num; i++) {
			
			sum += ((values[i+1]- values[i]) / 6) * (calcF(values[i]) + 4 * calcF((values[i] + values[i+1])/2) + calcF(values[i+1]));
		}
		return sum;
	}
	
	public static double calcTrapeze(double[] values, int num, double a, double b) {
	
		double sum = 0.0;
		
		for (int i = 0; i < num; i++) {
			
			sum += ((calcF(values[i]) + calcF(values[i+1])) / 2) * (b-a)/num;
		}
		return sum;
	}
	// functions for calculating values with different methods
	
	
	// a deferentable function
	public static double calcF(double c) { 
		
		double function = 1/c;
		
		return function;
	}
	// a deferentable function
}