package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertTest {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "SCOTT";
		String passwd = "TIGER";
		
		
		
		try {
			Class.forName(driver);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "insert into dept(deptno, dname, loc) "
					+ "values (?, ?, ?) ";//' ' 의도적으로 띄어쓰기 넣을 것.
		
			pstmt = con.prepareStatement(sql);// 전송하기위한 객체 받기
			//? 대신에 값  설정하기
			/*
			 * pstmt.setXXX(?의 위치, 값)
			 */
			//rs = pstmt.executeQuery();
			pstmt.setInt(1,12);
			pstmt.setString(2,"개발");
			pstmt.setString(3,"서울");
			
			int num = pstmt.executeUpdate();//얘가 바인딩 변수 정해주는거 아님.
			System.out.println("레코드 생성 개수: "+ num);
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}//사용했던 API close 역순으로 해주어야함. 일반적으로 finally 문에서 처리함
		finally {
			try {
				
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}



