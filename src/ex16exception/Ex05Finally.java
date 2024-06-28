package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05Finally {
	
	static void runtime() throws NumberFormatException {
		Integer.parseInt("qor");
	}
	static void tryCatchFinally() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = -1;
		try {
			age=sc.nextInt();
			System.out.println("당신은 5년후 "+(age+5)+"살 입니다");
			return ;
		}catch(InputMismatchException e){
			System.out.println("숫자만 입력하세요");
		}
	}
	public static void main(String[] args)  {
		try {
			runtime();
		}catch(NumberFormatException e) {
			e.printStackTrace();
	}
		tryCatchFinally();
		System.out.println("메인메소드 끝");
	}

}
