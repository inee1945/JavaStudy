package ex17collection;

import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import common.Person;
import common.Student;

public class Ex03ArrayList2 {

	public static void main(String[] args) {
		LinkedList<Student> list2 = new LinkedList<Student>();
		//ArrayList<Student> list2 = new ArrayList<Student>();
		
		Student st1 = new Student("정우성", 10, "2018");
		Student st22 = new Student("정우성", 10, "2018");
		Student st2 = new Student("원빈", 20, "2017");
		Student st3 = new Student("장동건", 30, "2016");
		Student st4 = new Student("공유", 40, "2015");
		
		
		list2.add(st1);
		list2.add(st2);
		list2.add(st3);
		list2.add(st4);
		list2.add(st2);
		
		System.out.println(st4.hashCode());
		
		System.out.println("[출력1-일반for문]");
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		
		boolean removeOk = list2.remove(st2);
		System.out.println("인스턴스를 통한 삭제:"+removeOk);
		
		System.out.println("[출력2-이터레이터]");
		Iterator<Student> itr = list2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		int idx = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제할 이름을 입력하세요");
		String removeStr = scanner.nextLine();
		for(Student stu : list2) {
			if(stu.getName().equals(removeStr)) {
				list2.remove(stu);
				break;
			}
		}
		
		System.out.println("현제 객체수"+list2.size());
		System.out.println("[출력3 확장 for문");
		for(Student st : list2) {
			System.out.println(st);
		}
	}

}
