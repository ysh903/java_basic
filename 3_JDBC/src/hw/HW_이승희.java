package hw;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class HW_이승희 {

	public static void main(String[] args) {
		String sql = "select count(*) 직속부하직원수, m.employee_id 관리자사번, m.last_name 관리자이름\r\n" + 
				"from employees e join employees m\r\n" + 
				"on e.manager_id=m.employee_id\r\n" + 
				"group by m.employee_id,m.last_name\r\n" + 
				"having count(*)>=8\r\n" + 
				"order by  1";

		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getConnection();

			ps = con.prepareStatement(sql);// st보다 성능이 좋다.
			// ? 세팅작업

			// 실행

			// 결과값 핸들링
			rs = ps.executeQuery(sql);

			while (rs.next()) {
				if(rs.getInt("직속부하직원수")>=8) {
				System.out.print(rs.getInt("직속부하직원수") + "	");
				System.out.print(rs.getString("관리자사번") + "	");
				System.out.print(rs.getString("관리자이름") + "	");
				System.out.println();
				}
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, st, rs);
		}

	}

}
