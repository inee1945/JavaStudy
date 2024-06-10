package ex09package;


import ex09package.study.buyer.FruitBuyer3;
import ex09package.study.seller.FruitSeller3;

public class E03FruitSalesMain4 {
	public static void main(String[] args) {
		FruitSeller3 seller1 = new FruitSeller3(0,100,1000);
		FruitSeller3 seller2 = new FruitSeller3(0, 80, 500);
		FruitBuyer3 buyer = new FruitBuyer3(10000,0);
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}
}
