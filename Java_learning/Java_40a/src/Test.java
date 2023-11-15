
public class Test {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
		System.out.println("----------------");
		BabyDog bbd = new BabyDog();
		bbd.eat();
		bbd.bark();
		bbd.weep();
	}
}
