
public class MayTinh {
	
	private HangSanXuat hangSanXuat;
	private NgaySanXuat ngaySanXuat;
	private double giaBan;
	private int thoigianBaoHanh;
	
	
	public MayTinh(HangSanXuat hangSanXuat, NgaySanXuat ngaySanXuat, double giaBan, int thoigianBaoHanh) {
		this.hangSanXuat = hangSanXuat;
		this.ngaySanXuat = ngaySanXuat;
		this.giaBan = giaBan;
		this.thoigianBaoHanh = thoigianBaoHanh;
	}


	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}


	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}


	public NgaySanXuat getNgaySanXuat() {
		return ngaySanXuat;
	}


	public void setNgaySanXuat(NgaySanXuat ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}


	public double getGiaBan() {
		return giaBan;
	}


	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}


	public int getThoigianBaoHanh() {
		return thoigianBaoHanh;
	}


	public void setThoigianBaoHanh(int thoigianBaoHanh) {
		this.thoigianBaoHanh = thoigianBaoHanh;
	}
	
	public String layTenQuocGia()
	{
		return this.hangSanXuat.layTenQuocGia();
	}
	
	public boolean KiemTraGiaBanMayTinh (MayTinh mtKhac) {
		return this.giaBan < mtKhac.giaBan;
	}
	

}
