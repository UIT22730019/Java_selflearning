
public class Test {
	public static void main(String[] args) {
		HangSanXuat hsx1 = new HangSanXuat("Vn1", "VietNam");
		HangSanXuat hsx2 = new HangSanXuat("KO1", "Korean");
		HangSanXuat hsx3 = new HangSanXuat("JP1", "Japan");
		
		PhuongTienDiChuyen p1 = new MayBay("Xăng", hsx1);
		PhuongTienDiChuyen p2 = new Oto("Dầu", hsx2);
		PhuongTienDiChuyen p3 = new XeDap(hsx3);
		
		System.out.println("Lấy hãng sản xuất: p1-" + p1.layTenHangSanXuat());
	}
}
