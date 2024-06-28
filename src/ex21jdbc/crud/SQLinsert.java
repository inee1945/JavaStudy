package ex21jdbc.crud;

public class SQLinsert extends MyConnection{
	public SQLinsert(String user, String pass) {
		super(user,pass);
	}

	String query;
	int result;
	
	@Override
	public void dbExcute() {
		try {
			stmt = con.createStatement();
			query = "insert into member values('test1','1111','테스터1',sysdate)";
			result = stmt.executeUpdate(query);
			
			System.out.println("[stmt"+result +"행입력됨");
			
			query = "insert into member values(?,?,?,sysdate)";
			
			psmt = con.prepareStatement(query);
			psmt.setString(1,inputValue("아이디"));
			psmt.setString(2,inputValue("패스워드"));
			psmt.setString(3,inputValue("이름"));
			result = psmt.executeUpdate()	;
			System.out.println("[psmt]"+result +"행 입력됨");
		}catch(Exception e) {
			System.out.println("쿼리 실행중 예외발생");
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		new SQLinsert("study", "1234").dbExcute();

	}

}
