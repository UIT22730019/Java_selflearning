import java.util.Scanner;

public class GiaiPTBacHai {
	public static void main(String[] args) {
		/*
		 * Phuong trinh bac 2 : ax^2 + bx + c = 0
		 * 
		 * Cac biến cần có: a, b, c, x1, x2, delta
		 * 
		 * B1 : Delta = b^2 -4ac
		 * B2: Kiểm tra delta
		 * 2.1 : Delta < 0 Phương trình vô nghiệm
		 * 2.2 : Delta = 0 Phương trình có nghiệm kép x1=x2=-b/2a
		 * 2.3 delta >0 Phương trình có 2 nghiệm
		 * 
		 * x1 = (-b-sqrt(delta))/(2a)
		 * x2 = (-b+sqrt(delta))/2a)
		 */
		
		double a, b,c, x1, x2, delta;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tri a = ");
		a = sc.nextDouble();
		System.out.println("Nhap gia tri b = ");
		b = sc.nextDouble();
		System.out.println("Nhap gia tri c = ");
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2)- 4*a*c;
		
		if (a == 0) {
			System.out.println("Error data input");
		}else {
		if (delta < 0) {
			//tinh huong delta < 0
			System.out.println("Phuong trinh vo nghiem");
		}else if (delta == 0) {
			//Tinh huong delta ==0
			System.out.println("Phuong trinh co nghiem kep : X1=X2=" + (-b/2*a));
		}else {
			//Tinh huong delta > 0
			x1 = (-b - Math.sqrt(delta))/(2*a);
			x2 = (-b + Math.sqrt(delta))/(2*a);
			System.out.println("Phuong trinh co hai nghiem : " );
			System.out.println("X1 = " + x1);
			System.out.println("X2 = " + x2);
		}
		}
		}
		}

