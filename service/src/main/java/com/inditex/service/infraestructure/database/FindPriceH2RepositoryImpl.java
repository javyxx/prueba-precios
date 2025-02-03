package com.inditex.service.infraestructure.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inditex.service.domain.model.Price;
import com.inditex.service.domain.model.PriceRequest;
import com.inditex.service.domain.repository.FindPriceRepository;
import com.inditex.service.infraestructure.database.domain.PriceEntity;
import com.inditex.service.infraestructure.database.domain.PriceEntityRepository;
import com.inditex.service.infraestructure.database.domain.PriceEntitySpecification;

@Repository
public class FindPriceH2RepositoryImpl implements FindPriceRepository {
	
	@Autowired
	private PriceEntityRepository repository;

	@Override
	public List<Price> findPriceBy(PriceRequest request) {
		List<PriceEntity> prices =  repository.findAll(PriceEntitySpecification.filterByDateProductAndBrand(request));
		return map(prices);
	}

	private List<Price> map(List<PriceEntity> prices) {
		return prices.stream().map(price-> new Price(price.getBrandId(), price.getStartDate(), price.getEndDate(), price.getProductId(), price.getPriceList(), price.getPriority(), price.getPrice(), price.getCurrencyIso() )).toList();
	}

}
