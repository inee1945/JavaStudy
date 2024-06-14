package ex17collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex06HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "홍길동");
		map.put("age", "5");
		map.put("gender", "남자");
		map.put("address", "가산디지털");
		System.out.println("저장된 객체수 보기"+map.size());
		
		map.put("name", "초길돌");
		System.out.println("저장된 객체수 보기"+map.size());
		
		Set<String>keys=map.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key=iter.next();
			String value = map.get(key);
			System.out.println("key="+key+" value="+value);
		}
	}

}
