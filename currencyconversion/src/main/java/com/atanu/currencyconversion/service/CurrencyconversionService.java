package com.atanu.currencyconversion.service;

import java.util.Map;

import com.atanu.currencyconversion.dto.CurrencyConversionDTO;

public interface CurrencyconversionService {
	
	 CurrencyConversionDTO fetchCurrencyMultipleAndConvert(CurrencyConversionDTO currencyconversionDTO);
	 
	 CurrencyConversionDTO fetchCurrencyMultipleAndConvertFeign(CurrencyConversionDTO currencyconversionDTO);

}
