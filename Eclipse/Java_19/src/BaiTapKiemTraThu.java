import java.util.Scanner;

public class BaiTapKiemTraThu {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen 0~8: ");
		n = sc.nextInt();

		switch (n) {
		case 2: {
			System.out.println("Thứ hai");
			break;
		}
		case 3: {
			System.out.println("Thứ ba");
			break;
		}
		case 4: {
			System.out.println("Thứ bốn");
			break;
		}
		case 5: {
			System.out.println("Thứ năm");
			break;
		}
		case 6: {
			System.out.println("Thứ sáu");
			break;
		}
		case 7: {
			System.out.println("Thứ bảy");
			break;
		}
		case 8: {
			System.out.println("Chúa nhật");
			break;
		}
		default:
			System.out.println("Nhập sai dữ liệu");
		}
	}

}
