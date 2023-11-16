
public class Test {
	public static void main(String[] args) {
		System.out.println("Test Dog: ");
		Dog d = new Dog("Bull");
		d.eat();
		d.makeSound();
		d.sleep();
		System.out.println("Test Cat: ");
		Cat c = new Cat("Alice");
		c.eat();
		c.makeSound();
		c.sleep();
		
		System.out.println("Test Bird: ");
		Bird b = new Bird("Bob");
		b.eat();
		b.makeSound();
		b.sleep();
	}

}
