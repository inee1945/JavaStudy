package ex18lambda;

@FunctionalInterface
interface ISchool4 {
	void studyLambda(String str);
}

public class Ex04FunctionalInterface {

	static void execute(ISchool4 sch, String s) {
		sch.studyLambda(s);
	}

	public static void main(String[] args) {
		
		ISchool4 sch = (str)->{
			System.out.println(str+ "xxsss");
		};
		//sch.studyLambda("가나나");

		execute(sch, null);
		
		
	}
	
}
