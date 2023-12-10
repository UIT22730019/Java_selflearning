package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;

//	1.	Thêm sinh viên vào danh sách.
	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}

	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}

	// 1. Thêm sinh viên vào danh sách
	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
	}

//	2.	In danh sách sinh viên ra màn hình
	public void inDanhSachSinhVien() {
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien); // =>Hàm toString
		}
	}

//	3.	Kiểm tra danh sách có rỗng hay không
	public boolean kiemTraDSRong() {
		if (!this.danhSach.isEmpty()) {
			System.out.println("Danh sách sinh viên KHÔNG RỖNG");
			return true;
		}
		System.out.println("Danh sách sinh viên RỖNG");
		return false;

	}

//4.	Lấy ra số lượng sinh viên trong danh sách
	public int laySoLuongSinhVien() {
		return this.danhSach.size();
	}

//	5.	Làm rỗng danh sách sinh viên
	public void lamRongDanhSach() {
		this.danhSach.removeAll(danhSach);
	}

//	6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
	public boolean kiemTraTonTai(SinhVien sv) {
		if (this.danhSach.contains(sv)) {
			System.out.println("Sinh viên CÓ tồn tại trong danh sách !!");
			System.out.println();
			return true;
		}
		System.out.println("Sinh viên KHÔNG tồn tại trong danh sách !!");
		System.out.println();
		return false;
	}

//	 7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
	public boolean xoaSinhVien(SinhVien sv) {
		return this.danhSach.remove(sv);
	}
	// Vì dùng toán tử ba ngôi nên sẽ dùng kiểu void

//	 8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
	public void timSinhVien(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
				System.out.println(sinhVien);
			}
		}
	}

//	 9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
    // Sử dụng Collections.sort để sắp xếp danh sách sinh viên
    // Comparator được sử dụng để so sánh các sinh viên
	public void sapXepSinhVienGiamDanTheoDiem() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				 // So sánh theo điểm trung bình tăng dần
				if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
					return 1; //lớn đứng trước
				} else if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
					return -1; // nhỏ đứng sau
				}else {
					return 0;
				}
			}
		});
	}

}
