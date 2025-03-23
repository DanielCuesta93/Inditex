package com.inditex.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/prices")
public class PriceController {

    @GetMapping
    public String prices(){   	
    	return "prices-view";
    }
}
