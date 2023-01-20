package com.en3873.spring.test.jsp.realtor.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.en3873.spring.test.jsp.realtor.dao.RealtorDAO;
import com.en3873.spring.test.jsp.realtor.model.Realtor;

@Service
public class RealtorBO {
	
	@Autowired
	private RealtorDAO realtorDAO;
	
	public int addRealtor(Realtor realtor) {
		
		return realtorDAO.insertRealtor(realtor);
	}

}
