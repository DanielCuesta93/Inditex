package com.inditex.service.inter;

import com.inditex.model.PriceResponse;

public interface IPriceService {

	public PriceResponse getPrice(String fecahConsulta, int productoId, int marcaId);
}
