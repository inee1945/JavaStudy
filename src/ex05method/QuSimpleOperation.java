package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {

	public static void main(String[] args) {
		int num1,num2;
		Scanner scanner =new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		num1=scanner.nextInt();
		if(num1<1) {
			System.out.println("1 이상의 정수를 입력하세요");
			return ;
		}
		
		System.out.println("두번째 숫자를 입력하세요");
		num2=scanner.nextInt();
		if(num2<1) {
			System.out.println("1 이상의 정수를 입력하세요");
			return ;
		}
		plus(num1,num2);
		minus(num1,num2);
		multipl(num1,num2);
		divide(num1,num2);
		mod(num1,num2);
		
	}
	
	static void plus(int num1, int num2) {
		
		System.out.println( num1+num2);
	}
	static void minus(int num1, int num2) {
		System.out.println (num1-num2);
	}

	static void multipl(int num1, int num2) {
		System.out.println (num1*num2);
	}

	static void divide(int num1, int num2) {
		System.out.println (num1/num2);
	}
	static void mod(int num1, int num2) {
		System.out.println (num1%num2);
	}



}
