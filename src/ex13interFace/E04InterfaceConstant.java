package ex13interFace;

import java.util.Scanner;


public class E04InterfaceConstant {

	public static void main(String[] args) {
		System.out.println("가위, 바위 보 게임입니다.");
		System.out.println("선택하세요 정수입력");
		
		Scanner scanner = new Scanner(System.in);
		int sel = scanner.nextInt();
		
		switch(sel) {
		case Game.SCISSORS :
			System.out.println("가위를");
			break;
		case Game.ROCK :
			System.out.println("바위를");
			break;
		case Game.PAPER :
			System.out.println("보를");
			break;
		default:	
			System.out.println("잘못냄");
		}
	}

}
