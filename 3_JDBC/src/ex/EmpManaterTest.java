package ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class EmpManaterTest {
	public void printEmployee(String jobs[]) {
		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "select e.employee_id, e.first_name, e.salary from employees e join jobs j\r\n"
				+ "on e.job_id=j.job_id\r\n" + "where j.job_title in(?,?)";

		try {
			con = JDBCUtil.getConnection();

			ps = con.prepareStatement(sql);// st보다 성능이 좋다.
			// ? 세팅작업

			ps.setString(1, jobs[0]);// (첫번째 물음표, 들어갈 내용)
			ps.setString(2, jobs[1]);

			// 실행
			rs = ps.executeQuery();
			// 결과값 핸들링
			while (rs.next()) {

				System.out.print(rs.getString(1) + "	");
				System.out.print(rs.getString(2) + "	");
				System.out.print(rs.getString(3) + "	");
				System.out.println();
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
