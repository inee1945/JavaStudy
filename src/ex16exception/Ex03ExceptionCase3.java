package ex16exception;

import java.io.IOException;

public class Ex03ExceptionCase3 {

	static void compileFunc() throws IOException {

		System.out.println("하나의 문자를 입력하세요");
		int userChr = System.in.read();
		System.out.println("입력한 문자는 :" + (char) userChr);

	}

	public static void main(String[] args) {
		try {
				compileFunc();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
