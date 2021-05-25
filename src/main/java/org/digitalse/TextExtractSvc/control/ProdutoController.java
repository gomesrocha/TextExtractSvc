package org.digitalse.TextExtractSvc.control;

import java.util.List;

import org.digitalse.TextExtractSvc.dto.ProdutoDto;
import org.digitalse.TextExtractSvc.entity.Produto;
import org.digitalse.TextExtractSvc.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public List<ProdutoDto> listar(){
		List<Produto> produtos = produtoRepository.findAll();
		return ProdutoDto.converter(produtos);
				
	}
	
	
}
