
public class Test {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.out.println(mm.timMin(5, 5));
		System.out.println(mm.timMin(5.5, 6.3));
		System.out.println(mm.tinhTong(10, 254));
		double []arr = new double [] {1,2,3,4,5,6};
		System.out.println("Tinh tong(arr) = " + mm.tinhTong(arr));
	}
}
