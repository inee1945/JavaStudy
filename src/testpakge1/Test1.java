package testpakge1;

import java.awt.Window.Type;

class TestClass{
	
	String str,str2;
	TestClass(String str, String str2){
		this.str=str;
		this.str2=str2;
	}
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer inta = 10;
		String a = "10";
		
		boolean bool = inta.equals(a);
		System.out.println(inta.getClass().getName());
		System.out.println(a.getClass().getName());
		
		String s1 = "abc";
		String s2 = new String("abc");
	
		TestClass tc =new  TestClass(s1,s2);	
		boolean bool2 = tc.str.equals(tc.str2);
		System.out.println(bool2);
		
	}

	
}
