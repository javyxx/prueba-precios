package com.inditex.service.unit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.inditex.service.domain.model.Price;
import com.inditex.service.domain.model.PriceRequest;
import com.inditex.service.domain.repository.FindPriceRepository;
import com.inditex.service.infraestructure.service.FindPriceService;

class FindPriceServiceTest {

    @Mock
    private FindPriceRepository findPriceRepository;

    @InjectMocks
    private FindPriceService findPriceService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindPrice_WithValidRequest_ReturnsHighestPriorityPrice() {
        // Given
        PriceRequest request = new PriceRequest(OffsetDateTime.now(), 1, 2);
        Price price1 = new Price(1, OffsetDateTime.now(), OffsetDateTime.now(), 1, 1, 1, 80f, "eur");
        price1.setPriority(1);
        Price price2 = new Price(1, OffsetDateTime.now(), OffsetDateTime.now(), 1, 1, 1, 60f, "eur");
        price2.setPriority(2);

        when(findPriceRepository.findPriceBy(request)).thenReturn(List.of(price1, price2));

        // When
        Optional<Price> result = findPriceService.findPrice(request);

        // Then
        assertTrue(result.isPresent());
        assertEquals(60f, result.get().getPrice()); // El precio con mayor prioridad debe ser seleccionado
    }

    @Test
    void testFindPrice_WithNoResults_ReturnsEmpty() {
        // Given
        PriceRequest request = new PriceRequest(OffsetDateTime.now(), 1, 2);
        when(findPriceRepository.findPriceBy(request)).thenReturn(List.of());

        // When
        Optional<Price> result = findPriceService.findPrice(request);

        // Then
        assertFalse(result.isPresent());
    }
}