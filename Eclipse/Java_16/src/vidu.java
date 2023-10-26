import java.util.Scanner;

public class vidu {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Value input a = ");
		a = sc.nextDouble();
		System.out.println("Value input b = ");
		b = sc.nextDouble();
		
		//ham tinh gia tri tuyet doi
		System.out.println("|a| = " + Math.abs(a));
		
		//Ham tim min
		System.out.println("min(a, b)" +Math.min(a, b));
		
		//Ham tim max
		System.out.println("max(a, b)" +Math.max(a, b));
		
		//Ham ceil so nguyen lon hon hoac bang
		System.out.println("ceil(a, b)" +Math.ceil(a));
		
		//Ham floor So nguyen be hon hoac bang
		System.out.println("floor(a, b)" +Math.floor(a));
		
		//ham can bac 2
		System.out.println("sqrt(a, b)" +Math.sqrt(a));
		
		//ham tinh a^b
		System.out.println("pow(a, b)" +Math.pow(a,b));
	}
}
