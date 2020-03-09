package com.atanu.currencyconversion.dto;

public class CurrencyConversionDTO {
	private Long id;
	private String from;
	private String to;
	private Double conversionMultiple;
	private Double quantity;
	private Double totalCalculatedAmount;
	private int port;

	public Long getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public Double getConversionMultiple() {
		return conversionMultiple;
	}

	public Double getQuantity() {
		return quantity;
	}

	public Double getTotalCalculatedAmount() {
		if (this.quantity != null && this.conversionMultiple != null) {
			this.totalCalculatedAmount = this.quantity * this.conversionMultiple;
		}
		return totalCalculatedAmount;
	}

	public int getPort() {
		return port;
	}

	public CurrencyConversionDTO setId(Long id) {
		this.id = id;
		return this;
	}

	public CurrencyConversionDTO setFrom(String from) {
		this.from = from;
		return this;

	}

	public CurrencyConversionDTO setTo(String to) {
		this.to = to;
		return this;
	}

	public CurrencyConversionDTO setConversionMultiple(Double conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
		return this;
	}

	public CurrencyConversionDTO setQuantity(Double quantity) {
		this.quantity = quantity;
		return this;
	}

	public CurrencyConversionDTO setPort(int port) {
		this.port = port;
		return this;
	}

}
