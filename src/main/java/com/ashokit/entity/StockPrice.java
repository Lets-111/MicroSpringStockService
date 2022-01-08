package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "STOCK_PRICE")
@Data
public class StockPrice {

	@Id
	@Column(name = "STOCK_ID")
	private Integer stockId;

	@Column(name = "COMPANY_NAME")
	private String companyName;

	@Column(name = "COMPANY_PRICE")
	private Double companyPrice;

	// adding new features as part of JIRA-3381
	@Column(name="QUANTITY")
	private int quantity;

	@Column(name="IS_DIVIDEND)
	private boolean isDividend;

	// toString()
	
	public String toString()
	{
		return "Hello";
	}

}
