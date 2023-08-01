package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {
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
			String sql = "select deptno as no, dname, loc from dept";//"" 안에 ; 넣지 말 것.
			pstmt = con.prepareStatement(sql);// 전송하기위한 객체 받기
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt("no");
				String dname =rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno + "\t"+dname +"\t"+loc);
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		//사용했던 API close 역순으로 해주어야함. 일반적으로 finally 문에서 처리함
		finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}



