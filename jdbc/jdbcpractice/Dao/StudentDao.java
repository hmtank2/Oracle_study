package com.Dao;

import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Dto.DeptDTO;
import com.Dto.StudentDTO;

public class StudentDao {
	public List<StudentDTO> findAll(Connection con){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		try {
			String sql ="select STUDENT_NO as stuNo , DEPARTMENT_NO as departNo ,STUDENT_NAME as stuName,concat(substr(student_ssn, 0, 8), '******')as stuSsn, "
					+ "concat(substr(STUDENT_ADDRESS, 0, 10), '...') as stuAddress\r\n" + 
					",to_char(entrance_date, 'YYYY/MM/DD') as entDate , ABSENCE_YN as absYn, COACH_PROFESSOR_NO as coachProfessorNo\r\n" + 
					"from tb_student\r\n" + 
					"ORDER BY 1 asc";// "" 안에 ; 넣지 말 것.
			pstmt = con.prepareStatement(sql);// 전송하기위한 객체 받기
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				//int deptno = rs.getInt("no");
				String stuNo = rs.getString("stuNo");
				String departNo = rs.getString("departNo");
				String stuName = rs.getString("stuName");
				String stuSsn = rs.getString("stuSsn");
				String stuAddress = rs.getString("stuAddress");
				String entDate = rs.getString("entDate");
				char absYn =rs.getString("absYn").charAt(0);
				//rs.getc
				String coachProfessorNo = rs.getString("coachProfessorNo");
				
				StudentDTO dto = new StudentDTO( stuNo,  departNo,  stuName,  stuSsn,  stuAddress,  entDate,
						 absYn,  coachProfessorNo);

				list.add(dto);
				//System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
		
		
	}//findall end
}
