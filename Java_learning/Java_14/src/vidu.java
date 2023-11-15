import java.util.Scanner;

public class vidu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a , b;
		
		System.out.println("Nhap vao gia tri a : ");
		a = sc.nextInt();
		
		System.out.println("Nhap vao gia tri b : ");
		b = sc.nextInt();
		// Xuat ra de so sanh
		System.out.println(a + "==" + b + " ; " + (a == b));
		System.out.println(a + "!=" + b + " ; " + (a != b));
		System.out.println(a + "<" + b + " ; " + (a < b));
		System.out.println(a + "<=" + b + " ; " + (a <= b));
		System.out.println(a + ">" + b + " ; " + (a > b));
		System.out.println(a + ">=" + b + " ; " + (a >= b));
		System.out.println("------------------------------------");
		System.out.println("Ca hai deu la so chan : " + (a%2==0 & b%2==0));
		System.out.println("Co it nhat 1 so chan : " + (a%2==0 || b%2==0));
	}

}
