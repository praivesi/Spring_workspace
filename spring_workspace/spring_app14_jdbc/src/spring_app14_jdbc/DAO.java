package spring_app14_jdbc;

import java.util.List;

public interface DAO {
	public List<EmpDTO> selectAll();
	public EmpDTO selectOne(int no);
	public int insertOne(EmpDTO dto);
	public int updateOne(EmpDTO dto);
	public int deleteOne(int no);
}
