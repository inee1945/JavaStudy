package ex16exception;

import java.io.IOException;

public class Ex01ExceptionBasic1 {

	public static void main(String[] args) {
	//	Int number = 10;
		
		int number = 10;
		if(true) {
			System.out.println("참이다");
		}else {
			System.out.println("거짓이다.");
		}
		System.out.println("하나의 문자를 입력하세요");
		try {
			int iChar = System.in.read();
			System.out.println("완료");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
