package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class Test07_select {

	public static void main(String[] args) {
		String sql = "select * from book";

		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		

		
		
		try {
			con = JDBCUtil.getConnection();
			
			ps = con.prepareStatement(sql);//st보다 성능이 좋다.
			//? 세팅작업
			
			
			
			//실행
			
			//결과값 핸들링
			rs=ps.executeQuery(sql);
			
			while (rs.next()) {
				System.out.print(rs.getInt("bookno")+"	");
				System.out.print(rs.getString("title")+"	");
				System.out.print(rs.getInt("price")+"	");
				System.out.print(rs.getDate("pubdate")+"	");
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
