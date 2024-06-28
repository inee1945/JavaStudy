package ex20io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class E06FileWriterStream {

	public static void main(String[] args) {
		try {
			char ch1 = 'A';
			char ch2 = 'B';
			char ch3 = 'C';
			char ch4 = 'D';
			char ch5 = 'E';

			Writer out = new FileWriter("src/ex20io/alpha.txt");
			out.write(ch1);
			out.write(ch2);
			out.write(ch3);
			out.write(ch4);
			out.write(ch5);
			out.close();
		} catch (IOException e) {
			System.out.println("문자스트림 작업중 오류");
			e.printStackTrace();
		}
		System.out.println("프로그램 종료됨");
	}

}
