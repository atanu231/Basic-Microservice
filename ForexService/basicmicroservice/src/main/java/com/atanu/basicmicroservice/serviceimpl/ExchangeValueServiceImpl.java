package com.atanu.basicmicroservice.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.atanu.basicmicroservice.domain.ExchangeValue;
import com.atanu.basicmicroservice.repository.ExchangeValueRepository;
import com.atanu.basicmicroservice.service.ExchangeValueService;

@Service
public class ExchangeValueServiceImpl implements ExchangeValueService {

	@Autowired
	Environment env;

	@Autowired
	private ExchangeValueRepository repository;

	@Override
	public ExchangeValue fetchExchangeValueByFromAndTo(String from, String to) {
		return repository.findByFromAndTo(from, to).setPort(Integer.parseInt(env.getProperty("server.port")));
	}

}
