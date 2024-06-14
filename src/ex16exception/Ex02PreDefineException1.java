package ex16exception;

public class Ex02PreDefineException1 {

	public static void main(String[] args) {
		System.out.println("### arryinexoutbound...exception");
		int[] intArr= new int[2];
		try {
			intArr[0]=100;
			System.out.println("0번방은 "+intArr[0]);
			intArr[1]=200;
			System.out.println("0번방은 "+intArr[1]);
			intArr[2]=300;
			System.out.println("0번방은 "+intArr[2]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외가 발생");
			System.out.println("예외메시지"+e.getMessage());
			e.printStackTrace();
		}
System.out.println("0번방 재출력 "+intArr[0]);
System.out.println("###arryidexoutdo발생후 ");
	}

}
