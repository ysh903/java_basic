package ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;

public class EmpTest {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "select count(*) 직속부하직원수, m.employee_id 관리자사번, m.last_name 관리자이름\r\n" + 
				"from employees e join employees m\r\n" + 
				"on e.manager_id=m.employee_id\r\n" + 
				"group by m.employee_id,m.last_name\r\n" + 
				"having count(*)>=8\r\n" + 
				"order by  1";

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {				
				System.out.print(rs.getInt(1) + "	");
				System.out.print(rs.getString(2) + "	");
				System.out.print(rs.getString(3) + "	");
				System.out.println();				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}

	}

}
