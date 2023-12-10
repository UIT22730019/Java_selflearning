package vidu;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String s = "Xin chào các bạn, tôi là Braian !!!";
		String [] s1 = s.split(" ");
		System.out.println(Arrays.toString(s1));
		
		String s2 [] = s.split(",");
		System.out.println(Arrays.toString(s2));
		
		String c = "Xin chào, mình là Thành. Mình yêu các bạn !!!";
		String [] c1 = c.split("\\.|\\,");
		System.out.println(Arrays.toString(c1));
		
		String a1 = "Nguyen Trung Thanh";
		String []a1_c = a1.split(" ");
		System.out.println("Mảng ban đầu: " + Arrays.toString(a1_c));
		System.out.println("Tên là: " + a1_c[a1_c.length-1]);

	}

}
