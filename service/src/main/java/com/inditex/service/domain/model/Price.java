package com.inditex.service.domain.model;

import java.time.OffsetDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Price {
	private Integer brandId;
	private OffsetDateTime startDate;
	private OffsetDateTime endTime;
	private Integer productId;
	private Integer priceList;
	private Integer priority;
	private Float price;
	private String currencyIso;
	
}
