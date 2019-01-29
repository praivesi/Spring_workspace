package kr.co.itbank.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class MysqlDAO implements DAO {

	ConnectionManager cm;
	
	public void setCm(ConnectionManager cm) {
		this.cm = cm;
	}
	
	@Override
	public List<DeptDTO> selectAll() {
		/*SqlSessionFactory factory = cm.getFactory();
		SqlSession ss = factory.openSession(true);
		
		List<DeptDTO> list = ss.selectList("selectAll");
		
		return list;*/
		
		// method chaining
		return cm.getFactory().openSession(true).selectList("selectAll");
	}

	@Override
	public DeptDTO selectOne(int no) {
		return cm.getFactory().openSession(true).selectOne("selectOneByDeptno", no);
	}

	@Override
	public void insertOne(DeptDTO dto) {
		cm.getFactory().openSession(true).insert("insertOneByDept", dto);
	}

	@Override
	public void updateOne(DeptDTO dto) {
		cm.getFactory().openSession(true).update("updateOneByDept", dto);
	}

	@Override
	public void deleteOne(int no) {
		cm.getFactory().openSession(true).delete("deleteOneByDept", no);
	}
	
}
