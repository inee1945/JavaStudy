package ex11static;

class MyStatic{
	 int instanceVar;
	static int staticVar;
	
	void instanceMethod() {
		System.out.println("instanceVar="+instanceVar);
		System.out.println("staticVar ="+staticVar);
	}
	static void staticMethod() {
	//	System.out.println("instanceVar="+instanceVar);
		System.out.println("staticVar ="+staticVar);


	}
}

public class E01StaticModifier {

	
	public static void main(String[] args) {
	
		
		MyStatic myStatic = new MyStatic();
		myStatic.instanceVar = 100;
		System.out.println("=="+myStatic.instanceVar);
		myStatic.instanceVar = 200;
		System.out.println("=="+MyStatic.staticVar);
		myStatic.instanceVar = 300;
		System.out.println("=="+myStatic.staticVar);
		
		MyStatic ms1 = new MyStatic();
		MyStatic ms2 = new MyStatic();
		
		ms1.instanceVar = 100;
		ms2.instanceVar = 1000;
		System.out.println("===="+ ms1.instanceVar);
		System.out.println("===="+ ms2.instanceVar);
		
//		ms1.staticVar = 800;
//		ms1.staticVar = 900;
		MyStatic.staticVar = 800;
		MyStatic.staticVar = 900;
		System.out.println("==="+ms1.staticVar);
		System.out.println("==="+ms2.staticVar);
		
		myStatic.instanceMethod();
		myStatic.staticMethod();
		
	//	MyStatic.instanceMethod();
		MyStatic.staticMethod();
	}
	
	

	}
			
