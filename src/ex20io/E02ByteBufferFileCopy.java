package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class E02ByteBufferFileCopy {

	public static void main(String[] args) {

		try {
			InputStream in = new FileInputStream("src/ex20io/movie.gif");
			OutputStream out = new FileOutputStream("src/ex20io/movie_copy2.gif");

			int copyByte = 0;
			int readLen;
			byte buffer[] = new byte[1024];
			
			while (true) {
				readLen = in.read(buffer);
				
				if (readLen == -1) {
					break;
				}
				out.write(buffer,0, readLen);
				copyByte +=readLen;
			}
			in.close();
			out.close();
	
			System.out.println("복사된 파일크기."+copyByte+"byte");
	
			System.out.println("복사된 파일크기."+(copyByte/1024)+"Kbyte");
			System.out.println("복사된 파일크기."+(copyByte/(1024*2024))+"Mbyte");
			System.out.println("복사된 바이트 크기 : " + (copyByte / 1024));
		}catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않는다.");
		}catch(IOException e) {
			System.out.println("파일스트림 시 오류발생");
		}
	}

}
