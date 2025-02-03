package com.inditex.service.infraestructure.database.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PriceEntityRepository extends JpaRepository<PriceEntity, Long>, JpaSpecificationExecutor<PriceEntity> {

}
