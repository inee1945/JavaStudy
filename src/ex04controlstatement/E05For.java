package ex04controlstatement;

public class E05For {
	
	public static void main(String[] args) {
//		int sum = 0;
//		
//		for(int i=0;i<=100;i++) {
//			sum +=i;
//		}
//		System.out.println(sum);

		for(int i=2;i<=9;i++) {
			if(i%2==0)continue;
			if(i>7)break;
			for(int j=1;j<=9;j++) {
				
				System.out.printf("%d*%d=%2d   ",i,j,i*j);
			}
			System.out.println();
		}

//		for(int i=1;i<=4;i++) {
//			for(int j =1;j<=4;j++) {
//				if(i==j) {
//					System.out.print(1);
//				}else {
//					System.out.print(0);
//				}
//			}
//			System.out.println();
//		}
//		int i = 1;
//		int sum = 0;
//		int sum2 = 0;
//
//		for (;;) {
//			i++;
//			if(i%2!=0)continue;
//			
//			sum += i;
//			
//			if(sum > 1000)break;
//			
//			System.out.println(i);
//		}
//		System.out.println(sum);
	}
}
