package test;



class ShowThread extends Thread  {
	String threadName;

	public ShowThread(String name) {
		threadName = name;
	}

	
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("안녕하세요.[" + threadName + "]입니다.");
			try {
				sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class exC1 {

	public static void main(String[] args) {
		ShowThread st1 = new ShowThread("쓰레드1st");
		ShowThread st2 = new ShowThread("Thread2nd");
		st1.start();
		st2.start();
		
		//st1.run2();
		//st2.run2();
	}

}
