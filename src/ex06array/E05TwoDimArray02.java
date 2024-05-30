package ex06array;

public class E05TwoDimArray02 {

	public static void main(String[] args) {
//		int[][] arr2Dim = new int[3][4];
//		for(int i=0;i<arr2Dim.length;i++) {
//			for(int j=0;j<arr2Dim[i].length;j++) {
//				System.out.print(arr2Dim[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		int[][] arr2Dim = new int[3][4];
		for(int i=0;i<arr2Dim.length;i++) {
			for(int j=0;j<arr2Dim[i].length;j++) {
				arr2Dim[i][j]= (int)(Math.random()*100);
				System.out.print(arr2Dim[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("초기화후=============");
		showArray(arr2Dim);
		twoDimPlus(arr2Dim,10);
		System.out.println("메소드호출후 ================");
		showArray(arr2Dim);
	}
	
	static void showArray(int[][] arr2) {
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.printf("%-4d",arr2[i][j]);
			}
			System.out.println();
		}
	}
		static void twoDimPlus(int[][] arr2,int num) {
			for(int i=0;i<arr2.length;i++) {
				for(int j=0;j<arr2[i].length;j++) {
					arr2[i][j]+=num ;
				}
				
			}
	}
	
	
	

}
