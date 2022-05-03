package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class SelectTest {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; //thin : 오라클 드라이버 이름
	private String username = "c##java";
	private String password = "oracle";
	
	private Connection conn;	
	private PreparedStatement pstmt; //오라클의 명령어를 처리(통역)해준다. (java > 통역 > oracle)
	private ResultSet rs;
	
	public SelectTest() {
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
	
	//select * from dbtest
	public void selectArticle() {
		this.getConnection(); //jdbc 접속
		//접속했다가 끊었다가 하기 위해서 메인에서 접속을 하지 않는다. (메인은 static이기떄문에)

		try {
			//통역가 생성
			String sql = "select * from dbtest";
			pstmt = conn.prepareStatement(sql);//sql 명령어 입력
			
			rs = pstmt.executeQuery(); //실행 - ResultSet 리턴
			//그래서 상단에 ResultSet을 선언해준것임
			//하단에 주석으로 추가설명
			System.out.println(rs); //rs만 출력하면 객체이기 때문에 주소값 출력됨
			
			while(rs.next()) {
				System.out.println( rs.getString("name")+"\t"+
									rs.getInt("age")+"\t"+
									rs.getDouble("height")+"\t"+
									rs.getString("logtime"));
			}
			
			
			//통역 실행
			int su = pstmt.executeUpdate(); //실행된 갯수 리턴
			System.out.println(su+"개의 행이 조회되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//꼭 통역, jdbc를 종료해줘야함 (+ResultSet도 닫아야해)
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}//selectArticle()
	
	public static void main(String[] args) {
		SelectTest st = new SelectTest();
		st.selectArticle();
	}
}


/*

배열.length
Arraylist.size()

ResultSet rs 는??

rs.next();
두가지 역할을 한다는데?
현재 위치 레코드 있으면 true, 없으면 false;
다음 레코드 이동

이름 꺼낼때 : rs.getString("name") 또는 rs.getString(1)
나이 꺼낼떄 : rs.getInt("agd")         rs.getInt(2)
키를 꺼낼때 : rs.getDouble("height")   rs.getDouble(3)
날짜 꺼낼때 : rs.getString("logtime")
        또는 rs.getDate("logtime")



*/
