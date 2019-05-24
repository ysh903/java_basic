package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class Test06_update {

	public static void main(String[] args) {

		String sql = "update book set title =?,price=?, where bookno=?";

		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		try {
			con = JDBCUtil.getConnection();
			st = con.createStatement();
			ps = con.prepareStatement(sql);//st보다 성능이 좋다.
			//? 세팅작업
			ps.setString(1, "jsp");
			ps.setInt(2, 1000);			
			ps.setInt(3, 3);
			
			
			//실행
			ps.executeUpdate();
			//결과값 핸들링
			//System.out.println("update row: "+row);
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, st, rs);
		}

	}

}
