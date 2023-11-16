
public class Dog extends Animal {

	public Dog(String name) {
		super("Dog");
	}

	@Override
	public void eat() {
		System.out.println("Tôi ăn xương");
	}

	@Override
	public void makeSound() {
		System.out.println("Gau gâu");
	}

}
