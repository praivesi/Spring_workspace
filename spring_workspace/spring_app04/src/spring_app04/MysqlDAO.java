package spring_app04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MysqlDAO implements CommonDAO{
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	@Override
	public Connection connect() {
		return MyConnection.getInstance().getConnection();
	}
	
	@Override
	public void selectAll() {
		String sql = "select * from dept";
		
		try {
			pstmt = connect().prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				
				System.out.println(deptno + "\t" + dname + "\t" + loc);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void selectOne(int no) {
		String sql = "select * from dept where deptno=" + no;
		
		try {
			pstmt = connect().prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				
				System.out.println(deptno + "\t" + dname + "\t" + loc);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



















