package ex17collection;

import java.util.LinkedList;
import java.util.Scanner;

import common.*;

public class QuArrayList {

	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList<Student>();

		// 저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");

		// 객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		
		System.out.println(list);
		// 1.검색할 이름을 입력받음
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제할 이름을 입력하세요");
		String str = scanner.nextLine();
		

		// 2.확장for문으로 컬렉션 전체를 접근
		int isRemove = -1;

		for (Student std : list) {
			if (std.getName().equals(str)) {
			int idx =	list.indexOf(std);
			System.out.println("indddddd"+idx);
				isRemove = 1;
				System.out.println("삭제에 성공했습니다."+list.remove(idx));
				break;
			}
		}

		if(isRemove==-1)System.out.println("검색결과가 없습니다."+list);
	}

}
