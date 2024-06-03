package ex04controlstatement;

public class QuPyramid03 {

	public static void main(String[] args) {
		int max = 10;
		for (int i = 1; i <= max; i++) {
			if (i % 2 == 1) {
				for (int j = 1; j < max; j++) {
					if(j<=(max-1-i)/2 ) {
						System.out.print(" ");
					}else if ((j>(max-1-i)/2+i) ) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
					
				}
			}
			System.out.println();
		}
	}
}
