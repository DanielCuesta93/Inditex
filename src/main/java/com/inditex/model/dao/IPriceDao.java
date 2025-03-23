package com.inditex.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.inditex.model.entitys.Price;

public interface IPriceDao extends CrudRepository<Price, Long>{

}
