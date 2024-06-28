package ex21jdbc.crud;

public class SQLupdate extends MyConnection {
	public SQLupdate(String user, String pass) {
		super(user, pass);
	}
	
	String query;
	int result;
	@Override
	public void dbExcute() {
		try {
			stmt = con.createStatement();
			query = "update member set pass = '0412', name = '성유겸',regidate = sysdate where id = 'test1'";
			result = stmt.executeUpdate(query);
			System.out.println("[stmt]"+result+"행 업데이트 됨");
			/////////////////////////////////////////////////
			query = "update member set name=?,pass=? where id=?";
			psmt= con.prepareStatement(query);
			while(true) {
				psmt.setString(3, inputValue("수정할아이디"));
				psmt.setString(1, inputValue("이름"));
				psmt.setString(2, inputValue("패스워드"));
				result = psmt.executeUpdate();
				System.out.println("동적쿼리"+result+"행 입력됨");
			}
		
		}catch(Exception e) {
			System.out.println("업데이트 시 오류발생");
			e.printStackTrace();
		}
	
	}

	public static void main(String[] args) {
		new SQLupdate("study","1234").dbExcute();

	}

}
