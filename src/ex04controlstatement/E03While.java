package ex04controlstatement;

public class E03While {

	public static void main(String[] args) {
//		int i=1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
//		int sum = 0;
//		int j = 1;
//		while(j<=10) {
//			sum +=j;
//			j++;
//			
//		}
//		System.out.println(sum);
		
//		int total = 0;
//		int k = 1;
//		while(k<=100) {
//			if(k%3==0||k%4==0) {
//				total +=k;
//				System.out.println("k="+k);
//			}
//			k++;
//		}
		
//		int x=1;
//		while(x<=4) {
//			int j=1;
//			while(j<=4) {
//				if(x==j) {
//					System.out.print(1);
//				}else {
//					System.out.print(0);
//				}
//				;
//				j++;
//			}
//			System.out.println();
//			x++;
//		}
//		
		int i = 1;
		int sum = 0;
		String str = "";
		while(i<=10) {
			sum +=i;
			if(i!=10) {
				str += i+"+";
			}else {str += i+"=";}
			
			i++;
		}
		System.out.println(str+sum);
	}

}
