
public class SinhVien {
	
	private String maSoSinhvien, hovaTen;
	private Ngay ngaySinh;
	private double diemTrungBinh;
	private LopHoc lop;
	
	
	public SinhVien(String maSoSinhvien, String hovaTen, Ngay ngaySinh, double diemTrungBinh, LopHoc lop) {
		this.maSoSinhvien = maSoSinhvien;
		this.hovaTen = hovaTen;
		this.ngaySinh = ngaySinh;
		this.diemTrungBinh = diemTrungBinh;
		this.lop = lop;
	}


	public String getMaSoSinhvien() {
		return maSoSinhvien;
	}


	public void setMaSoSinhvien(String maSoSinhvien) {
		this.maSoSinhvien = maSoSinhvien;
	}


	public String getHovaTen() {
		return hovaTen;
	}


	public void setHovaTen(String hovaTen) {
		this.hovaTen = hovaTen;
	}


	public Ngay getNgaySinh() {
		return ngaySinh;
	}


	public void setNgay(Ngay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}


	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}


	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}


	public LopHoc getLop() {
		return lop;
	}


	public void setLop(LopHoc lop) {
		this.lop = lop;
	}
	
	public String layTenKhoa () {
		return this.lop.getTenKhoa();	}
	
	public boolean kiemTraDat() {
		return this.diemTrungBinh >=5.0;
	}
	public boolean kiemTraCungNgaySinh(SinhVien svKhac) {
		return this.ngaySinh.equals(svKhac.ngaySinh);
	}
	

}
