
public class Test {
	public static void main(String[] args) {
		Date date1 = new Date(03, 10, 1998);
		Date date2 = new Date(15, 03, 2001);
		Date date3 = new Date(18, 06, 2004);

		Author author1 = new Author("nguyen trung thanh", date1);
		Author author2 = new Author("nguyen thi ngoc lan", date2);
		Author author3 = new Author("nguyen thi kim ngan", date3);

		Book b1 = new Book("Hai phong", 500, 2023, author1);
		Book b2 = new Book("Di Linh", 600, 2023, author2);
		Book b3 = new Book("Hai phong", 300, 2004, author3);

	}

}
