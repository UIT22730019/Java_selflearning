package test;

public enum Month {
	January (31), 
	February(28),
	March(31), 
	April(30), 
	May(31),
	June(30),
	July(31),
	August(31),
	September(30),
	October(31),
	November(30), 
	December(31);
	
	private final int numberDay;
	//Tao ra 1 contructor
	Month (int numberDay){
		this.numberDay = numberDay;
	}
	//Tạo ra 1 hàm để lấy ra số ngày mà không cần tạo hàm set và get
	public int numberDay() {
		return numberDay;
	}
}
