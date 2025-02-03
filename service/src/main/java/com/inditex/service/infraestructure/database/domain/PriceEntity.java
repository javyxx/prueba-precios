package com.inditex.service.infraestructure.database.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.time.OffsetDateTime;


@Data
@Entity
@Table(name = "PRICES")
public class PriceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "BRAND_ID", nullable = false)
    private Integer brandId;

    @Column(name = "START_DATE", nullable = false)
    private OffsetDateTime startDate;

    @Column(name = "END_DATE", nullable = false)
    private OffsetDateTime endDate;

    @Column(name = "PRODUCT_ID", nullable = false)
    private Integer productId;

    @Column(name = "PRICE_LIST", nullable = false)
    private Integer priceList;

    @Column(name = "PRIORITY", nullable = false)
    private Integer priority;

    @Column(name = "PRICE", nullable = false)
    private Float price;

    @Column(name = "CURR", nullable = false, length = 3)
    private String currencyIso;
}