package ex15useFulclass;

import java.util.Random;
import java.util.Scanner;

public class E07Random {

	public static void main(String[] args) {
		System.out.println("#가짜난수: 같은 패턴의 난수만 생성됨");
		Random random1= new Random();
		for(int i=0;i<10;i++) {
			System.out.print(random1.nextInt(45)+" ");
		}

		System.out.println("\n#난수생성1 :씨드없음");
		Random random2= new Random();
		for(int i=0;i<10;i++) {
			System.out.print(random2.nextInt(100)+" ");
		}

		System.out.println("\n#난수생성2 :변화하는 시간으로 씨드지정");
		Random random3= new Random();
		random3.setSeed(System.currentTimeMillis());
		for(int i=0;i<10;i++) {
			System.out.print(random3.nextInt(100)+" ");
		}

		System.out.println("\n#난수생성3: nextInt()인수없음");
		Random random4= new Random();
		for(int i=0;i<10;i++) {
			System.out.print(random1.nextInt()+" ");
		}

	Scanner sca = new Scanner(System.in);
int a =	sca.nextInt();
System.out.println(a+1);
	}

}
