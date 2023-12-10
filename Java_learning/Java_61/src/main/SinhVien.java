package main;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>{
	private String maSinhVien;
	private String hoVaTen;
	private int namSinh;
	private double diemTrungBinh;
	
	public SinhVien(String maSinhVien, String hoVaTen, int namSinh, double diemTrungBinh) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diemTrungBinh = diemTrungBinh;
	}
	
	public SinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh
				+ ", diemTrungBinh=" + diemTrungBinh + "]";
	}
	@Override
	public int compareTo(SinhVien o) {
		return this.maSinhVien.compareTo(o.maSinhVien);
	}

	@Override
	public int hashCode() {
		return Objects.hash(diemTrungBinh, hoVaTen, maSinhVien, namSinh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(maSinhVien, other.maSinhVien);
	}


	

}
