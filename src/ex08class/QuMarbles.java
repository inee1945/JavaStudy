package ex08class;

class Child {
	int beadCnt;

	Child(int bead) {
		beadCnt = bead;
	}

	public void obtainBead(Child child, int bead) {
		child.beadCnt -= bead;
		this.beadCnt += bead;
	}

	public int showBeat() {
		return beadCnt;
	}
}

public class QuMarbles {

	public static void main(String[] args) {
		Child child1 = new Child(20);
		Child child2 = new Child(15);

		System.out.println("게임전 구슬의 보유갯수");
		System.out.println("어린이1 : " + child1.showBeat());
		System.out.println("어린이2 : " + child2.showBeat());

		System.out.println("1차 게임 후 구슬의 보유갯수");

		//1차게임
		child1.obtainBead(child2, 5);
		
		System.out.println("어린이1 : " + child1.showBeat());
		System.out.println("어린이2 : " + child2.showBeat());
		
		System.out.println("2차 게임 후 구슬의 보유갯수");

		//2차게임
		child2.obtainBead(child1, 9);

		System.out.println("어린이1 : " + child1.showBeat());
		System.out.println("어린이2 : " + child2.showBeat());

	}

}
