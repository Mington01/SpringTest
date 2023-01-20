package com.en3873.spring.test.database.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.en3873.spring.test.database.model.Store;

@Repository
public interface StoreDAO {

	public List<Store> selectStoreList();

}
