package main;

import java.io.File;

public class ViDuTaoTapTinJava {
	public static void main(String[] args) {
		File folder1 = new File("D:\\Code\\Eclipse\\Java_67");
		File folder2 = new File("D:\\Code\\Eclipse\\Java_67\\Directory1");
//		1. Kiểm tra thư mục hoặc tập tin có tồn tại hay không ?
		if (!folder1.exists()) {
			System.out.println("Không tồn tại thư mục folder1");
		}else {
			System.out.println("Có tồn tại thư mục folder1");
		}
		if (!folder2.exists()){
			System.out.println("Không tồn tại thư mục folder2");
		}else {
			System.out.println("Có tồn tại thư mục folder2");
		}
		
//		2. Tạo thư  mục
		File f1 = new File("D:\\Code\\Eclipse\\Java_67\\Directory1");
		f1.mkdir();
		
//		3. Phương thức tạo nhiều thư mục cùng lúc
		File f2 = new File("D:/Code/Eclipse/Java_67/Directory1/Directory2/Directory3");
//		f2.mkdir();
		f2.mkdirs();
	}

}
