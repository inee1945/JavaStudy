package ex05method;

public class E06LocalVariable {

	public static void main(String[] args) {
		boolean scop = false;
	//	int num;
		if(scop) {
			
			int num = 1;
			num++;
			System.out.println("first "+ num);
		}
		else {
		int	num = 5;
			System.out.println("else "+ num);
		}
	int	num = 100;
		System.out.println("main "+ num);
	}

}
