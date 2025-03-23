package com.inditex.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inditex.model.dao.IPriceDao;
import com.inditex.model.entitys.Price;
import com.inditex.model.service.inter.IPriceService;

@Service
public class PriceService implements IPriceService {

	@Autowired
	private IPriceDao priceDao;
	
	@Override
	public List<Price> getPrice() {
		return (List<Price>) priceDao.findAll();
	}

}
