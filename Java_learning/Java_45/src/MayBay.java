
public class MayBay extends PhuongTienDiChuyen{
	private String loaiNhienLieu;

	public MayBay(String loaiNhienLieu, HangSanXuat hangSanXuat) {
		super("Máy bay",hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}
	public double layVanToc() {
		return 3000;
		
	}

	public void catCanh() {
		System.out.println("Cất cánh");
	}
	public void haCanh() {
		System.out.println("Hạ Cánh");
	}
}
