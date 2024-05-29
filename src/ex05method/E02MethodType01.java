package ex05method;

public class E02MethodType01 {

	static void menuPrint() {
		System.out.println("=메뉴를 선택하세요.=");
		System.out.println("=열기, 계속 종료 =");
		System.out.println("=======");
	}
	
	static void returnError() {
		int returnValue=11;
		System.out.println("return이전");
		//return;
		if(returnValue%2==0) {
			System.out.println(returnValue+"짝수");
			return ;
		}
			System.out.println(returnValue +"홀수");
		
		}
	
	
	
	
	public static void main(String[] args) {
		
menuPrint();
returnError();
	}

}
