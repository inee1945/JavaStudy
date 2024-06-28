package ex20io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class E07FileReaderStream {

	public static void main(String[] args) {
		try {
			char[] cbuf = new char[2];
			int readCnt;
			
			Reader in = new FileReader("src/ex20io/alpha.txt");
				readCnt = in.read(cbuf,0,2);
				System.out.println(readCnt);
				
				for(int i =0;i<readCnt;i++) {
					System.out.println(cbuf[i]);
				}
				in.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("파일없음 작업중 오류");
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("IO오류");
			e.printStackTrace();
		}

	}

}
