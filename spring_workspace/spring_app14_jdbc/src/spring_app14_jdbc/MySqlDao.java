package spring_app14_jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MySqlDao implements DAO{

	private JdbcTemplate jdbcTemplate;
	StringBuffer sb = new StringBuffer();
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<EmpDTO> selectAll() {
		sb.setLength(0);
		sb.append("select * from emp");
		
		RowMapper<EmpDTO> rm = new RowMapper<EmpDTO>() {
			@Override
			public EmpDTO mapRow(ResultSet rs, int arg1) throws SQLException {
				return new EmpDTO(rs.getInt(1), rs.getString(2), rs.getDouble(6), rs.getInt(8));
			}
		};
		
		List<EmpDTO> list = jdbcTemplate.query(sb.toString(), rm);
		
		return list;
	}

	@Override
	public EmpDTO selectOne(int no) {
		sb.setLength(0);
		sb.append("select * from emp ");
		sb.append("where empno = ?");
		
		RowMapper<EmpDTO> rm = new RowMapper<EmpDTO>() {
			@Override
			public EmpDTO mapRow(ResultSet rs, int arg1) throws SQLException {
				return new EmpDTO(no, rs.getString(2), rs.getDouble(6), rs.getInt(8));
			}
		};
		
		return jdbcTemplate.queryForObject(sb.toString(), rm, no);
	}

	@Override
	public int insertOne(EmpDTO dto) {
		sb.setLength(0);
		sb.append("insert into emp ");
		sb.append("values (? , ? , ? ) ");
		
		// jdbcTemplate.update(sql문, ?에 들어갈 값을 순서대로)
		return jdbcTemplate.update(sb.toString(), dto.getEmpno(), dto.getEname(), dto.getSal(), dto.getDeptno());
	}

	@Override
	public int updateOne(EmpDTO dto) {
		sb.setLength(0);
		sb.append("update emp ");
		sb.append("set dname = ?, loc = ? ");
		sb.append("where deptno = ? ");
		
		return jdbcTemplate.update(sb.toString(), dto.getEname(), dto.getSal(), dto.getDeptno());
		
	}

	@Override
	public int deleteOne(int no) {
		sb.setLength(0);
		sb.append("delete from emp ");
		sb.append("where empno = ?");
		
		return jdbcTemplate.update(sb.toString(), no);
	}

	
}
