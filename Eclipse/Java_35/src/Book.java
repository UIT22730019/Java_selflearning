
public class Book {
	
	private String nameBook;
	private double price;
	private int publishYear;
	private Author author;
	
	
	public Book(String nameBook, double price, int publishYear, Author author) {;
		this.nameBook = nameBook;
		this.price = price;
		this.publishYear = publishYear;
		this.author = author;
	}


	public String getNameBook() {
		return nameBook;
	}


	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getPublishYear() {
		return publishYear;
	}


	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}
	
	

}
