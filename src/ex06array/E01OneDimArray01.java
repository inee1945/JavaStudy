package ex06array;

import java.util.Arrays;

public class E01OneDimArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[3];
		numArr[0]=10;
		numArr[1]=20;
		numArr[2]=30;
		System.out.println("nmuArr의 0번방의 값"+numArr[0]);
		System.out.println("nmuArr의 0번방의 값"+numArr[0]);
		System.out.println("nmuArr의 0번방의 값"+numArr[0]);
		System.out.println("nmuArr의 0번방의 값"+numArr[0]);
		System.out.println("nmuArr의 0번방의 값"+numArr[0]);
		
		System.out.println(numArr);
		System.out.println(Arrays.toString(numArr));
		
		int[] arrNumber = new int[40];
		for(int i =0;i<arrNumber.length;i++) {
			arrNumber[i] = i+1;
			System.out.println(arrNumber[i]);
			
		}
		System.out.println(Arrays.toString(arrNumber));
		
		String[]  strArr = new String[3];
		strArr[0]="java";
		strArr[1]="jsp";
		strArr[2]="spring";
		for(int j=0;j<strArr.length;j++) {
			System.out.println(strArr[j]);
		}
 	}

}
