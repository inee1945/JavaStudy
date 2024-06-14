package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04MultiCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[3];
		try {
			for(int i =0;i<array.length;i++) {
				System.out.println("array["+ i+"]에 저장할 숫자입력");
				array[i] = Integer.parseInt(sc.nextLine());
			}
			System.out.println("배열에 저장된 두 숫자나누기:"+array[0]/array[1]);
			
			System.out.println("나이를 입력하세요");
			int age = sc.nextInt();
			System.out.println("당신의 나이는 "+age);
			array[3] = age;
		}catch(InputMismatchException e) {
			System.out.println("숫자로만 입력해야 합니다. ");
		}catch(ArithmeticException e) {
			System.out.println("산술연산이 불가능합니다.");
		}catch(NumberFormatException e) {
			System.out.println("숫자형태의 문자만 입력하능");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스를 초과하였습니다. ");
		}catch(Exception e) {
			System.out.println("예외가 발생했습니다. ");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
System.out.println("==program끝====");
	}

}
