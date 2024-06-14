package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class AgeErrorException2 extends Exception {
	public AgeErrorException2() {
		super("나이 입력이 잘못 되었습니다.");
	}
}

public class Ex06DeveloperDefine2 {

	public static void main(String[] args) {
		System.out.println("나이를 입력하세요 :");
	
			int age = readAge();
			System.out.println("당신의 나이는 " + age + "살 입니다.");
	
	}

	public static int readAge(){
		Scanner sc = new Scanner(System.in);
		int inputAge=0;
		try {
			inputAge = sc.nextInt();
			
			if (inputAge < 0) {
				throw	 new AgeErrorException2();
				
			}
		}catch (AgeErrorException2 e) {
			System.out.println("[나나나예외발생]");
			e.printStackTrace();
			System.exit(0);
		}catch(InputMismatchException e) {
			e.getMessage();
			e.printStackTrace();
			System.exit(0);
		}
		
		return inputAge;
	}

}
