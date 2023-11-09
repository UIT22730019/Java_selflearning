
public class Test {
	
	public static void main(String[] args) {
		QuocGia qg1 = new QuocGia("USA", "My");
		QuocGia qg2 = new QuocGia("VNA", "VietNam");
		QuocGia qg3 = new QuocGia("CN", "TrungQuoc");
		
		HangSanXuat hang1 = new HangSanXuat("Apple", qg1);
		HangSanXuat hang2 = new HangSanXuat("Bphone", qg2);
		HangSanXuat hang3 = new HangSanXuat("xiaomi", qg3);
		
		NgaySanXuat ngay1 = new NgaySanXuat(15, 03, 2001);
		NgaySanXuat ngay2 = new NgaySanXuat(03, 10, 1998);
		NgaySanXuat ngay3 = new NgaySanXuat(17, 03, 1975);
		
		MayTinh may1 = new MayTinh(hang1, ngay1, 15000000, 2);
		MayTinh may2 = new MayTinh(hang2, ngay2, 30000000, 1);
		MayTinh may3 = new MayTinh(hang3, ngay3, 10000000, 2);
		
		//Cau 1
		System.out.println("ten QuocGia 1 : " + may1.layTenQuocGia());
		System.out.println("ten QuocGia 2 : " + may2.layTenQuocGia());
		System.out.println("ten QuocGia 3 : " + may3.layTenQuocGia());
		System.out.println("---------------------------------------");
		//Cau 2
		System.out.println("Gia ban MT1 va MT2: "+ may1.KiemTraGiaBanMayTinh(may2));
		System.out.println("Gia ban MT1 va MT3: "+ may1.KiemTraGiaBanMayTinh(may3));
		System.out.println("Gia ban MT2 va MT3: "+ may2.KiemTraGiaBanMayTinh(may3));
	}

}
