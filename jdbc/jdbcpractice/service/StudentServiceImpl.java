package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.Dao.StudentDao;
import com.Dto.StudentDTO;



public class StudentServiceImpl implements StudentService {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "workshop";
	String passwd = "workshop";
//24 21 26
	@Override
	public List<StudentDTO> findAll() {
		List<StudentDTO> list =null;
		Connection con = null;
		

			try {
				con = DriverManager.getConnection(url, userid, passwd);
				//String sql = "select deptno as no, dname, loc from dept";// "" 안에 ; 넣지 말 것.
				StudentDao dao = new StudentDao();
				list = dao.findAll(con);

			} catch (SQLException e) {
				e.printStackTrace();
			}

			// 사용했던 API close 역순으로 해주어야함. 일반적으로 finally 문에서 처리함
			finally {
				try {

					if (con != null)
						con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		return list;
	}//function end

	public StudentServiceImpl() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	
}
