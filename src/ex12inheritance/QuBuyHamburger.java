package ex12inheritance;

class Burger {
	String name;
	int price;
	String patty;
	String sauce;
	String vegetable;

	Burger(String name, int price, String patty, String sauce, String vegetable) {
		this.name = name;
		this.price = price;
		this.patty = patty;
		this.sauce = sauce;
		this.vegetable = vegetable;
	}

	public int getPrice() {
		return price;
	}

	
}

class HamburgerPrice {
	// 멤버변수
	/* 햄버거종류, 음료, 프렌치프라이 */
	Burger burger;
	final int COKE = 1000;
	final int POTATO = 1500;

	HamburgerPrice(Burger burger){
		this.burger=burger;
	}

	public int cal() {
		return burger.getPrice() + COKE + POTATO;
	}
	public void showBurgerInfo() {
		System.out.println(burger.name);
		System.out.println("가격:" + burger.price);
		System.out.printf("식제료:%s,%s,%s\n", burger.patty, burger.sauce, burger.vegetable);
		System.out.println("결제금액:" +cal());
		System.out.println("===============================================================");
	}
}

class SetPrice extends HamburgerPrice {
	SetPrice (Burger burger) {
		super(burger);
	}

	public int cal() {
		return (burger.getPrice() + COKE + POTATO)-500;
	}

	public void showBurgerInfo() {
		System.out.println(burger.name);
		System.out.println("가격:" + burger.price);
		System.out.printf("식제료:%s,%s,%s\n", burger.patty, burger.sauce, burger.vegetable);
		System.out.println("세트결제금액:" +cal());
	}

}

public class QuBuyHamburger {

	public static void main(String[] args) {
		// 치즈버거 객체 생성
		Burger burger1 = new Burger("치즈버거", 2000, "쇠고기패티", "케챱", "피클");
		// 치킨버거 객체 생성
		Burger burger2 = new Burger("치킨버거", 3000, "닭고기패티", "마요네즈", "양상치");

		// 치즈버거를 기본가격으로 구매
		HamburgerPrice price1 = new HamburgerPrice(burger1);
		price1.showBurgerInfo(); // 4500원

		// 치킨버거를 세트가격으로 구매
		HamburgerPrice price2 = new SetPrice(burger2);
		price2.showBurgerInfo(); // 5000원

	}

}
