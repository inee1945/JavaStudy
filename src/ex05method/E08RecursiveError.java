package ex05method;

public class E08RecursiveError {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
showHi(3);
	}
	public static void showHi(int cnt) {
		System.out.println("hi");
		System.out.println("cnt="+cnt);
	
		if(cnt==1) {
			return;
		}
		showHi(cnt);
	}
	
}
