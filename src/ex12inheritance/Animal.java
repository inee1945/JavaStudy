package ex12inheritance;

public class Animal {
	private String species;
	int age;
	String gender;
	
	public Animal(String species, int age, String gender) {
		this.species = species;
		this.age = age;
		this.gender = gender;
	}
	
	public String getbark() {
		return species;
	}
	public void showAnimal() {
		System.out.println("동물의 종류는"+ species);
		System.out.println("동물의 나이는"+age);
		System.out.println("동물의 성별은"+gender);
	}
	
}
