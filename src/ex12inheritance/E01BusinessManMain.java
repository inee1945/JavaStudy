
package ex12inheritance;


class Man {

	private String name;
	private int name2;

	public Man() {
		System.out.println("Man EE HYX 9");
	}

	public Man(String name) {

		this.name = name;
		System.out.println("Man | 9");
	}
	public Man(int name) {

		name2 = name;
		System.out.println("Man | 9");
	}

	public void tellYourName() {
		System.out.println("제이름은" + name + "입니다.");

	}
}

class BusinessMan extends Man {

	private String company;
	private String position;

	public BusinessMan(String name, String company, String position) {
		super(name);
		this.company = company;
		this.position = position;
		System.out.println("BusinessMan");

	}

	public void tellYourInfo() {

		System.out.println("회사명은" + company + "입니다.");

		System.out.println("직급은" + position + "힙니다..");

		System.out.println("이름은입니다.");
		tellYourName();
	}
}

public class E01BusinessManMain {
	public static void main(String[] args) {

		BusinessMan man1 = new BusinessMan("김종칠", "NAVER", "팀장");
		BusinessMan man2 = new BusinessMan("이종칠", "DAUM", "부장");
		man1.tellYourInfo();
		man1.tellYourName();
		man2.tellYourInfo();
		man2.tellYourName();
		
	}
}
