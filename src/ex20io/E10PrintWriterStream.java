package ex20io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class E10PrintWriterStream {

	public static void main(String[] args)throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter("src/ex20io/printf.txt"));
		out.printf("제 나이는 %d살입니다.", 9);
		out.println("");
		
		out.println("저는 기타치는걸 좋아해요");
		out.print("노래부를때 행복한거같아요");
		out.close();
		System.out.println("print.txt가 생성되었습니다. ");

	}

}
