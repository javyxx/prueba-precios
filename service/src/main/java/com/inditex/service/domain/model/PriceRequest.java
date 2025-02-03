package com.inditex.service.domain.model;

import java.time.OffsetDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PriceRequest {
	private OffsetDateTime applicationDate;
	private Integer productId;
	private Integer brandId;
	
	
}
