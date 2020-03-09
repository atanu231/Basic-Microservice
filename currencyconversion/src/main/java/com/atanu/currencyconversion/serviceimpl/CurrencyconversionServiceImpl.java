package com.atanu.currencyconversion.serviceimpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.atanu.currencyconversion.dto.CurrencyConversionDTO;
import com.atanu.currencyconversion.service.CurrencyConversionFeignProxy;
import com.atanu.currencyconversion.service.CurrencyconversionService;

@Service
public class CurrencyconversionServiceImpl implements CurrencyconversionService {

	@Autowired
	Environment env;

	@Autowired
	CurrencyConversionFeignProxy feignProxy;

	@Override
	public CurrencyConversionDTO fetchCurrencyMultipleAndConvert(CurrencyConversionDTO currencyconversionDTO) {

		Map<String, String> map = generateURLMap(currencyconversionDTO);
		ResponseEntity<CurrencyConversionDTO> currencyResponseentity = new RestTemplate()
				.getForEntity(env.getProperty("forex.service.url"), CurrencyConversionDTO.class, map);
		CurrencyConversionDTO currencyConversionObj = currencyResponseentity.getBody()
				.setQuantity(currencyconversionDTO.getQuantity());
		return currencyConversionObj;
	}

	@Override
	public CurrencyConversionDTO fetchCurrencyMultipleAndConvertFeign(CurrencyConversionDTO currencyconversionDTO) {
		return feignProxy.retrieveExchangeValue(currencyconversionDTO.getFrom(), currencyconversionDTO.getTo())
				.setQuantity(currencyconversionDTO.getQuantity());
	}

	private Map<String, String> generateURLMap(CurrencyConversionDTO currencyconversionDTO) {
		Map<String, String> map = new HashMap<>();
		map.put("from", currencyconversionDTO.getFrom());
		map.put("to", currencyconversionDTO.getTo());
		return map;
	}

}
