import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.JDBCUtil;
import vo.BookVO;

public class DeptManager {
	

	List<Dept> list = new ArrayList<Dept>();
	
	
	public List<Dept> getDepts() {

		String sql = "select * from dept";

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int row = 0;

		try {
			con = JDBCUtil.getConnection();

			st = con.prepareStatement(sql);

			rs = st.executeQuery(sql);

			while (rs.next()) {
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt(1));
				dept.setDname(rs.getString(2));
				dept.setLoc(rs.getString(3));
				
				list.add(dept);
				
				
				

			}
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, st, rs);
		}

		return list;

	}

}
