package com.inditex.service.domain.repository;

import java.util.List;

import com.inditex.service.domain.model.Price;
import com.inditex.service.domain.model.PriceRequest;

public interface FindPriceRepository {
	public List<Price> findPriceBy(PriceRequest request);
}
