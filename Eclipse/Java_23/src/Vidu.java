import java.util.Scanner;

public class Vidu {
	public static void main(String[] args) {
		int x = 1;
		Scanner sc = new Scanner(System.in);
		while (x!=0) {
		System.out.println("Nhap 0 de thoat ra, nhap so khac de tiep tuc : ");
		x = sc.nextInt();
		}
		int i = 1;
		while (true) {
			System.out.println(i);
			i++;
			if(i==10) {
				break;
			}
		}
	}
}
