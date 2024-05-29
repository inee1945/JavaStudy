package ex05method;

import java.util.Scanner;

public class E04MethodType03_1 {

	
	
	static int intSum() {
		int s,e;
		int sum=0 ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("시작숫자입력");
		s = scanner.nextInt();
		System.out.println("끝숫자입력");
		e = scanner.nextInt();
		
		for(int i = s;i<=e;i++) {
			sum+=i;
		}
		return sum  ;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intSum());
	}

}
