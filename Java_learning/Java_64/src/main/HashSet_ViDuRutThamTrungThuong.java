package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class HashSet_ViDuRutThamTrungThuong {
	Set<String> thungPhieuDuThuong = new HashSet<String>();
	
	
	public HashSet_ViDuRutThamTrungThuong() {
	}
//	Câu 1: Thêm mã số dự thưởng
	public boolean themMa (String giaTri) {
		return this.thungPhieuDuThuong.add(giaTri);
	}
	
//	Câu 2: Xóa mã số dự thưởng
	public boolean xoaMa (String giaTri) {
		return  this.thungPhieuDuThuong.remove(giaTri);
	}
	
//	Câu3 : Kiểm tra mã số dự thưởng có tồn tại hay không
	public boolean kiemTra (String giaTri) {
		return this.thungPhieuDuThuong.contains(giaTri);
	}
//	Caau 4: Xóa tất cả các phiếu dự thưởng
	public void xoaPhieu () {
		this.thungPhieuDuThuong.clear();
	}
//	Câu 5 : Số lượng phiếu dự thưởng 
	public int kiemTraSoLuong () {
		return this.thungPhieuDuThuong.size();
	}
//	Câu 6: Rút thăm trúng thưởng
	public String rutTham() {
		String ketQua = "";
		Random rd = new Random();
		int viTri = rd.nextInt(this.thungPhieuDuThuong.size());
		ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
		return ketQua;
	}
//	Caau 7: In ra tất cả các phiếu
	public void inPhieu() {
		System.out.println(Arrays.toString(thungPhieuDuThuong.toArray()));
	}
	



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet_ViDuRutThamTrungThuong rt = new HashSet_ViDuRutThamTrungThuong();
		int luaChon =0;
		
		do {
			
			System.out.println("------------------------------------");
			System.out.println("MENU: ");
			System.out.println("1. Thêm mã số dự thưởng.");
			System.out.println("2. Xóa mã số dự thưởng");
			System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không");
			System.out.println("4. Xóa tất cả các phiếu dự thuỏng.");
			System.out.println("5. Số lượng phiếu dự thưởng");
			System.out.println("6. Rút thăm phiếu trúng thưởng");
			System.out.println("7. In ra tất cả các phiếu");
			System.out.println("0. Thoát khỏi chương trình");
			luaChon = sc.nextInt();
			sc.nextLine();
			if (luaChon ==1 || luaChon == 2 || luaChon ==3) {
				System.out.println("Nhâp mã dự thưởng của bạn: ");
				String giaTri = sc.nextLine();
				if(luaChon == 1) {
					rt.themMa(giaTri);
				}else if(luaChon == 2) {
					rt.xoaMa(giaTri);
					System.out.println("Đã xóa mã số !!");
				}else if(luaChon == 3) {
					System.out.println("Kết quả kiểm tra: " + rt.kiemTra(giaTri)); 
				}
			}else if (luaChon == 4) {
				rt.xoaPhieu();
				System.out.println("Đã xóa tất cả các phiếu dự thưởng !!");
				rt.inPhieu();
			}else if (luaChon == 5) {
				System.out.println("Số lượng phiếu là: " + rt.kiemTraSoLuong()) ;
			}else if (luaChon == 6) {
				System.out.println(" Xin chúc mừng mã số trúng thưởng là: " + rt.rutTham());
				
			}else if (luaChon == 7) {
				System.out.println("Các mã dư thưởng là : ");
				rt.inPhieu();
			}
		
		
	}while(luaChon !=0);
		
	}
}


