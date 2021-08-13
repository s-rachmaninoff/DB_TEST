package data.DAO;

import data.DTO.DB_DTO;

public interface DB_DAO_INTERFACE {
	//이름 가져오기
	public String getUserName(String name);
	
	//나이 가져오기
	public int getUserAge(String age);
	
	//성별 가져오기
	public String getUserGender(String gender);
	
	//전부다 가져오기
	public DB_DTO getUserAll(String all);
}
