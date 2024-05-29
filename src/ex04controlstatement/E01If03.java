package ex04controlstatement;

public class E01If03 {

	public static void main(String[] args) {
		int kor=99, eng=70, math=64;
		double avg=(kor+eng+math)/3.0;
		System.out.println("평균점수는(그대로):"+avg);
		System.out.printf("평균점수는(소수):%f%n",avg);
		
		if(avg>=90) {
			System.out.println("A");
		}else if(avg>=80) {
			System.out.println("B");
		}else if(avg>=70) {
			System.out.println("c");
		}else {
			System.out.println("나가");
			}
		
	}

}
