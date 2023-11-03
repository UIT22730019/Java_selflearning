
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
	}

}
