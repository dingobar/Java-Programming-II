
public class Dog extends Animal implements NoiseCapable {

	public Dog(String name) {
		super(name);
	}

	public Dog() {
		super("Dog");
	}

	void bark() {
		System.out.println(super.getName() + " barks");
	}

	@Override
	public void makeNoise() {
		bark();
	}

}
