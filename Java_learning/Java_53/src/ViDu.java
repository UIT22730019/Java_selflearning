import java.util.Arrays;

public class ViDu {
	public static void main(String[] args) {
		
		// Kiểu dữ liệu nguyên thủy
		int [] mang1 = {1,2,3,4};
		
		
		//Cách1: Copy mảng 
		int [] mang1_a = mang1;
		mang1_a [0] = 100;
		System.out.println("mang1: " + Arrays.toString(mang1));
		System.out.println("mang1_a: " + Arrays.toString(mang1_a));
		
		//Cách2: Cópy dùng hàm clone
		int[]mang1_b = mang1.clone();
		mang1_b [0] = 50;
		System.out.println("mang1_b: "+ Arrays.toString(mang1_b));
		
		//Cách 3: cách dùng system.arraycopy
		int []mang1_c = new int [mang1.length];
		System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
		mang1_c [0] = 1200;
		System.out.println("mang1_c: "+ Arrays.toString(mang1_c));
		
		//Bài tập
		//Kiểu đối tượng
		String []doiTuong = {"Nguyen", "Trung", "Thanh"};
		System.out.println("---------------");
		//C1
		String []doiTuong1 = doiTuong;
		doiTuong1 [0] = "Huỳnh";
		System.out.println("Ban đầu_Mang doiTuong: " + Arrays.deepToString(doiTuong));
		System.out.println("Thaydoi_Mang doiTuong1: " + Arrays.deepToString(doiTuong1));
		//C2
		String [] doiTuong2 = doiTuong.clone();
		doiTuong2 [0] = "Trần";
		System.out.println("Thaydoi_Mang doiTuong2: " + Arrays.toString(doiTuong2));
		
		//C3
		String [] doiTuong3 = new String [doiTuong.length];
		System.arraycopy(doiTuong, 0, doiTuong3, 0, doiTuong.length);
		doiTuong3 [2] = "Ngọc";
		System.out.println("Thaydoi_Mang doiTuong3: " + Arrays.toString(doiTuong3));
	}
}
