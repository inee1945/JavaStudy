package ex16lambda;

import java.util.Random;

interface StringConcat{
	public void makeString(String s1, String s2);
}
interface RandomNumber{
	public int randomNum(int r);
}

interface MenuPrint{
	public void onlyPrint();
}

public class Ex05ParamNReturn {

	public static void main(String[] args) {
		System.out.println("###람다식1");
		String s1 = "안녕하세요?";
		String s2 = "람다식입니다.";
		
		StringConcat s12 = (a,b)->{
			System.out.println(a+""+b);
		};
		s12.makeString(s1, s2);
		
		System.out.println("\n###람다식 2");
		RandomNumber randomNumber = (r)->{
			Random random = new Random();
			return random.nextInt(r);
		};
	int r=	randomNumber.randomNum(100);
	System.out.println(r);
	}

}
