
public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien1KG;
	private double khoiLuong;

	public HoaDonCaPhe(String ten, double gia, double khoiLuong) {
		this.tenLoaiCaPhe = ten;
		this.giaTien1KG = gia;
		this.khoiLuong = khoiLuong;

	}

	public double tinhTongTien() {
		return this.giaTien1KG * this.khoiLuong;

		/*
		 * Kiểm tra khối lượng cà phê của túi đã bán có lớn hơn một con số được đưa vào
		 * phương thức hay không ?
		 */
	}

	public boolean kiemTraKhoiLuong(double khoiLuong) {
		return this.khoiLuong > khoiLuong;
	}

	/*
	 * Kiểm tra giá tiền của hóa đơn có lớn hơn 500000đ hay không ?
	 */
	public boolean kiemTraTongTienLonHon500K() {
		return this.tinhTongTien() > 500000;
	}
	/*
	 * Tính số tiên giảm giá, giảm x% cho các hóa đơn có giá trị lớn hơn 500000đ
	 */

	public double giamGia(double x) {
		if (this.tinhTongTien() > 500000) {
		return (x/100)* this.tinhTongTien();
		}else {
			return 0;
		}
	}
	
	/*
	 * Tính số tiền khách phải trả sau khi giảm
	 */
	public double tinhTongTienGiaSauKhiGiam (double x) {
		return (this.tinhTongTien()- this.giamGia(x));
	}

}
