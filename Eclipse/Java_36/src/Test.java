
public class Test {
	public static void main(String[] args) {
		NgayChieu ngay1 = new NgayChieu(15, 03, 2001);
		NgayChieu ngay2 = new NgayChieu(03, 10, 1998);
		NgayChieu ngay3 = new NgayChieu(03, 02, 2006);
		
		HangSanXuat hangSanXuat1 = new HangSanXuat("Mavel", "Viet Nam");
		HangSanXuat hangSanXuat2 = new HangSanXuat("DC", "Meo");
		HangSanXuat hangSanXuat3 = new HangSanXuat("Paramout", "Thai Lan");
		
		BoPhim boPhim1 = new BoPhim("Bo Gia", 2020, hangSanXuat1, 35000, ngay1);
		BoPhim boPhim2 = new BoPhim("Gai gia lam chieu", 2009, hangSanXuat2, 40000, ngay2);
		BoPhim boPhim3 = new BoPhim("Dat rung phuong nam", 2023, hangSanXuat3, 90000, ngay3);
		
		
		//Cau 1
		System.out.println("So sanh gia ve bo phim 1 va bo phim 2 : " + boPhim1.kiemtraGiaPhim(boPhim2));
		System.out.println("So sanh gia ve bo phim 1 va bo phim 3 : " + boPhim1.kiemtraGiaPhim(boPhim3));
		System.out.println("So sanh gia ve bo phim 2 va bo phim 3 : " + boPhim2.kiemtraGiaPhim(boPhim3));
		System.out.println("----------------------------------------");
		
		//Cau2 
		System.out.println("Lay ten hang san xuat bo phim 1: " + boPhim1.inHangSanXuatPhim());
		System.out.println("Lay ten hang san xuat bo phim 2: " + boPhim2.inHangSanXuatPhim());
		System.out.println("Lay ten hang san xuat bo phim 3: " + boPhim3.inHangSanXuatPhim());
		
		//cau 3
		System.out.println("----------------------------------------");
		System.out.println("Bo phim 1 giam 10%" + boPhim1.giaVeKhuyenMai(10));
		System.out.println("Bo phim 1 giam 20%" + boPhim1.giaVeKhuyenMai(20));
		System.out.println("Bo phim 1 giam 30%" + boPhim1.giaVeKhuyenMai(30));
	}

}
