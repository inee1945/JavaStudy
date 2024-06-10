package ex09package.study.seller;

public class FruitSeller3 {
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
