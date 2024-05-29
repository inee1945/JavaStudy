package ex05method;

import java.util.Scanner;

public class E05MethodType04_2 {

	public static void main(String[] args) {
		int maxVal=0;
		
		int inputInt[] = inputFn(3);
		
		for (int i : inputInt) {
			if(i>maxVal) {
				maxVal=i;
			}
			
		}
		System.out.println(maxVal);

	}

	static int[] inputFn(int c) {
		int array[] = new int [c];
		Scanner scanner =new Scanner(System.in);
		for(int i = 0;i<c;i++) {
			System.out.println(i+"번째 숫자입력");
			array[i]=scanner.nextInt();
		}
	return array;
	}
	
}
