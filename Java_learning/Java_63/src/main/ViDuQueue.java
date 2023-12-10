package main;

import java.util.LinkedList;
import java.util.Queue;

public class ViDuQueue {
	public static void main(String[] args) {
		Queue<String> danhSachSV = new LinkedList<String>();
		 danhSachSV.offer("Nguyễn Trung Thành");
		 danhSachSV.offer("Nguyễn Thị Ngọc Lan");
		 danhSachSV.offer("Đậu Trần Trọng Vĩ");
		 danhSachSV.offer("Nguyễn Hoàng Phi Phụng");
		 
		 while(true) {
			 String s = danhSachSV.poll(); //Lấy ra và xóa
			 if (s==null) {
				 break;
		 }
		 System.out.println(s);
		
		 }
	}
}
