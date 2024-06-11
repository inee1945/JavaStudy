package quiz;

public class QuUpgradeGuGu {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 1) {
					System.out.print(i + "*1="+i*1);
				} else {
					for (int a = 0; a < j; a++) {

						if (a < j - 1) {
							System.out.print(i + "*");
						} else {
							System.out.print(i + "="+(int)Math.pow(i, j));
						}

					}
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
