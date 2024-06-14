package ex18lambda;

interface ISchool3 {
	void studyLambda(String str);
}

public class Ex03Lambda {

	public static void main(String[] args) {
		ISchool3 stt = (str)->{
			System.out.println("간단"+str);
		};
		
		stt.studyLambda("람다식");

		ISchool3 shc2 = str -> System.out.println(str + "완전간단");
		shc2.studyLambda("람다다다다");
	}

}
