package com.inditex.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inditex.model.PriceResponse;
import com.inditex.model.entitys.Prices;
import com.inditex.repository.PriceRepository;
import com.inditex.service.inter.IPriceService;

@Service
public class PriceService implements IPriceService {
	
	@Autowired
    private PriceRepository priceRepository;
	
	@Override
	public PriceResponse getPrice(String fechaConsulta, int productoId, int marcaId) {
		
		Timestamp consultaFecha = Timestamp.valueOf(fechaConsulta);

        List<Prices> precios = priceRepository.getPrices(marcaId, productoId, consultaFecha);

        if (precios.isEmpty()) {
            return null;
        }

        Prices mejorPrecio = precios.get(0);

        return new PriceResponse(
                mejorPrecio.getProductId(),
                mejorPrecio.getBrandId(),
                mejorPrecio.getPriceList(),
                mejorPrecio.getStartDate(),
                mejorPrecio.getEndDate(),
                mejorPrecio.getPrice(),
                mejorPrecio.getCurr()
        );
	}

}
