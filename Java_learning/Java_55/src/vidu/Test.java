package vidu;

import java.util.Arrays;
import java.util.Collection;

public class Test {
	public static int[] reverse(int[] x) {
		int[] ketQua = new int[x.length];
		int index = 0;
		// Duyệt mảng ban đầu từ cuối về đầu
		for (int i = x.length - 1; i >= 0; i--) {
			// Lưu giá trị của mỗi phần tử từ mảng ban đầu vào mảng kết quả theo thứ tự đảo
			// ngược
			ketQua[index] = x[i];
			index++;
		}
		return ketQua;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 8, 2, 6, 4, 3, 7, 9 };
		int[] b = new int[] { 15 };

		//
		System.out.println("a ban đầu: " + Arrays.toString(a));
		// Hàm sắp xếp
		Arrays.sort(a);
		System.out.println("a sau khi sắp xếp: " + Arrays.toString(a));

		/*
		 * Hàm tìm kiếm binarySearch chỉ áp dụng cho những mảng đã sắp xếp tăng dần rồi
		 */
		// Trường hợp 1: Sắp Tăng dần
		System.out.println(Arrays.binarySearch(a, 4));
		System.out.println(Arrays.binarySearch(a, -1));

		// Trường hợp 2: Sắp Giảm dần
		// Viết thêm 1 hàm revert để đảo ngược cái kết quả
		Arrays.sort(a);
		a = Test.reverse(a);
		System.out.println("a sau khi giảm dần: " + Arrays.toString(a));

		// Hàm điền giá trị
		Arrays.fill(b, 5);
		System.out.println("B sau khi điền giá trị: " + Arrays.toString(b));
	}

}
