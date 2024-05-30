package ex06array;

import ex01start.E02SystemOutPrintln;

public class E02ArrayAndMethod {

	
	public static void main(String[] args) {
		int[]  arr= {1,2,3,4,5};
		int[] ref;
		
		System.out.println("초기화 직후 출력");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		ref= addAllArray(arr,7);

	}
	static int[] addAllArray(int[] ar,int addVal) {
		for(int i=0;i<ar.length;i++) {
			ar[i]+=addVal;
		}
		return ar;
	}

}
