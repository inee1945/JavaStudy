package ex15useFulclass;

public class E01WrapperClass2 {

	public static void main(String[] args) {
		String strNumber= "1000";
		
		System.out.println("10+strNumber="+(10+strNumber));
		System.out.println("10+strNumber를 숫자로 변경"+(10+Integer.parseInt(strNumber)));
		System.out.println("10+strNumber를 숫자로 변경"+(10+Integer.valueOf(strNumber)));
		
		
		Exception ecp =new Exception();
	
		
		String floatString = "3.14";
//		System.out.println(Integer.parseInt(floatString));
//		System.out.println("실수형(float)형으로 변경 :"+Float.parseFloat(floatString));
//		System.out.println("실수형(double)형으로 변경 :"+Double.parseDouble(floatString));
		
		System.out.println("ABCD에서 3번째 인덱스 D형의 아스키코드");
		System.out.println(Character.codePointAt("ABCD", 3));
		
		

		String whiteString = "h  e  l  l   o";
		
		 
		 
		char[] arr =  whiteString.toCharArray();
		int cnt=0;
		for(int i =0;i<arr.length;i++) {
			if(Character.isWhitespace(arr[i])) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
	
	
		

}
