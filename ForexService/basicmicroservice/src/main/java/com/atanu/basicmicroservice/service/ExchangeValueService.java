package com.atanu.basicmicroservice.service;

import com.atanu.basicmicroservice.domain.ExchangeValue;

public interface ExchangeValueService {

	ExchangeValue fetchExchangeValueByFromAndTo(String from, String to);
}
