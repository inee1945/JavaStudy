package ex07string;

import java.util.Scanner;

public class QuValidateId {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자입력");
		int num = scanner.nextInt();

		fibonacciProgression1(num);
		fibonacciProgression2(num);
	}

	public static void fibonacciProgression1(int num) {
		if(num<=2) {
			System.out.println("피보나치 ㅣ수열은 3부터 입력해주세요");
			return ;
		}
	}

	public static void fibonacciProgression2(int num) {
		if(num<=2) {
			System.out.println("피보나치 ㅣ수열은 3부터 입력해주세요");
			return ;
		}
	}

}
