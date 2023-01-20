package com.en3873.spring.test.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.en3873.spring.test.database.dao.StoreDAO;
import com.en3873.spring.test.database.model.Store;

@Service
public class StoreBO {
	
	@Autowired
	private StoreDAO storeDAO;
	
	public List<Store> getStoreList() {
		List<Store>storeList = storeDAO.selectStoreList();
		
		return storeList;
	}
	

}
