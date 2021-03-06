package com.atanu.basicmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atanu.basicmicroservice.domain.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from, String to);
}
