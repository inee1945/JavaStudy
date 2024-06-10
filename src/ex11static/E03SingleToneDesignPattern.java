package ex11static;

class NoSingleTone{
	int instVar;
	public NoSingleTone() {
		
	}
}

class SingleTone{
	int shareVar;
	private static SingleTone single = new SingleTone();
	private SingleTone() {
		
	}
	public static SingleTone getInstance() {
		return single;
	}
	void print() {
		System.out.println(String.format("shareVar=%d",shareVar));
	}
}


public class E03SingleToneDesignPattern {

	public static void main(String[] args) {
		NoSingleTone nst1 = new NoSingleTone();
		nst1.instVar=100;
		System.out.println("nst1="+nst1);
		
		NoSingleTone nst2 = new NoSingleTone();
		nst1.instVar=200;
		System.out.println("nst2="+nst2);
	}

}
