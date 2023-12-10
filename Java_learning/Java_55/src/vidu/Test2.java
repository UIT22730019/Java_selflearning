package vidu;

import java.util.Arrays;


public class Test2 {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(2234, "Nguyen Thị Ngọc An", "10B1", 9.5);
		SinhVien sv2 = new SinhVien(2235, "Nguyen Trung Thành", "10B2", 10);
		SinhVien sv3 = new SinhVien(2000, "Nguyen Vĩ", "10B2", 7.9);
		
		SinhVien [] danhSachSinhVien = {sv1, sv2, sv3};
		System.out.println("Ban đầu: " + Arrays.toString(danhSachSinhVien));
		// Hàm sắp xếp
		Arrays.sort(danhSachSinhVien);
		System.out.println("Sắp xếp: " + Arrays.toString(danhSachSinhVien));
	
		// Hàm tìm kiếm
		System.out.println("Tìm kiếm An: " + Arrays.binarySearch(danhSachSinhVien, sv1) );
	}
}
