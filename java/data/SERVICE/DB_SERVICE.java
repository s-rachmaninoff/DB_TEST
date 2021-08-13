package data.SERVICE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.DAO.DB_DAO_INTERFACE;
import data.DTO.DB_DTO;

@Service
public class DB_SERVICE implements DB_SERVICE_INTERFACE {
	
	@Autowired
	private DB_DAO_INTERFACE dao;
	
	@Override
	public String getUserName(String name) {
		
		return dao.getUserName(name);
	}
	
	@Override
	public String getUserGender(String gender) {
		return dao.getUserGender(gender);
	}
	
	@Override
	public int getUserAge(String age) {
		return dao.getUserAge(age);
	}
	
	@Override
	public DB_DTO getUserAll(String all) {
		return dao.getUserAll(all);
	}
	
	
}
