package ex15useFulclass;

public class E01WrapperClass1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2=20;
		int result = num1+num2;
		System.out.println("result="+result);
		
		Integer n10Obj= new Integer(10);
		Integer n20Obj= new Integer(num2);
		int result2 = n10Obj.intValue() + n20Obj.intValue();
		System.out.println("result2="+result2);
		
		Integer numObj1=100;
		Integer numObj2=200;
		int num3 = numObj1;
		int result3 = numObj1 - numObj2;
		System.out.println("오토언박싱"+ result3);
		
	
		
	}

}
