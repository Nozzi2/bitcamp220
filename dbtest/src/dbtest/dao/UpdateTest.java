package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTest {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; //thin : 오라클 드라이버 이름
	private String username = "c##java";
	private String password = "oracle";
	
	private Connection conn;	
	private PreparedStatement pstmt; //오라클의 명령어를 처리(통역)해준다. (java > 통역 > oracle)
	
	
	public UpdateTest() {
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("접속.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateArticle() {
		this.getConnection(); //jdbc 접속
		//접속했다가 끊었다가 하기 위해서 메인에서 접속을 하지 않는다. (메인은 static이기떄문에)
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		
		try {
			//통역가 생성
			String sql = "update dbtest set age=age+1, height=height+1 where name like ?";
			//? 와 % 는 같이 쓸 수 없음
			pstmt = conn.prepareStatement(sql);//sql 명령어 입력
			pstmt.setString(1, "%"+name+"%"); //못쓰니 이렇게 해야됨
			
			//통역 실행
			int su = pstmt.executeUpdate(); //실행된 갯수 리턴
			System.out.println(su+"개의 행이 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//꼭 통역, jdbc를 종료해줘야함
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}//updateArticle()
	
	public static void main(String[] args) {
		UpdateTest ut = new UpdateTest();
		ut.updateArticle();

	}

}



/*

수정할 이름 입력 : 홍
2개의 행을 수정하였습니다.

'홍'이 들어간 레코드를 찾아서 나이, 키 1씩 증가
update dbtest set age=age+1, height=height+1 where name like '%홍%'
 > 이거를 sql문으로 전달해야함.
String sql = "update dbtest set age=age+1, height=height+1 where name like ?";
//? 와 % 는 같이 쓸 수 없음
pstmt = conn.prepareStatement(sql);//sql 명령어 입력
pstmt.setString(1, "%"+name+"%"); //? 와 % 는 같이 못쓰니 이렇게 해야됨


다른 DB(sql developer)가 사용되고 있으면 자바에서 갱신이 되지 않는다.
그렇기 때문에 다른 DB에서 commit을 해야한다.

 
*/