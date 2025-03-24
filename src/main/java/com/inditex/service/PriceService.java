package com.inditex.service;

import org.springframework.stereotype.Service;

import com.inditex.model.PriceResponse;
import com.inditex.service.inter.IPriceService;

@Service
public class PriceService implements IPriceService {
	
	@Override
	public PriceResponse getPrice(String fecahConsulta, int productoId, int marcaId) {
		return null;
	}

}
