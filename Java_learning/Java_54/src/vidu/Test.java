package vidu;

public class Test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(2234, "Nguyen Thị Ngọc An", "10B1", 9.5);
		SinhVien sv2 = new SinhVien(2235, "Nguyen Trung Thành", "10B2", 10);
		SinhVien sv3 = new SinhVien(2000, "Nguyen Vĩ", "10B2", 7.9);
		
		SinhVien [] danhSachSinhVien = {sv1, sv2, sv3};
		System.out.println(sv1.compareTo(sv2)); // => Trả về giá trị âm là Sv1 đứng trước SV2
		System.out.println(sv2.compareTo(sv3));
		
		System.out.println(sv1.compareToDiemTrungBinh(sv2));
		System.out.println(sv1.compareToDiemTrungBinh(sv3));
		
		
	}
}
