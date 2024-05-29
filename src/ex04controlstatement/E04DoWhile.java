package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

public class E04DoWhile {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		int kor,eng,math , avg;
		int exitCode;
		do {
			System.out.println("국어점수입력");
			kor = scanner.nextInt();
			System.out.println("영어점수입력");
			eng = scanner.nextInt();
			System.out.println("수학점수입력");
			math = scanner.nextInt();
			
			avg = (kor+eng+math)/3/10;
			
			switch(avg) {
			case 10: case 9 :
			System.out.println("A학점");
				break;
			case 8: 
				System.out.println("B학점");
					break;
			case 7: 
				System.out.println("C학점");
					break;
			default : 
				System.out.println("F학점");
			}
			System.out.println("종료하려면 xX를 입력하세요");
			System.out.println("종료하려면 아무티나 눌러요");
			exitCode =System.in.read();
		}
		while(!(exitCode=='x'||exitCode=='X'));
		
		System.out.println("시험잘봤다.");
	}

}
