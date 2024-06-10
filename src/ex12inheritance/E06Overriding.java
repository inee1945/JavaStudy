package ex12inheritance;

class Speaker{
	private int volumnRate;
	public void setVolumn(int vol) {
		this.volumnRate=vol;
	}
	public void setVolumn(int vol, int rate) {
		System.out.println("===="+vol+"==="+rate);
	}
	public void showState() {
		System.out.println("스피커의 볼륨크기: "+volumnRate);
	}
}
class BaseSpeaker extends Speaker{
	private int baseRate;
	
	public void setBase(int bas) {
		this.baseRate=bas;
	}

	@Override
	public void showState() {
		// TODO Auto-generated method stub
		super.showState();
		System.out.println("베이스의 볼륨크기"+ baseRate);
	}

}
public class E06Overriding {

	public static void main(String[] args) {
		BaseSpeaker baseSpeaker = new BaseSpeaker();
		baseSpeaker.setVolumn(999, 888);
		baseSpeaker.setVolumn(10);
		baseSpeaker.setBase(20);
		baseSpeaker.showState();
		
		System.out.println();
		Speaker speaker = new BaseSpeaker();
		speaker.setVolumn(30);
		speaker.setVolumn(40,70);
	//	speaker.setBase(40);
		speaker.showState();

	}

}
