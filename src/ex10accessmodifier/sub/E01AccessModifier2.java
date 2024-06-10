package ex10accessmodifier.sub;

class DefaultClass2{
	void myFunc() {
		System.out.println("디폴트클래스의 myFunc메소드 호출");
	
	}
}

public class E01AccessModifier2 {
	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	private void privateMethod() {
		privateVar = 400;
		System.out.println("프라이빗메소드 호출");
	}
	void defaultMethod() {
		privateVar=500;
		System.out.println("디폴트메소드 호출");
	}
	public void publicMethod() {
		privateVar=6;
		System.out.println("퍼블릭메소드 호출");
		privateMethod();
	}
	
}
