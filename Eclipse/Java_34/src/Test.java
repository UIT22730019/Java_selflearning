
public class Test {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(31, 2, 2022);
		MyDate md2 = new MyDate(11, 1, 2062);
		MyDate md3 = new MyDate(31, 2, 2022);
		System.out.println(md1);
		System.out.println(md2);
		System.out.println(md3);
		
		System.out.println("md1 so sanh bang md2: " + md1.equals(md2));
		System.out.println("md1 so sanh voi md3: " + md1.equals(md3));
		
	}

	
	
	
}
