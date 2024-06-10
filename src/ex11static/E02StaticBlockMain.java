package ex11static;

public class E02StaticBlockMain {
 
	int instanceVar;
	void instanceMethod() {}
 
	static int staticVar;
	static void staticMethod() {
		int localVar;
		System.out.println("정적메소드");
	}
 
	static {
 
		staticVar = 1000;		
		//블럭내에서만 사용할수 잇는 변수로 ,블럭내에서는 일반변수를 생성한 후 사용한다.
		int localVar444;
		localVar444 = 2000;
		System.out.println("localVar="+ localVar444); 
		
		//static블록에서는 인스턴스형맴버를 사용못함
	//	System.out.println("instanceVar="+ instanceVar);  
	//	instanceMethod();
 
		System.out.println("staticVar="+ staticVar);
		staticMethod();
		
		System.out.println("===static block 끝===");
	}
 
	public E02StaticBlockMain() {
 
		staticVar = -1;
		System.out.println("==StaticBlock의 생성자==");
	}
	public static void main(String[] args) {
		
		System.out.println("==메인메소드==");		
	 
	//	System.out.println("localVar="+ localVar);
		 
		new E02StaticBlockMain();
	}
}
