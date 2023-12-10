
public class ViDu {
	public static void main(String[] args) {
		String s1 = "tITv";
		String s2 = ".Vn";
		
		String s3 = s1 + s2;
		//Hàm concat => nối chuỗi lại với nhau
		String s4 = s1.concat(s2);
		System.out.println("S3 = " + s3);
		System.out.println("S4 = " + s4);
		
		//Hàm replace => Hàm thay thế
		String s5 = "NguyenTrungThanh.vn";
		s5.replaceAll("NguyenTrungThanh", "KimNgoc");
		System.out.println("S5 = " + s5);
		
		//Hafm toLowerCase => hàm viết thường
		//Hàm toUpperCase => Hàm viết hoa
		
		String s7 = s3.toLowerCase();
		String s8 = s3.toUpperCase();
		
		System.out.println("Hàm viết thường: " + s7);
		System.out.println("Hàm viết hoa: " + s8);
		
		// hàm xóa khoảng trắng dư thường đầu chuỗi 
		
		String s9 = "     Nguyen trung thanh     ";
		System.out.println(s9.trim());
		
		//Hàm subString => cắt chuỗi con
		String s10 = "Xin chào của bạn muốn hỏi,! Tôi muốn làm quen với bạn";
		String s11 = s10.substring(26);
		String s12 = s10.substring(27, 53);
		System.out.println("S11: " + s11);
		System.out.println("S12: " + s12);
	}
}
