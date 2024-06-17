package ex18lambda;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ex06Define4Function {

	public static void main(String[] args) {
		Function<String, Integer> func = (String s) -> {
			return s.length();
		};
		System.out.println("Lambda 문자열의 길이" + func.apply("lssam"));

		Human p1 = new Human("케이윌", "남", 0);
		Human p2 = new Human("케이윌", "남", 0);
		Human p3 = new Human("케이윌", "남", 0);
		Human p4 = new Human("케이윌", "남", 0);
		List<Human> list = Arrays.asList(p1, p2, p3, p4);

		Function<Human, String> getFunction = (Human h) -> {
			return h.getGender();
		};
		String score = getFunction.apply(p1);
		System.out.println("p1의 점수" + score);

		System.out.println("리스트객체에 점수출력");
		for (Human h : list) {
			System.out.println(h.getGender());
		}
		
		
	}
}
