package ex17collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

import common.Student;
import common.Teacher;

public class Ex04HashSet2 {

	public static void main(String[] args) {
		
		HashSet<Teacher> hashSet = new HashSet<Teacher>();
		
		Teacher t1 = new Teacher("정우성", 80, "국어");
		Teacher t2 = new Teacher("정우성", 81, "국어");
		Teacher t3 = new Teacher("최민식", 44, "수학");
		

		hashSet.add(t1);
		hashSet.add(t1);
	

		System.out.println("hashSet의 크기"+hashSet.size());
		
	//	Iterator<Teacher> iter = hashSet.iterator();
		
		//while(iter.hasNext()) {
		//	System.out.println(iter.next());
	//	} 
	}
//1426959
}
