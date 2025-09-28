package br.edu.atitus.product_service.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.atitus.product_service.entities.CurrencyEntity;

public interface CurrencyRepository 
		extends JpaRepository<CurrencyEntity, Long>{

	Optional<CurrencyEntity> findBySourceAndTarget
				(String source, String target);
}







