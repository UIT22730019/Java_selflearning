package main;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class ViDuPriorityQueue {
	public static void main(String[] args) {
		Queue<String> danhSachSV = new PriorityQueue<String>();
		danhSachSV.offer("Nguyễn Trung Thành");
		danhSachSV.offer("Nguyễn Thị Ngọc Lan");
		danhSachSV.offer("Đậu Trần Trọng Vĩ");
		danhSachSV.offer("Nguyễn Hoàng Phi Phụng");

		while (!danhSachSV.isEmpty()) {
			//Sửa code một tí theo chat GPt chỉ
			String s = danhSachSV.poll(); // Lấy ra và xóa
			System.out.println(s);

		}
	}
}
