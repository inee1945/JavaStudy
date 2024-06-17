package ex18lambda;

import java.util.function.Consumer;

public class Ex06Define3Consumer {

	public static void main(String[] args) {
		Consumer<String> c1 = (String s) -> {
			System.out.println(s + "는 가수입니다.");
		};
		c1.accept("케이윌");
		Consumer<String> c2 = t -> {
			System.out.println(t + "는 과일입니다.");
		};
		c2.accept("strawberry");
		nae(c2,"apple");
	}

	

	public static  void nae(Consumer<String> c, String str) {
		c.accept(str);
	}
}
