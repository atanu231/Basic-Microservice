package com.atanu.basicmicroservice.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.atanu.basicmicroservice.domain.ExchangeValue;
import com.atanu.basicmicroservice.service.ExchangeValueService;

/**
 * @author Atanu Baidya
 *
 */
@RestController
public class ForexController {

	@Autowired
	ExchangeValueService service;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangevalue(@PathVariable String from, @PathVariable String to) {
		return service.fetchExchangeValueByFromAndTo(from, to);

	}

}
