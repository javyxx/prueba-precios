package com.inditex.service.infraestructure.web;

import java.time.OffsetDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.inditex.prueba.api.TarifasApi;
import com.inditex.prueba.model.TarifasResponse;
import com.inditex.service.domain.model.Price;
import com.inditex.service.domain.model.PriceRequest;
import com.inditex.service.infraestructure.service.FindPriceService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
public class TarifasController implements TarifasApi {
	
	@Autowired
	private FindPriceService service;

	@Override
	public ResponseEntity<TarifasResponse> obtenerTarifas(@NotNull @Valid OffsetDateTime fechaAplicacion,
			@NotNull @Valid Integer productoId, @NotNull @Valid Integer cadenaId) {
		Optional<Price> resultado = service.findPrice(new PriceRequest(fechaAplicacion, productoId, cadenaId));
		if(resultado.isPresent()) {
			Price price = resultado.get();
			TarifasResponse tarifasResponse = new TarifasResponse();
			tarifasResponse.setCadenaId(price.getBrandId());
			tarifasResponse.setFechaFin(price.getEndTime());
			tarifasResponse.setFechaInicio(price.getStartDate());
			tarifasResponse.setPrecioFinal(price.getPrice());
			tarifasResponse.setProductoId(price.getProductId());
			tarifasResponse.setTarifaId(price.getPriceList());
			return ResponseEntity.ok(tarifasResponse);
		}

		return null;
	}

}
