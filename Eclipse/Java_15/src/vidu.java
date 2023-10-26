import java.util.Scanner;

public class vidu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Value input a = ");
		a = sc.nextInt();
		
		String result = (a%2==0)?"Even number":"Odd number";
		System.out.println(a +"a is: "+ result);
	}

}
