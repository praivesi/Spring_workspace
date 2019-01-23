package spring_app04;

import java.sql.Connection;

public interface CommonDAO {
	public Connection connect();
	public void selectAll();
	public void selectOne(int no);
}
