package ex02variable;

public class E02SilsuType {

	public static void main(String[] args) {
		/*
		 실수자료형
		 - 정수형보다는 실수형자료가 큼 
		 - 정수와 실수를 연산하면 실수형으로 .
		 */
		long long1=100;
		float float1 = 200;
		float result1= long1 / float1;
		System.out.println(result1);
		
		long result2=long1 + (long)float1;
		System.out.println("형변환 후 연산 = "+ result2);
		
		long result3 = (long)(long1+float1);
		System.out.println("계산 후 형변환 " +result3);
		float f3 = 100;
		float f4 = 3.14f;
		float f = (float)3.14;
		
		float f5= 3.14F;
		float f6= f3+f4;
		double d1=3.14;
		double d2 = f6+d1;
		System.out.println(f6);
		System.out.println(d1);
		System.out.println(d2);
	}

}
