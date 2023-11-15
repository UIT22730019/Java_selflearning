import java.util.Scanner;

/**
 * 
 */
public class Vidu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao Ho va Ten: ");
		String hoVaTen = sc.nextLine();
		
		System.out.println("Nhap Ma Sinh Vien: ");
		Long maSinhVien = sc.nextLong();
		
		System.out.println("Nhap Diem Thi: ");
		Float diemThi = sc.nextFloat();
		
		System.out.println("---------------------");
		
		System.out.println("Ho va Ten: " + hoVaTen);
		System.out.println("Ma Sinh Vien: " + maSinhVien);
		System.out.println("Diem Thi : " + diemThi);
		
		
		
	}

}
