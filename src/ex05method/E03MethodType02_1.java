package ex05method;

public class E03MethodType02_1 {
	static int sum1To10() {
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum +=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sum1To10());
		int sum10 = sum1To10();
		System.out.println(sum10);
	}

}
