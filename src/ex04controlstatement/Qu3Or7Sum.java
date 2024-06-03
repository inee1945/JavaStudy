package ex04controlstatement;

public class Qu3Or7Sum {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		int sum2 = 0;
//		while (i <= 100) {
//			if (i % 3 == 0 || i % 7 == 0) {
//				sum += i;
//				System.out.println(i);
//			}
//
//			if (i % 3 == 0 && i % 7 == 0) {
//				System.out.println("공배수 :" + i);
//				sum2 += i;
//			}
//
//			i++;
//
//		}
//		System.out.println("while 총합 :" + (sum - sum2));
//		do {
//			if (i % 3 == 0 || i % 7 == 0) {
//				sum += i;
//				System.out.println(i);
//			}
//
//			if (i % 3 == 0 && i % 7 == 0) {
//				System.out.println("공배수 :" + i);
//				sum2 += i;
//			}
//
//			i++;
//		}
//		while(i<100);
//		System.out.println("do while 총합 :" + (sum - sum2));

		for ( i = 1; i <= 100; i++) {
			if (i % 3 == 0 || i % 7 == 0) {
				sum += i;
				System.out.println(i);
			}

			if (i % 3 == 0 && i % 7 == 0) {
				System.out.println("공배수 :" + i);
				sum2 += i;
			}
		
		}
		System.out.println("for 총합 :" + (sum - sum2));
	}
}
