package ex14innerclass;

import ex01start.E02SystemOutPrintln;

class Unit{
	private String name;
	private int healthPoint;
	
	Marine marine;
	Medic medic;
	
	public Unit(String name, int healthPoint) {
		this.name =name;
		this.healthPoint=healthPoint;
		marine = new Marine();
		medic = new Medic();
	}
	public String infoStr() {
		return "유닛정보[이름:"+name+",체력:"+healthPoint+"]";
	}
	class Marine{
		int attackPower;
		public void attack() {
			System.out.println(infoStr()+"\n마린이공격한다.");
		}
	}
	class Medic{
		int healPower;
		public void heal() {
			System.out.println(infoStr() +"\n메딕이 치료한다.");
		}
	}
}

public class E01InnerClassMain {

	public static void main(String[] args) {
		Unit unit =new Unit("커맨드센터", 1000);
		System.out.println(unit.infoStr());
		
		Unit.Marine marine= new Unit("마린", 50).new Marine();
		marine.attack();
		
		Unit.Medic medic = new Unit("메딕",30).new Medic();
		medic.heal();

	}

}
