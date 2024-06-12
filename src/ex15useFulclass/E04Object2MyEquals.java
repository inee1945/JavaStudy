package ex15useFulclass;

class IntNumber{
	int num;
	public IntNumber(int num) {
		this.num=num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num==((IntNumber)obj).num) {
			return true;
		}else {
			return false;
		}
	}
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
//	}
	
//	public boolean myEquals(IntNumber numObj) {
//		if(this.num==numObj.num) {
//			return true;
//		}else {
//			return false;
//		}
//	}
}
public class E04Object2MyEquals {

	public static void main(String[] args) {
		String str1 = new String("개발자");
		String str2 = "개발자";
		
		if(str1.equals(str2)) {
			System.out.println("같은문자열입니다.");
		}else {
			System.out.println("다른문자열입니다. ");
		}
		
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(20);
		IntNumber num3 = new IntNumber(10);
		
		if(num1.equals(num2)) {
			System.out.println("num1과 num2는 동일한 정수");
		}else {
			System.out.println("num1과 num2는 다른 정수");
		}
		if(num1.equals(num3)) {
			System.out.println("num1과 num3는 동일한 정수");
		}else {
			System.out.println("num1과 num3는 다른 정수");
		}
		
	}

}
