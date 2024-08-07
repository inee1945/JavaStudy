package ex12inheritance;

//친구의 정보를 저장할 기본클래스
class MyFriendInfo {
	private String name;
	int age;

	MyFriendInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showMyFriendInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
}

//친구의 기본정보 외 상세정보를 저장할 클래스
class MyFriendDetailInfo extends MyFriendInfo {
	private String addr;
	private String phone;

	MyFriendDetailInfo(String name, int age, String addr, String phone) {
		super(name, age);
		this.addr = addr;
		this.phone = phone;

	}

	public void showMyFriendDetailInfo() {
		showMyFriendInfo();
		System.out.println("주소: " + addr);
		System.out.println("전화: " + phone);
	}
}

class QuMyFriendDetailInfo {
	public static void main(String[] args) {
		MyFriendDetailInfo myFriendDetailInfo = new MyFriendDetailInfo("이순신", 450, "은평구 역촌동", "010-9999-9999");

		myFriendDetailInfo.showMyFriendDetailInfo();
	}

}
