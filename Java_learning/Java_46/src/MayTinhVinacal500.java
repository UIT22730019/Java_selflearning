
public class MayTinhVinacal500 implements MayTinhBoTuiInterface{

	@Override
	public double cong(double a, double b) {
		return a+b;
	}

	@Override
	public double tru(double a, double b) {
		return a-b;
	}

	@Override
	public double nhan(double a, double b) {
		return a*b;
	}

	@Override
	public double chia(double a, double b) {
		double ketQua = 0;
		try {
			if (b != 0) {
				ketQua = a / b;
			}
			else {
				System.out.println("Division by zero is not allowed");
			}
		} catch (Exception e) {
			System.out.println("Erorr !!!!" + e.getMessage());
		}
		return ketQua;
	}

}
