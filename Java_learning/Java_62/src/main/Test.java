package main;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String> stackChuoi = new Stack<String>();
		
//		stackChuoi.push("giá trị) => đưa giá trị vào stack
//		stackChuoi.pop("giá trị"); => đưa giá trị ra stack
//		stackChuoi.peek() => đưa giá trị ra stack, nhưng không xóa ra khỏi stack
//		stackChuoi.contains("giá trị") => xác định giá trị có tồn tại trong stack hay không
//		stackChuoi.size()=> độ lớn của stack		
		// Ví dụ đảo ngược chuỗi
		
		System.out.println("Nhập vào chuỗi: ");
		String nhap = sc.nextLine();
		// Nguyên Trung Thành
		for(int i =0; i < nhap.length(); i++) {
			stackChuoi.push(nhap.charAt(i) +"");
		}
		System.out.println("Chuỗi đảo ngược: ");
		for (int i = 0; i < nhap.length(); i++) {
			System.out.print(stackChuoi.pop()); 
		}
		System.out.println();
		
		//Chuyển hệ thập phân sang hệ nhị phân
		// phải nhập interger là đối tượng, chứ không phải là kiểu khai báo, stack không làm việc được với số nguyên thủy
		Stack<Integer> stackSoDu = new Stack<Integer>(); 
		System.out.println("Nhập vào số nguyên dương: ");
		int x = sc.nextInt();
		while (x >0) {
			int soDu = x%2;

			stackSoDu.push(soDu);
			x= x/2;
		}
		System.out.println("Hệ nhị phân là: ");
		int n = stackSoDu.size();
		for (int i = 0; i < n; i++) {
			System.out.print(stackSoDu.pop());
		}

	}
}
