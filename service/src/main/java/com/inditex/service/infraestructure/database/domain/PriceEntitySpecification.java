package com.inditex.service.infraestructure.database.domain;

import org.springframework.data.jpa.domain.Specification;

import com.inditex.service.domain.model.PriceRequest;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class PriceEntitySpecification {
    public static Specification<PriceEntity> filterByDateProductAndBrand(
    		PriceRequest priceRequest) {
        return (Root<PriceEntity> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) -> {
            Predicate datePredicate = criteriaBuilder.and(
                criteriaBuilder.lessThanOrEqualTo(root.get("startDate"), priceRequest.getApplicationDate()),
                criteriaBuilder.greaterThanOrEqualTo(root.get("endDate"),  priceRequest.getApplicationDate())
            );
            Predicate productPredicate = criteriaBuilder.equal(root.get("productId"), priceRequest.getProductId());
            Predicate brandPredicate = criteriaBuilder.equal(root.get("brandId"), priceRequest.getBrandId());
            
            return criteriaBuilder.and(datePredicate, productPredicate, brandPredicate);
        };
    }
}
