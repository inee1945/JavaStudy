package ex12inheritance;

class Gun{
	int bullet;
	public Gun(int bNum) {
		bullet = bNum;
	}
	public void shutGun() {
		System.out.println("빵랴!!");
		bullet --;
	}
}

class Police{
	int handCuffs;
	Gun gun;
	
	public Police(int bNum, int hCuff) {
		handCuffs=hCuff;
		if(bNum<=0) {
			gun = null;
		}else {
			gun= new Gun(bNum);
		}
	}
	public void putHandcuff() {
		System.out.println("수갑채움 넌콩밥");
		handCuffs--;
	}
	public void shut() {
		if(gun==null) {
			System.out.println("보유한 권총없음,헛빵");
			return;
		}else {
			gun.shutGun();
		}
	}
}

public class E05HasAComposite {

	public static void main(String[] args) {
		System.out.println("=====경찰1=====");
		Police police1 = new Police(5, 3);
		police1.shut();
		police1.putHandcuff();
		
		System.out.println("=====경찰2=====");
		Police police2 = new Police(0, 3);
		police2.shut();
		police2.putHandcuff();
	}

}
