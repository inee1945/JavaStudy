package ex10accessmodifier;

import ex10accessmodifier.sub.E01AccessModifier2;

public class E01AccessModifierMain {

	public static void main(String[] args) {
		System.out.println("E01AccessModifier1 객체 생성 및 접근");
		E01AccessModifier1 one = new E01AccessModifier1();
		
	//	System.out.println("one.privateVar"+one.privateVar);
		System.out.println("one.defualtVar"+one.defaultVar);
		System.out.println("one.publicVar"+one.publicVar);
		
//		one.privateMethod();
		one.defaultMethod();
		one.publicMethod();
		
		System.out.println("디폴트클래서 객체생성 및 접근");
		DefaultClass1 kkkk = new DefaultClass1();
		kkkk.myFunc();
		
		new DefaultClass1().myFunc();

		
		System.out.println("E01AccessModifier2 객체 생성 및 접근");
		E01AccessModifier2 two = new E01AccessModifier2();
		
//		System.out.println("two.privaeVar="+two.privateVar);
//		System.out.println("two.default="+two.defaultVar);
		System.out.println("two.public="+two.publicVar);

//		two.privateMethod();
//		two.defaultMethod();
		two.publicMethod();
		
		System.out.println("DefaultClass 객체 생성 및 접근");
		
	//	new DefaultClass2().myFunc();
	}

}
