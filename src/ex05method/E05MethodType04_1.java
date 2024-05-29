package ex05method;

import java.util.Scanner;

public class E05MethodType04_1 {

	public static void main(String[] args) {
		int sumOfAge = getTotalAge(3);
		System.out.println("입력받은 나이 합은?"+sumOfAge);

	}
	
	static int getTotalAge(int cnt) {
		Scanner scanner =new Scanner(System.in);
		int sumAge =0;
		for(int i=1;i<=cnt;i++) {
			System.out.println(i+"번째 사람 나이입력");
			sumAge += scanner.nextInt();
		}
		
		return sumAge;
	}

}
