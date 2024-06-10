package ex12inheritance;

import ex12inheritance.map.Korea;

class Seoul extends Korea{
	private String city;
	public Seoul(String name, String city) {
		super(name);
		this.city = city;
	}
	public void callmethod() {
		super.publicMethod("callMethod->");
		super.protectMethod("callMethod->");
	//	super.defaultMethod();
	//	super.privateMethod();
	}
}
public class E02ProtectedInheritanceMain {

	public static void main(String[] args) {
	
		Seoul seoul = new Seoul("대한민국", "서울");
		seoul.callmethod();
	}

}
