package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class AgeErrorException extends Exception {
	public AgeErrorException() {
		super("나이 입력이 잘못 되었습니다.");
	}
}

public class Ex06DeveloperDefine {

	public static void main(String[] args) {
		System.out.println("나이를 입력하세요 :");
		try {
			int age = readAge();
			System.out.println("당신의 나이는 " + age + "살 입니다.");
		} catch (AgeErrorException e) {
			System.out.println("[가가가예외발생]" + e.getMessage());
		}
	}

	public static int readAge()throws AgeErrorException {
		Scanner sc = new Scanner(System.in);
		int inputAge=0;
		try {
			inputAge = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("[나나나예외발생]" + e.getMessage());
			e.printStackTrace();
			System.exit(0);
		}
		if (inputAge < 0) {
			AgeErrorException ex = new AgeErrorException();
			throw ex;
		}
		return inputAge;
	}

}
