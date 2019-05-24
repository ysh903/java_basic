package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.BookVO;

public class BookDAO {
	// select * from book;

	public List<BookVO> bookList() {
		List<BookVO> list = new ArrayList<BookVO>();

		String sql = "select * from book";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				BookVO book = new BookVO();
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getInt("price"));
				list.add(book);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}

		return list;
	}

	public int addBook(BookVO vo) throws Exception {

		String sql = "insert into book (bookno,title,author,price) \r\n" 
				+ "values ((select nvl(max(bookno),0)+1 from book) ,"
				+ "?,?,?)";
		Connection con = null;

		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		try {
			con = JDBCUtil.getConnection();

			ps = con.prepareStatement(sql);// st보다 성능이 좋다.
			// ? 세팅작업
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getAuthor());
			ps.setInt(3, vo.getPrice());
			// 실행
			row=ps.executeUpdate();
			// 결과값 핸들링

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		return row;

	}

}
