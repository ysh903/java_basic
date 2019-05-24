package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import util.JDBCUtil;

public class Test02 {

	public static void main(String[] args) {
		// emp table에서 부서별 평균 급여와 인원수를 구해서 출력하세
		System.out.println("JDBC Test");
		String sql = "select deptno,round(avg(sal),2), count(*) " + " from emp group by deptno";

	

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		System.out.println("부서\t평균급여\t인원");

		try {
			
			con = JDBCUtil.getConnection();// 2.DB연결
			st = con.createStatement();// 3.sql 관리 객체 statement 생성
			rs = st.executeQuery(sql); // 4. sql 구문 실행

			// 4.결과값 처리
			while (rs.next()) {

				System.out.print(rs.getString(1) + "	");
				System.out.print(rs.getString(2) + "	");
				System.out.print(rs.getString(3) + "	");
				System.out.println();
			}

		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(con, st, rs);

		}
		System.out.println("** end **");
	}

}
