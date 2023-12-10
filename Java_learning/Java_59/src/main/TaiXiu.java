package main;
/*
 * Một người chơi sẽ có tài khoản. Người chơi có quyền được đặt cược số tiền ít hơn hoặc bằng số tiền họ đang có
 * Luật chơi như sau: 
 * Có 3 viên xí ngầu, mỗi viên có 6 mặt có giá trị từ 1-6
 * Mỗi lần lắc sẽ tạo ra một kết quả, Kết quả: giá trị xx1 + giá trịxx2 + giá trị xx3
 * Nếu tổng = 3 hoặc 18 => Nhà cái ăn hết, người chơi thua cuộc.
 * Nếu tổng = (4-10) ->Xỉu => Người chơi đặt xỉu sẽ thắng, ngược lại là thua.
 * Nếu tổng = (11-17)->Tài => Người chơi đặt tài sẽ thắng, ngược lại là thua.
 */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoanNguoiChoi = 5000000;
		Scanner sc = new Scanner(System.in);
		
		//Hàm numberformat = Set ngôn ngữ và mệnh giá tiền
		Locale lc = new Locale("vi", "VN");
		//NumberFormat nf = NumberFormat.getInstance(lc);
		NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
		
		
		int luaChon = 0;
		do {
			System.out.println("----- MỜI BẠN LỰA CHỌN -----");
			System.out.println("Chọn (1) để tiếp tục trò chơi");
			System.out.println("Chọn (Phím bất kì) để kết thúc trò chơi");
			luaChon = sc.nextInt();

			// Khi chọn 1
			if (luaChon == 1) {
				System.out.println("=============================================");
				System.out.println("***** TRÒ CHƠI BẮT ĐẦU *****");

				// Đặt cược
				System.out.println("Tài khoản của bạn hiện tại: " + nf.format(taiKhoanNguoiChoi));
				System.out.println("Bạn muốn đặt cược bao nhiêu? ");
				double tienCuoc = 0;
				do {
					System.out.println("Lưu ý: 0 < Số tiền cược <= " + nf.format(taiKhoanNguoiChoi) + " : ");
					System.out.println("=============================================");
					tienCuoc = sc.nextDouble();
				} while (tienCuoc <= 0 && tienCuoc > taiKhoanNguoiChoi);
				// Lựa chọn Tài hay Xỉu
				int luaChonTaiXiu = 0;
				do {
					System.out.println("***** Chọn 1: TÀI hoặc 2: XỈU *****");
					luaChonTaiXiu = sc.nextInt();
				} while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
				// tung xí ngầu
				Random xn = new Random();

				int giaTri1 = xn.nextInt(5) + 1;
				int giaTri2 = xn.nextInt(5) + 1;
				int giaTri3 = xn.nextInt(5) + 1;
				int tong = giaTri1 + giaTri2 + giaTri3;
				// Tính toán kết quả:
				System.out.println("=============================================");
				System.out.println("***** Kết quả: " + giaTri1 + " - " + giaTri2 + " - " + giaTri3);

				// Xét THẮNG hay THUA
				if (tong == 3 || tong == 18) {
					taiKhoanNguoiChoi -= tienCuoc;
					System.out.println("Tổng là: " + tong + "=> Nhà cái đến từ Châu Âu đã lụm hết tiền của bạn !!");
					System.out.println("YOU LOSE !!!!");
					System.out.println("Tài khoản của bạn hiện tại là: " + nf.format(taiKhoanNguoiChoi));
				} else if (tong >= 4 && tong <= 10) {
					System.out.println("Tổng là: " + tong + "=> XỈU !");
					if (luaChon == 2) {
						System.out.println("Bạn đã thắng cược !! YOU WIN");
						taiKhoanNguoiChoi += tienCuoc;
						System.out.println("Tài khoản của bạn hiện tại là: " + nf.format(taiKhoanNguoiChoi));
						System.out.println("=============================================");
					} else {
						System.out.println("Bạn đã thua cược !!");
						System.out.println("YOU LOSE !!!!");
						taiKhoanNguoiChoi -= tienCuoc;
						System.out.println("Tài khoản của bạn hiện tại là: " + nf.format(taiKhoanNguoiChoi));
						System.out.println("=============================================");
					}
				} else {
					System.out.println("Tổng là: " + tong + "=> TÀI");
					if (luaChon == 1) {
						System.out.println("Bạn đã thắng cược !! YOU WIN");
						taiKhoanNguoiChoi += tienCuoc;
						System.out.println("Tài khoản của bạn hiện tại là: " + nf.format(taiKhoanNguoiChoi));
						System.out.println("=============================================");
					} else {
						System.out.println("Bạn đã thua cược !!");
						System.out.println("YOU LOSE !!!!");
						taiKhoanNguoiChoi -= tienCuoc;
						System.out.println("Tài khoản của bạn hiện tại là: " + nf.format(taiKhoanNguoiChoi));
						System.out.println("=============================================");
					}
				}

			}

		} while (luaChon == 1);
	}
}