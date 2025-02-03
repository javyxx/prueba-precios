package com.inditex.service.infraestructure.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inditex.service.domain.model.Price;
import com.inditex.service.domain.model.PriceRequest;
import com.inditex.service.domain.repository.FindPriceRepository;

@Service
public class FindPriceService {
	
	@Autowired
	private FindPriceRepository findPriceRepository;

	public Optional<Price> findPrice(PriceRequest request){
		List<Price> prices =  findPriceRepository.findPriceBy(request);
		return prices.stream().sorted(Comparator.comparingInt(p -> ((Price) p).getPriority()).reversed()) // Ordenar por prioridad descendente
	            .findFirst(); // Tomar el primer elemento;
	}
}
