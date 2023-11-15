
public class Main {
	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("Son Tung", 100000, 5.7);
		HoaDonCaPhe hd2 = new HoaDonCaPhe("Son Tung", 100000, 1.5);
		System.out.println("Tong tien Hd1: " + hd.tinhTongTien());
		System.out.println("Tong tien Hd2: " + hd2.tinhTongTien());
		System.out.println("Kiem tra khoi luong > 2kg: " + hd.kiemTraKhoiLuong(2));
		System.out.println("Kiem tra khoi luong > 1kg: " + hd.kiemTraKhoiLuong(1));
		System.out.println("Kiem tra tong tien lon hon 500K: " + hd.kiemTraTongTienLonHon500K());
		System.out.println("Giam gia hd: " + hd.giamGia(10));
		System.out.println("Giam gia hd: " + hd2.giamGia(10));
		System.out.println("Tong tien sau khi giam gia cua HD: "+ hd.tinhTongTienGiaSauKhiGiam(10));
		System.out.println("Tong tien sau khi giam gia cua HD2: "+ hd2.tinhTongTienGiaSauKhiGiam(10));
	}

}
