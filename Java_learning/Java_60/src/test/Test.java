package test;

public class Test {
	public static void main(String[] args) {
		ThoiKhoaBieu tb_t2 = new ThoiKhoaBieu(Day.Monday, "Toán, Lý, Hóa");
		ThoiKhoaBieu tb_t3 = new ThoiKhoaBieu(Day.Tuesday, "Văn, Sử, Địa");
		ThoiKhoaBieu tb_t4 = new ThoiKhoaBieu(Day.Wednesday, "Toán, Lý, Anh");

		System.out.println(tb_t2);
		int x = Month.July.numberDay();
		System.out.println(x);
	}

}
