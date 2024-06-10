package ex12inheritance;



public class E08VariableArgument {
	
	static int getTotal(int param) {
		int total = 0;
		total +=param;
		return total;
	}
	static int getTotal(int param, int param2) {
		int total = 0;
		total += (param+param2);
		return total;
	}
	static int getTotal(int param1, int param2, int param3) {
		int total=0;
		total +=(param1+param2+param3);
		return total;
	}
	static int getTotal(int ...param) {
		int total = 0;
		for (int i : param) {
			
	
			total +=i;
		}
		return total;
	}
	
	public static void main(String[] args) {
		System.out.println("getTotal(args1)호출"+getTotal(10));
		System.out.println("getTotal(args1)호출"+getTotal(10,20));
		System.out.println("getTotal(args1)호출"+getTotal(10,20,30));
		
		
		System.out.println("...getT호출"+getTotal((int)1.5,2,3,4,5,6,7,8,9,10));

	}

}
