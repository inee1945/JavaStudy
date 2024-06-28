package ex21jdbc.crud;

//jdbc프로그램 에서 최상위 인터페이스로 사용
public interface IConnect {
	//드라이버와 커넥션 url을 멤버변수로 선언
	String ORACLE_DRIVER = "oracle.jdbc.OracleDriver";
	String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	//추상메서드 선언
	void dbExcute();//쿼리문실행
	void dbClose();//자원반납
	String inputValue(String title); //사용자로부터  입력값받기
}
