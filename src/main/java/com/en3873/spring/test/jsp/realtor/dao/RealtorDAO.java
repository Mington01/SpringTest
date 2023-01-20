package com.en3873.spring.test.jsp.realtor.dao;

import org.springframework.stereotype.Repository;

import com.en3873.spring.test.jsp.realtor.model.Realtor;

@Repository
public interface RealtorDAO {
	
	public int insertRealtor(Realtor realtor);

}
