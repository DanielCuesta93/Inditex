package com.inditex.service.inter;

import java.util.List;

import com.inditex.model.PriceResponse;

public interface IPriceService {

	public List<PriceResponse> getPrice(String fecahConsulta, int productoId, int marcaId);
}
