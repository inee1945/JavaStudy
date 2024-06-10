package ex12inheritance;

class Adder{
	public static int val=0;
	
	public void add(int num) {
		val+=num;
		System.out.println(val);
	
		Adder.val +=num;
		System.out.println(Adder.val);
	}
	
}
class AdderFriend extends Adder{
	public void friendAdd(int num) {
		val+=num;
		System.out.println("son"+val);
		Adder.val+=num;
		System.out.println("son"+Adder.val);
	}
	public void showVal() {
		System.out.println("val="+val);
		System.out.println("val="+Adder.val);
	}
}

public class E03StaticInheritance {
	public static void main(String[] args) {
		Adder ad =new Adder();
		AdderFriend adderFriend = new AdderFriend();
		 ad.add(1);
		 adderFriend.friendAdd(3);
		 
		 Adder.val +=5;
		 AdderFriend.val +=7;
		 adderFriend.showVal();
	}

}
