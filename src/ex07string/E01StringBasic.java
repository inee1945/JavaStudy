package ex07string;

public class E01StringBasic {

	public static void main(String[] args) {

		String str1 = new String("hello java");
		String str2 = new String("hello java");
		
	
//			String str1 = "hello ";
//		String str2 = "hello ";
		
		
	
		System.out.println("1  "+System.identityHashCode(str1));
		System.out.println("2  "+System.identityHashCode(str2));
	

		System.out.println();
		
//		if(str1==str2) {
//			System.out.println("str 참조주소가 같다.");
//		}else {
//			System.out.println("str 참조주소가 다르다.");
//		}
		
		
	}
	
	
}
