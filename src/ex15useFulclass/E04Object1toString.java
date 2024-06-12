package ex15useFulclass;

class myFriends extends Object{
	String myName;
	public myFriends(String name) {
		myName=name;
	}
	@Override
	public String toString() {
		
		return "이름 : "+myName;
	}
}
class yourFriends extends Object{
	String myName;
	public yourFriends(String name) {
		myName = name;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
public class E04Object1toString {

	public static void main(String[] args) {
		myFriends fnd1 = new myFriends("성유겸");
		yourFriends fnd2 = new yourFriends("헬로비너스");
		
		System.out.println(fnd1);
		System.out.println(fnd2);
		
		String str1 = "수요일";
		String str2 = "수요일1";

		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
	}

}
