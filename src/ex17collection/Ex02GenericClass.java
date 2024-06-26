package ex17collection;

class Apple{
	int weight;
	public Apple(int w) {
		weight=w;
	}
	public void showInfo() {
		System.out.println("사과무게는 "+weight+"입니다.");
	}
}
class Banana {
	int sugar;

	public Banana(int s) {
		sugar = s;
	}

	public void showInfo() {
		System.out.println("바나나 당도는 " + sugar + "입니다.");
	}
}
//class FruitBox {
//	Object item;
//
//	public FruitBox(Object item) {
//		this.item = item;
//	}
//
//	public void store(Object item) {
//		this.item = item;
//	}
//
//	public Object pullOut() {
//		return item;
//	}
//}
class GenericFruitBox<T>{
	T item;
	public void store(T item) {
		this.item = item;
	}
	public T pullOut() {
		return item;
	}
}

public class Ex02GenericClass {

	public static void main(String[] args) {
		GenericFruitBox<Apple> applBox = new GenericFruitBox<Apple>();
		applBox.store(new Apple(10));
		Apple apple = applBox.pullOut();
		apple.showInfo();
		
		GenericFruitBox<Banana> bananaBox = new GenericFruitBox<Banana>();
		bananaBox.store(new Banana(20));
		Banana banana = bananaBox.pullOut();
		banana.showInfo();
		
		GenericFruitBox<Orange> orangeBox = new GenericFruitBox<Orange>();
		//orangeBox.store("나는오렌지");
		orangeBox.store(new Orange(10));
		//orangeBox.store(banana);
		Orange o2= orangeBox.pullOut();
		o2.showInfo();

	}

}
