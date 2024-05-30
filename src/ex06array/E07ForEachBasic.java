package ex06array;

public class E07ForEachBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,2, 3, 4, 5, 6,7,8,9,10 };
		int sum = 0;
		for (int c : arr) {
			sum+=c;
		}
		System.out.println(sum);
	}

}
