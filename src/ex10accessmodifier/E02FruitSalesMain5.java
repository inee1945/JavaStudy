package ex10accessmodifier;

class FruitSeller3{
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;
	
	public FruitSeller3(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	public int saleApple(int money) {
		int num =money/APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자]남읜사과갯수:"+numOfApple);
		System.out.println("[판매자]판매수익"+myMoney);
		
	}
}

class FruitBuyer3{
	int myMoney;
	int numOfApple;
	
	public FruitBuyer3(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	public void buyApple(FruitSeller3 seller, int money) {
		numOfApple +=seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액"+myMoney);
		System.out.println("[구매자]사과갯수"+ numOfApple);
	}
}

public class E02FruitSalesMain5 {
	public static void main(String[] args) {
		FruitSeller3 seller1 = new FruitSeller3(0,100,1000);
		FruitSeller3 seller2 = new FruitSeller3(0, 80, 500);
		FruitBuyer3 buyer = new FruitBuyer3(10000,0);
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
//		buyer.buyApple(seller1, 5000);
//		buyer.buyApple(seller2, 5000);
		
		seller1.myMoney +=1000;
		buyer.myMoney -=1000;
		
		seller1.numOfApple -=50;
		buyer.numOfApple +=50;
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}
}
