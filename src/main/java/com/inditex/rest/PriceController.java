package com.inditex.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inditex.model.PriceResponse;
import com.inditex.service.PriceService;


@Controller
@RequestMapping("/prices")
public class PriceController {

	@Autowired
    private PriceService priceService;
	
    @GetMapping
    public String prices(Model model){   	
    	return "prices-view";
    }
    
    @GetMapping("/api/price")
    public ResponseEntity<List<PriceResponse>> getPrice(@RequestParam String fechaConsulta,
                                                  @RequestParam int productoId,
                                                  @RequestParam int marcaId) {
        // Lógica para obtener los precios a partir de los parámetros
    	List<PriceResponse> prices = priceService.getPrice(fechaConsulta, productoId, marcaId);

        if (prices == null) {
            return ResponseEntity.status(404).body(null);  // NOT_FOUND
        }

        return ResponseEntity.ok(prices);  // Devuelve el precio en formato JSON
    }
}
