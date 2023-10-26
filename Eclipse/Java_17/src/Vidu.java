import java.util.Scanner;

public class Vidu {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer = ");
		n = sc.nextInt();
		
		
		//Kiem tra so chan hay le
		if (n%2 == 0) {
			System.out.println(n +" is Even Number ");
		}else {
			System.out.println(n + " is ODD Number");
		}
	}

}
