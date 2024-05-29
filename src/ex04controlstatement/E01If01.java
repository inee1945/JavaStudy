package ex04controlstatement;

import java.io.IOException;
import java.util.logging.Logger;

public class E01If01 {

	public static void main(String[] args)throws IOException {
		int num =10;
//		if(num%2) {
//			System.out.println("잘못된 조건식 입니다.");
//		}
//		if(num) {
//			System.out.println("이것도 잘못된 조건식입니다.");
//		}
		if(num%2==0) {
			System.out.printf("%d는 짝수입니다. ",num);
		}
		if(num%2==0 &&num>=10) {
			System.out.printf("%d는 짝수입니다. ",num);
		}
		if(true) {
			System.out.println("실행. ");
		}
		if(num%2!=0) {
			System.out.printf("%d는 홀수입니다. ",num);
		}
		if(num%2==0) {
			System.out.printf("%d는 짝수입니다. ",num);
		}
		if(num%2==0) {
			System.out.printf("%d는 짝수입니다. ",num);
		}
		
		/*
		시나리오] 사용자가 입력한 문자가 숫자인지 판단하는 프로그램을 if문을 이용해서 작성하시오.
		참조) System.in.read() : 키보드를 통해 입력한 문자의 아스키코드를 정수형으로 반환하는 메서드. 두글자 이상 입력하더라도 첫번째 문자만 입력된다.  
		 */


		System.out.print("하나의문자입력");
	
		int asciiCode = System.in.read();
		System.out.println("입력한문자는"+asciiCode);
		if(asciiCode>=48 && asciiCode<=57) {
			System.out.println("입력한문자가 숫자다");
		}else {
			System.out.println("입력한문자가숫자가 아니다");
		}
		System.out.println("입력한문자는"+asciiCode);
		if(asciiCode>='0' && asciiCode<='9') {
			System.out.println("입력한문자가 숫자다***");
		}else {
			System.out.println("입력한문자가숫자가 아니다***");
		}
	}

}
