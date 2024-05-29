package ex05method;

public class setGet {
	static String name1;
	public static void setStr(String str) {
		name1 = str;
		System.out.println(getStr());
	}

	public static String getStr() {
		return name1;
	}
}
