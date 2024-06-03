package ex07string;

import java.lang.reflect.Array;

public class E03StringBuilderBuffer {

	public static void main(String[] args) {
		StringBuffer strBuf = new StringBuffer("AB");
		strBuf.append(25);
		strBuf.append("y").append(true);
		System.out.println("strBuf= " + strBuf);

		strBuf.insert(2, false);
		strBuf.insert(strBuf.length(), 'Z');
		System.out.println("strBuf= " + strBuf);

		System.out.println("String 과 StringBuffer의 " + "참조값비교");
		String str1 = "Java&JSP";
		String str2 = "Java&JSP";
		if(str1==str2)System.out.println("연결정 주소값동일");
		else System.out.println("연결정 주소값 다름");
		System.out.println(System.identityHashCode(str1));
		
		str1 = str1+"&Spring";
		System.out.println(System.identityHashCode(str1));
		if(str1==str2)System.out.println("연결정 주소값동일");
		else System.out.println("연결정 주소값 다름");
		
		StringBuffer string1 = new StringBuffer("ABC");
		
		System.out.println(System.identityHashCode(string1));
		
		string1 = string1.append(false);
		
		System.out.println(System.identityHashCode(string1));
		
	//	System.out.println(Array.toString(string1));
	//	type(string1)
		
		//str1 = str1. + "&Spring";
	//	if(string1==string2)System.out.println("연결정 주소값동일");
	//	else System.out.println("연결전 주소값 다름");
	}


}
