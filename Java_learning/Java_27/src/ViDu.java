import java.util.Scanner;

public class ViDu {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = 0;
	try {
		System.out.println("Nhap vao so nguyen n : ");
		n = sc.nextInt();
	} catch (Exception e) {
		System.out.println("Nhap du lieu sai !!!");
	}
	
	System.out.println("Gia tri nhap la: " + n);
	System.out.println("Ket thuc chuong trinh");
}
}
