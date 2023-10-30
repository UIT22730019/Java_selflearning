import java.util.Scanner;

public class vidu {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen n>0: ");
		n = sc.nextInt();
		String nhiPhan = "";
		while (n >0) {
			nhiPhan = (n%2) + nhiPhan;
			n = n/2;
		}
			System.out.println("He so nhi phan la : " + nhiPhan);
		/*
		 * Chi liên tục cho 2 va lấy phần dư
		 * Đảo ngược chuỗi => kết quả
		 * 10:2 = 5 dư 0
		 * 5:2 = 2 dư 1
		 * 2:2 = 1 dư 0
		 * 1:2 = 0 dư 1
		 * 
		 * => Kết quả đổi ngược chiều dẽ bằng 1010
		 */
		
	}

}
