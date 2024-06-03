package ex08class;

class FruitSeller2{
	int numOfApple;
	int myMoney;
	int apple_price;
	
	public void initMembers(int money, int appleNum,int price) {
		myMoney = money;
		numOfApple=appleNum;
		apple_price=price;
	}
	public int saleApple(int money) {
		int num =money/apple_price;
		numOfApple-=num;
		myMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수"+numOfApple);
		System.out.println("[판매자]판매수익"+myMoney);
	}
}

class FruitBuyer2{
	int myMoney;
	int numOfApple;
	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	public void buyApple(FruitSeller2 seller, int money) {
		numOfApple +=seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+myMoney);
		System.out.println("[구매자]사과갯수:"+numOfApple);
	}
}

public class E06FruitSalesMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
