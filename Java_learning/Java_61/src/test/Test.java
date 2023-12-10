package test;

import java.util.Scanner;

import main.DanhSachSinhVien;
import main.SinhVien;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DanhSachSinhVien dssv= new DanhSachSinhVien();
		int luaChon = 0;
		do {
			System.out.println("------ MENU ------");
			System.out.println("Vui lòng lựa chọn chức năng: ");
			System.out.println(
					"1.	Thêm sinh viên vào danh sách.\n"
					+ "2.	In danh sách sinh viên ra màn hình.\n"
					+ "3.	Kiểm tra danh sách có rỗng hay không.\n"
					+ "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
					+ "5.	Làm rỗng danh sách sinh viên.\n"
					+ "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
					+ "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
					+ "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
					+ "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
					+ "0.   Thoát khỏi chương trình.\n"
					+ "=============================="
					);
			luaChon = sc.nextInt();
			sc.nextLine();
			if(luaChon == 1) {
//				1.	Thêm sinh viên vào danh sách.
				System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
				System.out.println("Nhập Họ và Tên: "); String hoVaTen = sc.nextLine();
				System.out.println("Nhập năm sinh: "); int namSinh = sc.nextInt();
				System.out.println("Nhập Điểm Trung Bình: "); double diemTrungBinh = sc.nextDouble();
				SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
				dssv.themSinhVien(sv);
				System.out.println();
			}else if(luaChon == 2) {
//				2.	In danh sách sinh viên ra màn hình
				dssv.inDanhSachSinhVien();
				System.out.println();
			}else if(luaChon == 3) {
//				3.	Kiểm tra danh sách có rỗng hay không
				dssv.kiemTraDSRong();
				System.out.println();
			}else if(luaChon == 4) {
//				4.	Lấy ra số lượng sinh viên trong danh sách
				System.out.println("Số lượng sinh viên hiện tại: " + dssv.laySoLuongSinhVien() + " sinh viên");
				System.out.println();
			}else if(luaChon == 5) {
//				5.	Làm rỗng danh sách sinh viên
				dssv.lamRongDanhSach();
				System.out.println("Danh sách sinh viên đã xóa");
				System.out.println();
			}else if(luaChon == 6) {
//				6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.

				System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
				SinhVien sv1 = new SinhVien(maSinhVien);
				dssv.kiemTraTonTai(sv1);

			}else if(luaChon == 7) {
//				7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
				System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
				SinhVien sv2 = new SinhVien(maSinhVien);
				System.out.println("Xóa sinh viên " + dssv.xoaSinhVien(sv2));
			}else if(luaChon == 8) {
//				8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
				System.out.println("Nhập Họ và Tên: "); String hoVaTen = sc.nextLine();
				System.out.println("Kết quả tìm kiểm: ");
				dssv.timSinhVien(hoVaTen);
			}else if(luaChon == 9) {
//				9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
				dssv.sapXepSinhVienGiamDanTheoDiem();
				dssv.inDanhSachSinhVien();
			}
							
		}while (luaChon != 0);
	}

}
