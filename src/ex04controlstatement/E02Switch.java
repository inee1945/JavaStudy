package ex04controlstatement;

import java.util.Scanner;

public class E02Switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.ㅣ");
//		int iNum = scanner.nextInt();
//		System.out.println("입력한 숫자는"+iNum);
//		
//		int remain = iNum %3;
//		
//		switch(remain) {
//		case 0 : 
//			System.out.println("나머지는 0입니다.");
//			break;
//		case 1 : 
//			System.out.println("나머지는 1입니다.");
//			break;
//		default : 
//			System.out.println("나머지는 2입니다.");
//			
//		}
		int i = 5;
		switch(7) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
			System.out.println("여름");
			break;
		}
//		시나리오] 국,영,수 점수의 평균값을 구하여 학점을 출력하는
//		프로그램을 작성하시오. 90점이상은 A학점...
//		60점 미만은 F학점을 출력하면 된다. 
//		단, switch문으로 작성하시오. 
		
		int kor=65, eng=70, math=75;
		int avg=(kor+eng+math)/3;
		int avg2 = avg/10;
		System.out.println(avg2);
		switch(avg2) {
		case 1: case 2: case 3: case 4: case 5: case 6: 
			System.out.println("F학점");
			break;
		case 7: case 8:
			System.out.println("B학점");
			break;	
		case 9: case 10:
			System.out.println("A학점");
			break;
		
		}

	}

}
