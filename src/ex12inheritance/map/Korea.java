package ex12inheritance.map;

public class Korea {
	private String name;
	public Korea(String name) {
		this.name = name;
	}
	public void publicMethod(String loc) {
		System.out.println(loc + "publicMethod호출");
		defaultMethod("publicMethod->");
	}
	
	public void protectMethod(String loc) {
		System.out.println(loc + "protectMethod호출");
		privateMethod("[protectMethod->");
	}
	
	 void defaultMethod(String loc) {
		System.out.println(loc + "defaultMehtod호출");
		
	}
	
	public void privateMethod(String loc) {
		System.out.println(loc + "privateMethod호출");
		
	}
	
}
