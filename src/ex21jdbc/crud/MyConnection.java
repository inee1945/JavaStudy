package ex21jdbc.crud;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//인터페이스를 구현한 클래스로 db연결 , 자원해제등의 기능담당
public class MyConnection implements IConnect {
	public Connection con;//디비연결
	public ResultSet rs; // query결과를 반납받는 인스턴스
	public Statement stmt;// 정적쿼리문 실행
	public PreparedStatement psmt;// 동적쿼리문 실행
	public CallableStatement csmt;// 프로시져 실행

	public MyConnection(String user, String pass) {
		try {
			//오라클 드라이버 로드
			Class.forName(ORACLE_DRIVER);
			//db에 연결 후 connection 인스턴스 반환
			con = DriverManager.getConnection(ORACLE_URL,user,pass);
		}catch(Exception e) {
			System.out.println("DB 커넥션 예외발생");
			e.printStackTrace();
		}
	}
	//구현한 인터페의 추상메소드는 무조건 오버라이딩 한다.
	@Override
	public void dbExcute() {
	}
	@Override
	public void dbClose() {
		try {
			if(con!=null) con.close();
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(psmt!=null) psmt.close();
			if(csmt!=null) csmt.close();
			System.out.println("DB자원반납");
		}catch(Exception e) {
			System.out.println("db자원 반납 시 예외발생");
			e.printStackTrace();
		}
	}
	@Override
	public String inputValue(String title) {
		Scanner scan = new Scanner(System.in);
		System.out.println(title + "을 입력(exit->종료");
		String inputStr = scan.nextLine();
		if("EXIT".equalsIgnoreCase(inputStr)) {
			System.out.println("프로그램을 종료합니다.");
			//db자원반납하고..
			dbClose();
			//즉시 프로그램종료한다.
			System.exit(0);
		}
		return inputStr;
	}
}
