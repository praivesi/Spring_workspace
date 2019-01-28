package spring_app13_jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MySqlDao implements DAO{

	// 접속 정보
	private JdbcTemplate jdbcTemplate;
	StringBuffer sb = new StringBuffer();
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	
	// jdbc 객체
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<DeptDTO> selectAll() {
		sb.setLength(0);
		sb.append("select * from dept");
		
		/*
		 * RowMapper : 데이터베이스의 테이블에 들어있는 각 row를
		 * 				틀에 맞게 담아서 (Mapping) 구현한 객체
		 * RowMapper 는 인턴페이스이므로 new 하지 못하고, 그러므로 구현할 객체가 필요함. 
		 * 그러나 그 객체가 없으므로 만들어서 써야 함 -> 익명 클래스로 만들어서 사용함
		 * 
		 * */
		
		RowMapper<DeptDTO> rm = new RowMapper<DeptDTO>() {
			@Override
			public DeptDTO mapRow(ResultSet rs, int arg1) throws SQLException {
				/*
					DeptDTO dto = new DeptDTO();
					int deptno = rs.getInt(1);
					String dname = rs.getString(2);
					String loc= rs.getString(3);
					
					dto.setDeptno(deptno);
					dto.setDname(dname);
					dto.setLoc(loc);
					
					return dto;
				*/
				return new DeptDTO(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		};
		
		List<DeptDTO> list = jdbcTemplate.query(sb.toString(), rm);
		
		return list;
	}

	@Override
	public DeptDTO selectOne(int no) {
		sb.setLength(0);
		sb.append("select * from dept ");
		sb.append("where deptno = ? ");
		
		RowMapper<DeptDTO> rm = new RowMapper<DeptDTO>() {
			@Override
			public DeptDTO mapRow(ResultSet rs, int arg1) throws SQLException {
				return new DeptDTO(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		};
		
		DeptDTO dto = jdbcTemplate.queryForObject(sb.toString(), rm, no);
		
		return dto;
	}

	@Override
	public void insertOne(DeptDTO dto) {
		sb.setLength(0);
		sb.append("insert into dept ");
		sb.append("values (? , ? , ? ) ");
		
		// jdbcTemplate.update(sql문, ?에 들어갈 값을 순서대로)
		int result = jdbcTemplate.update(sb.toString(), dto.getDeptno(), dto.getDname(), dto.getLoc());
		
		System.out.println("insert 처리 결과 : " + result);
		
	}

	@Override
	public void updateOne(DeptDTO dto) {
		sb.setLength(0);
		sb.append("update dept ");
		sb.append("set dname = ?, loc = ? ");
		sb.append("where deptno = ? ");
		
		int result = jdbcTemplate.update(sb.toString(), dto.getDname(), dto.getLoc(), dto.getDeptno());
		
		System.out.println("update 처리 결과 : " + result);
		
	}

	@Override
	public void deleteOne(int no) {
		sb.setLength(0);
		sb.append("delete from dept ");
		sb.append("where deptno = ?");
		
		int result = jdbcTemplate.update(sb.toString(), no);
		
		System.out.println("delete 처리 결과 : " + result);
	}

}







