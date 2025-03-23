package com.inditex.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inditex.model.entitys.Price;
import com.inditex.model.service.inter.IPriceService;

@RestController
@RequestMapping("/prices")
public class PriceController {
	
	@Autowired
	private IPriceService priceService;
	
	@GetMapping
	public List<Price> getPrices(){
		return priceService.getPrice();
	}

}
