import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) {

		// Hàm lấy thời gian hiện tại
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			System.out.println("TEST: " + i);
		}
		long t2 = System.currentTimeMillis();
		System.out.println("Trước khi chạy for: " + t1);
		System.out.println("Sau khi chạy for: " + t2);
		System.out.println("Thời gian: " + (t2 - t1) + "mls");
		System.out.println("Thời gian: " + ((t2 - t1) / 1000) + "s");
		
		// Hàm TimeUnit
		System.out.println("3000 năm = " + TimeUnit.DAYS.toSeconds(3000*365) + "s");
		System.out.println("30h = " + TimeUnit.HOURS.toSeconds(25) + "s");
		
		// Date
		Date d = new Date(System.currentTimeMillis());
		System.out.println(d.getDate() + "/" + (d.getMonth() + 1) + "/" + (d.getYear() + 1900));

		//Calendar
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE) + "-"+ (c.get(Calendar.MONTH) + 1)+ "-" + c.get(Calendar.YEAR));
		
		c.add(Calendar.HOUR, 30);
		System.out.println("Sau khi đã cộng thêm 30h: " + c.get(Calendar.DATE) + "-"+ (c.get(Calendar.MONTH) + 1)+ "-" + c.get(Calendar.YEAR));
		
		//DateFormat
		DateFormat df = new SimpleDateFormat(); // Sẽ tạo ra kiểu format mặc định
		System.out.println(df.format(d));
		
		df = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		System.out.println(df.format(d));
		
		
		
		
		
	}
}
