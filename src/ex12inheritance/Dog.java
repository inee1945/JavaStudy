package ex12inheritance;

public class Dog extends Animal {
	String dogKind;
	String name;

	public Dog(String species, int age, String gender, String dogKind, String name) {
		super(species, age, gender);

		this.dogKind = dogKind;
		this.name = name;
	}

	void bark() {
		System.out.println("이름은" + name + "이고 종류는" + super.getbark() + "이다");

	}

	public void showDog() {

	}
}
