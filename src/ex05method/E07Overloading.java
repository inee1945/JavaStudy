package ex05method;

public class E07Overloading {
	
	static void person(int juminNum, int milNum) {
		System.out.println("군필자시군요");
		System.out.println("주민번호"+juminNum);
		System.out.println("군번"+milNum);
	}

	static void person(int juminNum) {
		System.out.println("미필이거나 여성이시군요");
		System.out.println("주민번호"+juminNum);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person(987654);
		person(12345,64780);
	System.out.println();
	}
	
	
}
