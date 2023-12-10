import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s ;
		System.out.println("Nhap vao chuỗi: ");
		s= sc.nextLine();
		System.out.println("------");
		
		//Hàm length => lấy ra độ dài của chuỗi
		System.out.println(s.length());
		
		//Hàm charAt() => lấy ra 1 ký tự tại vị trí
		int doDai = s.length();
		for(int i=0; i<doDai; i++)
		{
			System.out.println("Vị trí " + i+" là: "+s.charAt(i));
		}
		System.out.println("------");
		//Hàm getchars(ví trí bắt đầu, vị trí kết thúc, mảng dữ liệu, vị trí bắt đầu lưu của mảng)
		char[]arrChar = new char[30];
		s.getChars(0, 6, arrChar, 0);
		for (int i = 0; i < arrChar.length; i++) {
			System.out.println("Gia trị của mảng tại " + i + " là: " + arrChar[i]);
		}
		
	}
}
