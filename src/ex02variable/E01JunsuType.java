package ex02variable;

public class E01JunsuType {

	public static void main(String[] args) {
		int int1 =100;
		int int2=200;
		int result1 = int1+int2;
		System.out.println("int2 + int1=" + result1);
		result1 = int1/int2;
		System.out.println("int1/int2=" + result1);
		
		
		//int 형보다 작은 변수를 연산하면 cpu는 int형으로 변환하여 계산한다.
		//byte short형은 게임이나 음원파일등을 표현할때 사용
		byte byte1 =50 , byte2 = 55;
		int result2= byte1 + byte2;
		System.out.println("byte1+byte2 = " + result2);
		short short1 =60, short2 = 70;
		int result3 = short1 + short2;
		System.out.println("short1+short2= "+ result3);
		
		long long1 =1000, long2=2000;
		long result4 = int1+long1;
		System.out.println("int1+long1= "+ result4);
		
		result4=long1 + long2;
		System.out.println("long1+long2= " +result4);
		
	
//	자바컴파일러는 정수형 상수를 기본적으로 int형으로 간주함..args 하지만 아래 숫자는 int형을 넘어서기 때문에 에러발생
//	그래서 접미사에 L or l을 붙여서 long타입이라고 컴파일러에게 알려줌
		//long long3= 2200000000;
		long long4= 2200000000L;
		long long5= 2200000000L;
		System.out.println(long4);
	}

}
