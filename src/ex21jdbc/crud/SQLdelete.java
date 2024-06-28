package ex21jdbc.crud;

public class SQLdelete extends MyConnection {
	
	public SQLdelete(String user, String pass) {
		super(user, pass);
		
	}
	String query;
	int result;
	
	@Override
	public void dbExcute() {
		try {
			stmt = con.createStatement();
			query = "delete from member where id ='test1' ";
			result =stmt.executeUpdate(query);
			
			System.out.println(result+"행 정적쿼리 삭제 완료");
			
			query = "delete from member where id =?";
			psmt = con.prepareStatement(query);
			psmt.setString(1, inputValue("아이디"));
			result =psmt.executeUpdate();
			System.out.println(result +"행동적쿼리 삭제 완료");
			
		}catch(Exception e) {
			System.out.println("삭제 시 오류가 발생하였습니다. ");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new SQLdelete("study", "1234").dbExcute();

	}

}
