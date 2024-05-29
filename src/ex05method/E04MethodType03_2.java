package ex05method;

import java.util.Scanner;

public class E04MethodType03_2 {

	public static void main(String[] args) {
		int s , e;
		Scanner scanner = new Scanner(System.in);
		System.out.println("시작");
		s =scanner.nextInt();
		System.out.println("끝");
		e = scanner.nextInt();
		
		make99dan(s,e);

	}

	static void make99dan(int s, int e) {
		for(int i=s;i<=e;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d*%d=%2d  ",i,j,i*j);
			}
			System.out.println();
		}
	}
	
}
