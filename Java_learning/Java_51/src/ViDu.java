
public class ViDu {
	public static void main(String[] args) {
		String s1 = "Xin chào cô chú các bạn, xin chào các chú, Xin chào";
		String s2= "Xin chào";
		String s3 = "Xin chào 123";
		char c1 = 'ô';
		
		//Hàm indexoff
		System.out.println("Vị trí của s2 trong s1 là: " + s1.indexOf(s2));
		System.out.println("Vị trí của s3 trong s1 là: " + s1.indexOf(s3));
		
		//Sử dụng vị trí bắt đầu
		System.out.println("Vị trí của s2 trong s1 là: " + s1.indexOf(s2,2));
		
		// Tìm kiếm char
		System.out.println("Vị trí của c1 trong s1 là: " + s1.indexOf(c1));
		System.out.println("Vị trí của c1 trong s1 là: " + s1.indexOf(c1,20));
		
		// Hàm lastIndexof => Tìm kiếm từ phải sang trái
		System.out.println("Vị trí của c1 trong s1 (từ phải sang trái) là: " + s1.lastIndexOf(c1));
		System.out.println("Vị trí của S2 trong s1 (từ phải sang trái) là: " + s1.lastIndexOf(s2));
		
		//Tên file = "Baitap.excel.lop12.xls";youtube
		
	}
}
