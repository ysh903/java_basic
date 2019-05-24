package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class Test05 {

	public static void main(String[] args) {

		String sql = "delete from book where bookno=?";

		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		try {
			con = JDBCUtil.getConnection();
			
			ps = con.prepareStatement(sql);//st보다 성능이 좋다.
			//? 세팅작업
			ps.setInt(1, 1);//(첫번째 물음표, 들어갈 내용)
			
			
			//실행
			row=ps.executeUpdate();
			//결과값 핸들링
			System.out.println("delete row: "+row);
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, st, rs);
		}

	}

}
