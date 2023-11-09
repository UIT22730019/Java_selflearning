
public class Test {
	public static void main(String[] args) {
		
	
	Ngay ngay1 = new Ngay(03, 10, 1998);
	Ngay ngay2 = new Ngay(18, 01, 2006);
	Ngay ngay3 = new Ngay(18, 01, 2006);
	
	LopHoc lop1 = new LopHoc("10B4", "CNTT");
	LopHoc lop2 = new LopHoc("10B1", "Data");
	LopHoc lop3 = new LopHoc("10b5", "security");
	
	SinhVien sv1 = new SinhVien("22730019", "Nguyen Trung Thanh", ngay1, 4.5, lop1);
	SinhVien sv2 = new SinhVien("22730020", "Nguyen Ngoc Lan", ngay2, 6.5, lop2);
	SinhVien sv3 = new SinhVien("22730021", "Nguyen Na Na", ngay3, 5.5, lop3);
	
	//cau 1
	System.out.println("ten khoa sv1 : " + sv1.layTenKhoa());
	System.out.println("ten khoa sv2 : " + sv2.layTenKhoa());
	System.out.println("ten khoa sv3 : " + sv3.layTenKhoa());
	System.out.println("---------------");
	
	//Cau2
	System.out.println("Diem trung binh sv1: " + sv1.kiemTraDat());
	System.out.println("Diem trung binh sv2: " + sv2.kiemTraDat());
	System.out.println("Diem trung binh sv3: " + sv3.kiemTraDat());
	

	//Cau3
	System.out.println("Kiem tra ngay sinh sv1 vs sv2: " + sv1.kiemTraCungNgaySinh(sv2));
	System.out.println("Kiem tra ngay sinh sv1 vs sv3: " + sv1.kiemTraCungNgaySinh(sv3));
	System.out.println("Kiem tra ngay sinh sv2 vs sv3: " + sv2.kiemTraCungNgaySinh(sv3));
	
	}
	
	
}
