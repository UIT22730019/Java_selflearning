import java.util.Scanner;

public class BaiTapHinhTron {
	public static void main(String[] args) {
		double r, area, perimeter;
		Scanner sc = new Scanner(System.in);
		System.out.println(" circle radius value input = ");
		r = sc.nextDouble();
		
		//perimeter circle
		perimeter = 2*Math.PI*r;
		System.out.println("Perimeter  = " + perimeter);
		//ham lam tron
		System.out.println("Perimeter  = " + Math.round(perimeter)+ " Round number");
		System.out.println("Perimeter  = " + Math.round(perimeter*100.0)/100.0+ " Round Number");
		
		
		// Circle area
		area = Math.PI*Math.pow(r, 2);
		System.out.println("Area : " + area);
		System.out.println("Area : " + Math.round(area));
	}
	

}
