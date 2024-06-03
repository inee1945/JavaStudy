package ex08class;

class Person {
	String name = "정우성";
	int age = 50;
	String gender = "남자";
	String job = "영화배우";

	void eat() {
		System.out.printf("%s가 식사를 한다\n", name);
	}

	void sleep() {
		System.out.printf("%s가 잠을 자고있다", name);
	}
}

public class E01PersonMain {
	public static void main(String[] args) {

		Person person = new Person();
		int age1 = person.age;
		person.eat();
		person.sleep();
		System.out.println("\n"+new Person());
		System.out.println("\n=========================");
		new Person().eat();
		new Person().sleep();

	}
}
