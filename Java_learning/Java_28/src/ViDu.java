import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		double[] mang1;
		double mang2[];

		mang1 = new double[10];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mang1.length; i++) {
			System.out.println("Nhap phan tu thu " + i + ":");
			mang1[i] = sc.nextDouble();
		}
		double tong = 0;
		for (int i = 0; i < mang1.length; i++) {
			tong += mang1[i];
// Cach 2
		}
		System.out.println(" Tong = " + tong);

		System.out.println("Mang 2 : ");
		mang2 = new double[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < mang2.length; i++) {
			System.out.println(mang2[i]);
		}
	}
}
