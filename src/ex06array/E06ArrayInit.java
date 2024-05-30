package ex06array;

import java.util.Arrays;

public class E06ArrayInit {

	public static void main(String[] args) {
		System.out.println("배열 선언 후 초기화 하지 않은상태");
		int[] arr = new int[3];
		System.out.println(Arrays.toString(arr));
		int[][] arr2 = new int[3][4];
		System.out.println(Arrays.deepToString(arr2));
		
		String [] arrd = {"superman","batman","aquaman"};
		System.out.println("1차 초기화"+Arrays.toString(arrd));
		String[][] arrd2 ={ {"superman"},
				{"batman","aquaman"}
		};
		System.out.println(Arrays.deepToString(arrd2));
	}

}
