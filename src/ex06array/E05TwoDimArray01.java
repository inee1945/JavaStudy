package ex06array;

import java.util.Arrays;

public class E05TwoDimArray01 {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2},
				{3,4,5},
				{6,7,8,9}
		};
		int []arr2 = new int [5];
		arr2[0]=1;
		
		System.out.println("배열의 세로크기"+arr.length);
		System.out.println("배열명이 가진값 출력"+arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d행의크기:%d\n",i,arr[i].length);
			System.out.printf("%d행의 출력: %s\n",i,Arrays.toString(arr[i]));
			
		}
		System.out.println(Arrays.deepToString(arr));
		System.out.println("배열 출력하기");
		System.out.println(arr[0][1]);
		//System.out.println(arr[0][3]);
	}

}
