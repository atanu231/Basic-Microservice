package com.atanu.currencyconversion.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.atanu.currencyconversion.dto.CurrencyConversionDTO;
import com.atanu.currencyconversion.service.CurrencyconversionService;

@RestController
public class CurrencyConversionController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CurrencyconversionService service;

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionDTO convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable Double quantity) {

		CurrencyConversionDTO currencyconversionDTO = new CurrencyConversionDTO().setFrom(from).setTo(to)
				.setQuantity(quantity);

		return service.fetchCurrencyMultipleAndConvert(currencyconversionDTO);

	}
	
	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionDTO convertCurrencyFeign(@PathVariable String from, @PathVariable String to,
			@PathVariable Double quantity) {

		CurrencyConversionDTO currencyconversionDTO = new CurrencyConversionDTO().setFrom(from).setTo(to)
				.setQuantity(quantity);

		return service.fetchCurrencyMultipleAndConvertFeign(currencyconversionDTO);

	}

}
