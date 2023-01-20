package com.en3873.spring.test.mybatis.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.en3873.spring.test.mybatis.dao.RealEstateDAO;
import com.en3873.spring.test.mybatis.model.RealEstate;

@Service
public class RealEstateBO {
	
	// id 가 22인 데이터 조회 리턴
	@Autowired
	private RealEstateDAO realEstateDAO;
	
	public RealEstate getRealEstate(int id) {
		
		// 파라미터로 전달 받은 id 데이터 조회
		RealEstate realEstate = realEstateDAO.selectRealEstate(id);
		
		return realEstate;
	}
	
	public List<RealEstate> getRealEstateListByRent(int rentPrice) {
		
		List<RealEstate> realEstateList = realEstateDAO.selectRealEstateByRent(rentPrice);
		
		return realEstateList;
	}
	
	public List<RealEstate> getRealEstateListByAreaPrice(int area, int price) {
		
		return realEstateDAO.selectRealEstateByAreaPrice(area, price);
	}

	
	// 객체를 기반으로 한행을 저장하는 기능
	public int addRealEstateByObject(RealEstate realEstate) {
		
		return realEstateDAO.insertRealEstateByObject(realEstate);
	}
	
	// 저장할 값을 모두 전달 받고 저장하는 기능
	public int addRealEstate(
			int officeId
			, String address
			, int area
			, String type
			, int price
			, int rentPrice) {
		
		return realEstateDAO.insertRealEstate(officeId, address, area, type, price, rentPrice);
		
	}
	
	// test03 : 변경할 id, type, price를 전달 받아서 update를 수행
	public int updateRealEstate(int id, String type, int price) {
		return realEstateDAO.updateRealEstate(id, type, price);
		
	}
	
	// test04
	public int deleteRealEstate(int id) {
		return realEstateDAO.deleteRealEstate(id);
	}
}
