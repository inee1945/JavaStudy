package ex05method;

public class QuFindPrimeNumber {

	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int num) {
		boolean bool = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				bool = false;
				break;
			}
		}
		return bool;

	}

}
