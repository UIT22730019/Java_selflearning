package main;

import java.util.ArrayDeque;
import java.util.Deque;

public class ViDuDeque {
	public static void main(String[] args) {
		Deque<String> danhSachSV = new ArrayDeque<String>();
		
		danhSachSV.offer("Nguyễn Kim Ngoc");
		danhSachSV.offer("Nguyễn Na Na");
		danhSachSV.offer("Nguyễn Trung Thành");
		danhSachSV.addFirst("Nguyễn Văn Nghĩa");
		danhSachSV.addLast("Huỳnh Thị Kim Ca");
		
		while (!danhSachSV.isEmpty()) {
			String s = danhSachSV.poll();
			System.out.println("Danh sách: " + s);
		}

	}
}
