package ex08class;

public class Human {

	String name;
	int age;
	int energy;
	void walkign() {
		energy--;
		if(energy<0) {
			energy=0;
			System.out.println("work에너지는 0이 최소입니다.");
			System.out.println("0으로 고정됩니다.");
		}else {
			System.out.println("work에너지가 1감소하였습니다.");
		}
	}
	void thinking() {
		energy -=2;
		if(energy<0) {
			energy=0;
			System.out.println("thinking에너지는 0이 최소입니다. ");
			System.out.println("0으로 고정됩니다.");
		}else {
			System.out.println("thinkign에너지가 2 감소하였습니다 ");
		}
	}
	
	void eating() {
		energy +=2;
		if(energy>10) {
			System.out.println("eat에너지는 10이 최대입니다. ");
		}else {
			System.out.println("eat에너지가 2층가하였습니다. ");
		}
	}
	void showState() {
		System.out.println("===님의 현재상태는====");
		System.out.println("이름:"+name);
		System.out.println("나이: "+age);
		System.out.println("에너지: "+energy);
	}

}
