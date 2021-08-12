package data.DAO;

import java.util.HashMap;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class Db_DAO extends SqlSessionDaoSupport implements DB_DAO_INTERFACE {
	
	//유저 이름 가져오기
	@Override
	public String getUserName() {
			HashMap<String,String> map = new HashMap<String, String>();
				map.put("user_name", "HHJ");
		return getSqlSession().selectOne("getUserName",map);
	}
	
	@Override
	public String getUserGender() {
		return null;
	}
	
	@Override
	public int getUserAge() {
		return 0;
	}
}
