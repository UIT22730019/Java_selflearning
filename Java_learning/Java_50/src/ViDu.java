
public class ViDu {
	public static void main(String[] args) {
		String s1 = "NguyenTrungThanh";
		String s2 = "Nguyentrungthanh";
		String s3 = "NguyenTrungThanh";

		// Hàm equals => so sánh 2 chuỗi giống nhau, có phân biệt hoa thường
		System.out.println("s1 equals s2: " + s1.equals(s2));
		System.out.println("s1 equals s3: " + s1.equals(s3));
		// Hàm equals => so sánh 2 chuỗi giống nhau, ko phân biệt hoa thường
		System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
		System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));
		
		//Hàm compareTo => so sánh > < = 
		String sv1= "Nguyễn Văn a";
		String sv2= "Nguyễn Văn B";
		String sv3= "Nguyễn Văn";
		String sv4= "Nguyễn Văn A";
		
		System.out.println("Sv1 compareTo sv2: " + sv1.compareTo(sv2));
		System.out.println("Sv1 compareTo sv3: " + sv1.compareTo(sv3));
		System.out.println("Sv1 compareTo sv4: " + sv1.compareTo(sv4));
		
		//Hàm compareToIgnoreCase => tương tự compareTo, không phân biệt chữ hoa thường
		System.out.println("Sv1 compareToIgnoreCase sv2: " + sv1.compareToIgnoreCase(sv2));
		System.out.println("Sv1 compareToIgnoreCase sv3: " + sv1.compareToIgnoreCase(sv3));
		System.out.println("Sv1 compareToIgnoreCase sv4: " + sv1.compareToIgnoreCase(sv4));
		
		//Hàm regionMatches =>so sánh một đoạn
		String r1 = "NguyenTrungThanh1221";
		String r2 = "Thanh1221";
		boolean check = r1.regionMatches(11, r2, 0, 9);
		System.out.println(check);
		
		//Hàm StartWith => Hàm kiểm tra chuỗi bắt đầu bằng ....
		String sdt = "0373057677";
		String sdt1 = "0965698404";
		System.out.println("sđt: " + sdt.startsWith("037"));
		System.out.println("sđt1: " + sdt1.startsWith("096"));
		//Hàm StartWith => Hàm kiểm tra chuỗi kết thúc bằng ....
		String tenfile1 = "I_love_you.JPG";
		String tenfile2 = "Javacore.PDF";
		
		if(tenfile1.endsWith(".JPG")) {
			System.out.println("File 1 là hình ảnh !!!");
		}else if (tenfile1.endsWith(".PDF")){
			System.out.println("File 1 là file PDF !!!");
		}
		
		if(tenfile2.endsWith(".JPG")) {
			System.out.println("File 2 là hình ảnh !!!");
		}else if (tenfile2.endsWith(".PDF")){
			System.out.println("File 2 là file PDF !!!");
		}
	}
}
