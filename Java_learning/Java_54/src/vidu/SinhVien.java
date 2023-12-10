package vidu;

public class SinhVien implements Comparable<SinhVien> {
	private int maSinhVien;
	private String hoVaTen;
	private String tenLop;
	private double diemTrungBinh;

	public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTrungBinh = diemTrungBinh;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public String getTen() {
		String s = this.hoVaTen.trim(); // Xóa khoảng trắng dư thừa ở hai đầu
		if (s.indexOf(" ") >= 0) {
			int viTri = s.lastIndexOf(" ");
			return s.substring(viTri + 1);
		} else {
			return s;
		}
	}
	
	@Override
	public int compareTo(SinhVien o) {
		// < 0
		// = 0
		// > 0
		// Bài dựa trên so sánh tên
		// Tên: Ada, . Black Obama
		String tenThis = this.getTen();
		String tenO = o.getHoVaTen();

		return tenThis.compareTo(tenO);
	}
	public int compareToDiemTrungBinh (SinhVien o) {
		// so sánh theo chiều tăng dần
		if (this.diemTrungBinh < o.diemTrungBinh) {
			return -1;
		}else if(this.diemTrungBinh > o.diemTrungBinh) {
				return 1;
			}else {
				return 0;
			}
		
	}

}
