package ex12inheritance;

class Myparent{
	int parentMember;
	void parentMethod() {
		System.out.println("부모의 메소드:parentMethod()");
	}
}
class MyChild extends Myparent{
	int childMember;
	void childMethod() {
		System.out.println("자식의메소드 : childMethod()");
	}
	@Override
	void parentMethod() {
		//super.parentMethod();
		System.out.println("자식에서 Overriding한 메소드"+ "ParentMethod()");
	}
	void parentMethod(int childMember) {
		this.childMember=childMember;
		System.out.println("오버로딩;자식에서 확장한 메소드");
	}
}

public class E11Polymorphism {

	public static void main(String[] args) {
		Myparent parent = new MyChild();
		parent.parentMethod();
		
//		MyChild myChild = new MyChild();
//		myChild.childMethod();
//		myChild.parentMethod();
		
//		Myparent parent1= myChild;
//		parent1.parentMethod();
		
//		Myparent myParent = new MyChild();
//		myParent.parentMethod();
//		((MyChild)myParent).childMethod();
//		((MyChild)myParent).parentMethod();
//		
//		MyChild child2 =(MyChild)myParent;
//		child2.childMethod();
//		child2.parentMethod();
		
		Object object = new MyChild();
		((Myparent)object).parentMethod();
		((MyChild)object).parentMethod();
	}

}
