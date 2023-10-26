import java.util.Scanner;

public class BaiTapGiaiPTBacNhat {
	public static void main(String[] args) {
		//ax +b = 0
		/*
		 * if a = 0 
		 * 		Neu b = 0 => pt vo so nghiem
		 * 		Neu b != 0 => pt vo nghiem
		 * 
		 * if a!= 0
		 * co nghiem x = -b/a 
		 */
		
		double a, b, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao gia tri a = ");
		a = sc.nextDouble();
		System.out.println("Nhap vao gia tri b = ");
		b = sc.nextDouble();
		
		if (a == 0) {
			// tinh huong a = 0
			if(b ==0) {
				//Tinh huong a=0 va b=0
				System.out.println("Phuong trinh VO SO nghiem");
			}else {
				//tinh huong a=0 va b!= 0
				System.out.println("Phuong trinh vo nghiem");
			}
		}else {
			// Tinh huong a != 0 
			x = -b/a;
			System.out.println("phuong trinh co nghiem: " + x);
		}
	}

}
