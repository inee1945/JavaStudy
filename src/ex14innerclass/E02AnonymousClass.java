package ex14innerclass;

class Singer  {
	String name;

	public Singer(String name) {
		this.name = name;
	}
public String str() {
	return "오버라이딩안된것"+name;
}
	@Override
	public String toString() {
		return "이름" + name;
	}
}

class GirlGroup extends Singer {
	String team;

	public GirlGroup(String name, String team) {
		super(name);
		this.team = team;
	}

	@Override
	public String toString() {
		return "이름" +name+",팀명:" + team;
		//return super.toString() + ",팀명:" + team;
	}
}
interface ISigner{
	public void dancing();
}

public class E02AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singer s1 = new Singer("조용필");
		System.out.println(s1);

		Singer s2 = new GirlGroup("츄", "이달의소녀");
		System.out.println(s2);

		Singer s3 = new GirlGroup("아이린", "레드벨벳") {
			boolean mic = true;
			@Override
			public String toString() {
				return super.toString() + ",소속사:SM";
			}
		};
		System.out.println(s3);
	//	System.out.println(s3.mic);
		
		ISigner s4 = new ISigner() {
			@Override
			public void dancing() {
				System.out.println("춤추는게 좋아요!!");
			}
		};
		s4.dancing();
	}

}
