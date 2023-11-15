
public class Animal {
	protected String name; //Khai báo protect thì lớp con sử dụng được

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("Im eating");
	}
	
}
