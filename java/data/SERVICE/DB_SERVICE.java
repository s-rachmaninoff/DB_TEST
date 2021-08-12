package data.SERVICE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.DAO.DB_DAO_INTERFACE;

@Service
public class DB_SERVICE implements DB_SERVICE_INTERFACE {
	
	@Autowired
	private DB_DAO_INTERFACE dao;
	
	@Override
	public String getUserName() {
		
		return dao.getUserName();
	}
	
	@Override
	public String getUserGender() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int getUserAge() {
		// TODO Auto-generated method stub
		return 0;
	}
}
