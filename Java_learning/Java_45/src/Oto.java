
public class Oto extends PhuongTienDiChuyen {
	private String loaiNhienLieu;

	public Oto(String loaiNhienLieu, HangSanXuat hangSanXuat) {
		super("Ô tô", hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVanToc() {
		return 300;
	}
	
	

}
