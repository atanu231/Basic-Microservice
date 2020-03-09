package com.atanu.basicmicroservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

	@Id
	private Long id;

	@Column(name = "currency_from")
	private String from;

	@Column(name = "currency_to")
	private String to;

	private Double conversionMultiple;
	private int port;

	public Long getId() {
		return id;
	}

	public ExchangeValue setId(Long id) {
		this.id = id;
		return this;
	}

	public String getFrom() {
		return from;
	}

	public ExchangeValue setFrom(String from) {
		this.from = from;
		return this;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Double getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(Double conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public int getPort() {
		return port;
	}

	public ExchangeValue setPort(int port) {
		this.port = port;
		return this;
	}
	
	public ExchangeValue() {}

	public ExchangeValue(Long id, String from, String to, Double conversionMultiple, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.port = port;
	}
	

}
