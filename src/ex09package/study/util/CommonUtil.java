package ex09package.study.util;

public class CommonUtil {
	public static boolean isNumber(String strValue) {
		if(strValue.length()==0) {
			return false ;
		}
			
		
		for (int i=0;i<strValue.length();i++) {
			int acode= strValue.codePointAt(i);
			System.out.println("아스키코드"+acode);
			if(!(acode>=48&&acode<=57)) {
				return false;
			}
		}
		return true;
	}
	public static void test() {
		System.out.println("스테틱 테스트");
	}
}
