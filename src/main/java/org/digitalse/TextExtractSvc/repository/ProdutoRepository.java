package org.digitalse.TextExtractSvc.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.digitalse.TextExtractSvc.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{	
	
}
