package ex06array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class E01OneDimArray02 {

	public static void main(String[] args) {
//		double rndNumber = Math.random();
//		System.out.println("생성된난수[실수]:" + rndNumber);
//		int intNumber = (int) (Math.random() * 100);
//		System.out.println("생성된 난수[실수]:" + intNumber);
//
//		Random random = new Random();
//		System.out.println("생성된난수2" + random.nextInt());
//		System.out.println("+++++++++++++++++++++++++");
//
//		System.out.println("1!45사이이의 난수생성" + (((int) ((Math.random() * 100) % 45) + 1)));
		
		HashSet<Integer> setArr = new HashSet<Integer>();
		 LinkedList<Integer>lotList = new LinkedList<>();
		
		 ArrayList<int[]> newList = new ArrayList<int[]>();

		for (int c = 1; c <= 2; c++) {
			for (int i = 0;i<100;i++) {
				setArr.add((int) ((Math.random() * 100) % 45) + 1);
				int cnt = setArr.size();
				if (cnt >= 6) {
				
					break;
				}
			}
			
			System.out.println("set컬렉션"+setArr);
			System.out.println("어레이리스트"+newList);
			//lotList.push(newList);
		}

	//	System.out.println(lotList);
	}

}
