package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex03ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("소녀시대");
		list.add("빅뱅");
		list.add("트와이스");
		list.add(3,"워너원");
		list.add(4,"소방차..");
		list.add(list.size(),"오마이걸");
		list.add(list.size(),"방탄소년단");
		list.add(0,"콜드플레이");
		System.out.println("중복저장전 객체수"+list.size());
		
		list.set(0, "viva");
		
	int a =list.indexOf("소방차..");
	System.out.println(a);
		list.remove(a);
		Iterator<String> itr = list.iterator();
	
		list.size();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Iterator<String> iter =new Iterator<String>() {
			
			@Override
			public String next() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}
		}; 
		
//		for(String kk:list) {
//			System.out.println(kk);
//		}
	}

}
