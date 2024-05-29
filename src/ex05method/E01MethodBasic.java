package ex05method;

import java.util.Scanner;

public class E01MethodBasic {

	public static int simpleFunc(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void menuPrint() {
		System.out.println("당신의 이름은 무엇입니까");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		namePrint(name);
	}

	public static void namePrint(String n) {
		System.out.println("제 이름은" + n + "입니다");
	}

	public static void main(String[] args) {
		int result = simpleFunc(1, 2);
		System.out.println(result);
		System.out.println(simpleFunc(10, 10));
		menuPrint();

	}

}
