
public class Cat extends Animal{

	public Cat(String name) {
		super("Cat");
	}

	@Override
	public void eat() {
		System.out.println("Tôi ăn cá");
	}

	@Override
	public void makeSound() {
		System.out.println("Meow Meow");
	}
	

}
