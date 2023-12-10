
public class Test {
	public static void main(String[] args) {
		System.out.println("Test câu a: ");
		MaytinhCasioFX500 mtfx500 = new MaytinhCasioFX500();
		MayTinhVinacal500 mtvncal = new MayTinhVinacal500();

		System.out.println("phép cộng: MaytinhCasioFX500: 5+4: " + mtfx500.cong(5, 4));
		System.out.println("phép cộng:MayTinhVinacal500: 7+4: " + mtvncal.cong(7, 4));
		System.out.println("phép trừ:MaytinhCasioFX500: 5-4: " + mtfx500.tru(5, 4));
		System.out.println("phép trừ:MayTinhVinacal500: 7-4: " + mtvncal.tru(7, 4));
		System.out.println("phép nhân:MaytinhCasioFX500: 5*4: " + mtfx500.nhan(5, 4));
		System.out.println("phép nhân:MayTinhVinacal500: 7*4: " + mtvncal.nhan(7, 4));
		System.out.println("phép chia:MaytinhCasioFX500: 5/4: " + mtfx500.chia(5, 4));
		System.out.println("phép chia:MayTinhVinacal500: 7/4: " + mtvncal.chia(7, 4));
		System.out.println("phép chia trường hợp đặc biệt:MaytinhCasioFX500: 6/0: " + mtfx500.chia(6, 0));
		System.out.println("phép chia trường hợp đặc biệt:MayTinhVinacal500: 9/0: " + mtvncal.chia(9, 0));
		
		System.out.println("-----------------------");
		System.out.println("Test câu B");
		double [] arr = new double[] {1,4,6,3,7,5,9,1};
		double [] arr2 = new double[]{7,5,9,1,7,4,6,2};
		
		SapXepChen sxchen = new SapXepChen();
		SapXepChon sxchon = new SapXepChon();
		
		sxchen.SapXepTang(arr);
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+ " ");
		}
		System.out.println();
		sxchon.SapXepGiam(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+ " ");
		}
	}
}
