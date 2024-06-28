package ex17collection;

import java.util.Objects;
import java.util.Scanner;
import java.util.HashSet;

class Avengers {
	String name;
	String heroName;
	String weapon;

	public Avengers(String name, String heroName, String weapon) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", " + "능력=" + weapon + "]";
	}

	@Override
	public int hashCode() {
		int result = Objects.hash(this.name.hashCode(), this.heroName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Avengers aven = (Avengers) obj;
		if (this.name.equals(aven.name) && this.heroName.equals(aven.heroName)) {
			return true;
		}
		return false;
	}
}

public class QuHashSet {

	public static void main(String[] args) {

		HashSet<Avengers> set = new HashSet<Avengers>();

		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");

		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);

		System.out.println("[최초 전체 정보출력]");
		for (Avengers av : set) {
			System.out.println(av.toString());
		}
		System.out.println("검색할 이름을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		int sucess = -1;
		for (Avengers hero : set) {
			if (hero.name.equals(name)) {
				System.out.println("요청하신 정보를 찾았습니다.");
				System.out.println(hero);
				sucess = 1;
				break;
			}
		}
		if(sucess==-1) {
		System.out.println("찾는 영웅이 업습니다.");
		}
	}

}
