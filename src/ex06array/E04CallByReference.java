package ex06array;

public class E04CallByReference {

	public static void main(String[] args) {
		int[] arr = {100,200};
		System.out.println("메인메소드 스왑전 출력");
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		callByReference(arr);
		System.out.println("메인메소드 스왑이후 출력");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}
	static void callByReference(int[] ref) {
		int temp;
		temp = ref[0];
		ref[0]= ref[1];
		ref[1]=temp;
		System.out.println("콜바이레퍼런스메소드 스왑이후출력");
		for(int i=0;i<ref.length;i++) {
			System.out.println(ref[i]);
		}
		System.out.println();
	}

}
