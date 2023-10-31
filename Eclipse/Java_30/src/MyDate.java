/*
 * Tạo ra một class: Ngày tháng , Date
 * Trong Date có các dữ liệu: day, month, year
 * Trong Date phương thức: 
 * In ra ngày
 * in ra tháng 
 * in ra năm
 * in ra ngày tháng năm
 */
public class MyDate {
	private int day, month, year;
	
	public MyDate(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}
	public void printDay() {
		System.out.println("Day: " + this.day);
	}
	public void printMonth() {
		System.out.println("Month: " + this.month);
	}
	public void printYear() {
		System.out.println("Year: " + this.year);
	}
	public void printDate() {
		System.out.println("Date: " + this.day+"-"+this.month+"-"+this.year);
	}

}
