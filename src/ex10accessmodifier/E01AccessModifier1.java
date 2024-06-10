package ex10accessmodifier;

/* 
class를 정의할땐 public 과 기본 default클래스만 사용가능
 */

//private class PrivateClass1{
//	void myFunc() {
//		System.out.println("private클래스는??");
//	}
//}

class DefaultClass1{
	int jjj =88;
	void myFunc() {
		System.out.println("DefaultClass클래스의 myFunc메소드 호출");
		
	}
}



public class E01AccessModifier1 {
	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	private void privateMethod() {
		privateVar = 100;
		System.out.println("프라이빗메소드 호출");
	}
	void defaultMethod() {
		privateVar=200;
		System.out.println("디폴트메소드 호출");
	}
	public void publicMethod() {
		privateVar=300;
		System.out.println("퍼블릭메소드 호출");
		privateMethod();
	}
}
