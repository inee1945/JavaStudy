package testpakge1;

class Person {
	String name;
	public Person(String n) {
		name = n;
	}
	void printInfo() {
		System.out.printf("이름:%s", name);
	}
}

public class AnonymousClass {
	public static void main(String[] args) {		
		Person anonyPerson = new Person("이사람"){
			@Override
			void printInfo() {
				System.out.println("익명클래스에서 오버라이딩");
			}
		};
		anonyPerson.printInfo();
	}
}

