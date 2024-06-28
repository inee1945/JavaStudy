package test;

public class Exe2 {

	public static void main(String[] args) {
		int a =5;
		int b =6;
		String s1 = new String("Hello");
		String s2 = new String("Hello");

		System.out.println(s1 == s2); // 주소 비교 false
		System.out.println(s1.equals(s2)); // 값 비교 true
		
		System.out.println(s1.equals(s2)); // 값 비교 true
	
		
	}

}
