
public class Test {
	public static void main(String[] args) {
		MyDate md = new MyDate(31, 2, 2021);
		System.out.println("Day: " + md.getDay());
		
		
		md.setDay(10);
		System.out.println("Day: " + md.getDay());
		md.setDay(55);
		System.out.println("Day: " + md.getDay());

	}

}
