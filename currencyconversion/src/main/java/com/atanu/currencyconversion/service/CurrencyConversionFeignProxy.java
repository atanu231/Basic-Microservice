package com.atanu.currencyconversion.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.atanu.currencyconversion.dto.CurrencyConversionDTO;

@FeignClient(name = "forex-service",url = "localhost:8000")
public interface CurrencyConversionFeignProxy {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionDTO retrieveExchangeValue(@PathVariable String from, @PathVariable String to);

}
