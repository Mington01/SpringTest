package com.en3873.spring.test.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.en3873.spring.test.mybatis.model.RealEstate;

@Repository
public interface RealEstateDAO {
	
	public RealEstate selectRealEstate(@Param("id") int id);
	
	public List<RealEstate> selectRealEstateByRent(@Param("rentPrice") int rentPrice);
	
	public List<RealEstate> selectRealEstateByAreaPrice(
			@Param("area") int area
			, @Param("price") int price);
	
	public int insertRealEstateByObject(RealEstate realEstate);
	// 객체 형태로 보낼때는 param 어노테이션 필요없음
	
	public int insertRealEstate(
			@Param("officeId") int officeId
			, @Param("address") String address
			, @Param("area") int area
			, @Param("type") String type
			, @Param("price") int price
			, @Param("rentPrice") int rentPrice);
	
	public int updateRealEstate(
			@Param("id") int id
			, @Param("type") String type
			, @Param("price") int price);
	
	public int deleteRealEstate(@Param("id") int id);

}
