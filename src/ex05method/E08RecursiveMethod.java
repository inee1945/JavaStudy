package ex05method;

public class E08RecursiveMethod {

	static int factorial(int num) {
		int result;
		if(num==1) {
			 result= 1;
		}else {
			result = num*factorial(num-1);
		}
		System.out.println("계산과정:mum="+num+",rusult ="+result);
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("팩토리얼구하기");
		System.out.println("4팩토리얼"+factorial(4));
		System.out.println("10팩토리얼"+factorial(10));
	
	}

}
