package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

abstract class Friend {
	String name;
	String phone;
	String addr;

	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}

	public void showAllData() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phone);
		System.out.println("주소: " + addr);
	}

	public abstract void showBasicInfo();
}

class HighFriend extends Friend {

	String nickname;

	public HighFriend(String name, String phone, String addr, String nicString) {
		super(name, phone, addr);
		this.nickname = nickname;
	}

	@Override
	public void showAllData() {
		System.out.println("==고딩친구(전체정보)=======");
		super.showAllData();
		System.out.println("별명:" + nickname);
	}

	@Override
	public void showBasicInfo() {
		System.out.println("===고딩친구===");
		System.out.println("별명 :" + nickname);
		System.out.println("전화번호:" + phone);
	}
}

class UnivFriend extends Friend {
	String major;

	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}

	@Override
	public void showAllData() {
		System.out.println("==대딩(전체정보)=======");
		super.showAllData();
		System.out.println("전공:" + major);
	}

	@Override
	public void showBasicInfo() {
		System.out.println("===대딩친구===");
		System.out.println("이름 :" + name);
		System.out.println("전화번호:" + phone);
	}
}

public class Ex07MyFriendInfoBook {
	public static void menuShow() {
		System.out.println("######메뉴를 입력하세요#######");
		System.out.println("1.고딩친구입력");
		System.out.println("2.대딩친구입력");
		System.out.println("3.전체정보출력");
		System.out.println("4.간략정보출력");
		System.out.println("5.검색");
		System.out.println("6.삭제");
		System.out.println("7프로그램종료");
		System.out.println("메뉴선택>>>");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FriendInfoHandler handler = new FriendInfoHandler();

		while (true) {
			menuShow();
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
			case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showSimpleData();
				break;
			case 5:
				handler.searchInfo();
				break;
			case 6:
				handler.deleteInfo();
				break;
			case 7:
				System.out.println("프로그램종료");
				return;

			}
		}
	}
}

class FriendInfoHandler {
//	private Friend[] myFriends;
//	private int numOfFreinds;

	private ArrayList<Friend> lists;

	public FriendInfoHandler() {
//		myFriends = new Friend[num];
//		numOfFreinds = 0;
		lists = new ArrayList<Friend>();
	}

	public void addFriend(int choice) {
		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		System.out.println("이름:");
		iName = scan.nextLine();

		System.out.println("전화번호");
		iPhone = scan.nextLine();

		System.out.println("주소");
		iAddr = scan.nextLine();

		if (choice == 1) {
			System.out.println("별명:");
			iNickname = scan.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			lists.add(high);
		} else if (choice == 2) {
			System.out.println("전공:");
			iMajor = scan.nextLine();
			UnivFriend univ = new UnivFriend(iName, iPhone, iAddr, iMajor);
			lists.add(univ);
		}
		System.out.println("친구정보 입력이 완료되었습니다. ");
	}

	public void showAllData() {
		for (Friend fir : lists) {
			fir.showAllData();
		}
		System.out.println("==전체정보가 출력되었습니다==");
	}

	public void showSimpleData() {
		for (Friend fir : lists) {
			fir.showBasicInfo();
		}
		System.out.println("==간략정보가 출력되었습니다. ==");
	}

	public void searchInfo() {
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요");
		String searchName = scan.nextLine();

		for (int i = 0; i < lists.size(); i++) {
			if (searchName.compareTo(lists.get(i).name) == 0) {
				lists.get(i).showAllData();
				System.out.println("**귀하가 요청하는 정보를 찾았습니다.");
				isFind = true;
			}
		}

		if (isFind == false)
			System.out.println("**찾는정보가 없습니다.**");
	}

	public void deleteInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 이름을 입력하세요");
		String deleteName = scan.nextLine();
		int deleteIndex = -1;

		Iterator<Friend> itr = lists.iterator();
		while (itr.hasNext()) {
			if (deleteName.compareTo(itr.next().name) == 0) {
				// fir = null;
				lists.remove(itr.next());
				deleteIndex = 1;
				break;
			}
		}

		if (deleteIndex == -1) {
			System.out.println("==삭제된 데이터가 없습니다. ==");
		}
		System.out.println("==데이터가 삭제되었습니다.");

	}

}