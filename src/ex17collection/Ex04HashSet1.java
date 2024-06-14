package ex17collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import common.Student;

public class Ex04HashSet1 {

	public static void main(String[] args) {
		
		HashSet<Student> list2 = new HashSet<Student>();
		//ArrayList<Student> list2 = new ArrayList<Student>();
		Student st1 = new Student("정우성", 10, "2018");
		Student st2 = new Student("원빈", 20, "2017");
		Student st3 = new Student("장동건", 30, "2016");
		Student st4 = new Student("공유", 40, "2015");
		Student st5 = new Student("공유", 40, "2015");
		
		
		list2.add(st1);
		list2.add(st2);
		list2.add(st3);
		list2.add(st4);
		list2.add(st5);
		
	Iterator<Student> iter = list2.iterator();
	
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}

	}

}
