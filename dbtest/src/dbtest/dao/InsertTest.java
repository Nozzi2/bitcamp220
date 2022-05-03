package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTest {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; //thin : 오라클 드라이버 이름
	private String username = "c##java";
	private String password = "oracle";
	
	private Connection conn;	
	private PreparedStatement pstmt; //오라클의 명령어를 처리(통역)해준다. (java > 통역 > oracle)
	
	
	public InsertTest() {
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
	
	public void insertArticle() {
		this.getConnection(); //jdbc 접속
		//접속했다가 끊었다가 하기 위해서 메인에서 접속을 하지 않는다. (메인은 static이기떄문에)
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		int age = scan.nextInt();
		double height = scan.nextDouble();
		
		try {
			//통역가 생성
			//pstmt = conn.prepareStatement("insert into dbtest values('홍길동', 25, 175.567, sysdate)");//sql 명령어 입력
			//pstmt = conn.prepareStatement("insert into dbtest values('"+name+"', "+age+", "+height+", sysdate)");//sql 명령어 입력
			//?에 데이터 주입 (이렇게 하면 데이터가 노출되지 않는다고 함)
			String sql = "insert into dbtest values(?, ?, ?, sysdate)";
			pstmt = conn.prepareStatement(sql);//sql 명령어 입력
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setDouble(3, height);
			
			//sysdate는 오라클 명령어이기 때문에 바꿔주면 안됨
			//
			//통역 실행
			int su = pstmt.executeUpdate(); //실행된 갯수 리턴
			//자바는 실행되면 자동으로 commit함
			System.out.println(su+"개의 행이 만들어졌습니다.");
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
		
	}//insertArticle()

	public static void main(String[] args) {
		InsertTest it = new InsertTest();
		it.insertArticle(); 
	}

}
