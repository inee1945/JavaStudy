package ex08class;

class CalculatorEx {
	int addCount;
	int minCount;
	int mulCount;
	int adivCount;

	public void init() {
		addCount = 0;
		minCount = 0;
		mulCount = 0;
		adivCount = 0;
	}

	public double add(double i, double j) {
		addCount++;
		return i + j;
	}

	public double min(double i, double j) {
		minCount++;
		return i - j;
	}

	public double mul(double i, double j) {
		mulCount++;
		return i * j;
	}

	public double div(double i, double j) {
		adivCount++;
		return i / j;
	}

	public void showOpCount() {
		System.out.println("덧셈횟수 : " + addCount);
		System.out.println("뺄셈횟수 : " + minCount);
		System.out.println("곱셈횟수 : " + mulCount);
		System.out.println("나눗셈횟수 : " + adivCount);
	}
}

public class QuSimpleCalculator {

	public static void main(String[] args) {
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1, 2));
		System.out.println("11 + 22 = " + cal.add(1, 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5, 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0, 5.0));
		System.out.println("100 / 25 = " + cal.div(100, 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0, 3.0));
		cal.showOpCount();

	}

}
