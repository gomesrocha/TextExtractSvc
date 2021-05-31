package org.digitalse.TextExtractSvc.control;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.digitalse.TextExtractSvc.Form.AtualizaProdutoForm;
import org.digitalse.TextExtractSvc.Form.ProdutoForm;
import org.digitalse.TextExtractSvc.dto.ProdutoDto;
import org.digitalse.TextExtractSvc.entity.Produto;
import org.digitalse.TextExtractSvc.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoRepository produtoRepository;
	// Read - Ler
	@GetMapping
	public List<ProdutoDto> listar(){
		List<Produto> produtos = produtoRepository.findAll();
		return ProdutoDto.converter(produtos);
				
	}
	// Create -- Cadastrar
	@PostMapping
	@Transactional
	public void salvar(@RequestBody ProdutoForm produtoForm) {
		Produto produto = produtoForm.converter();
		produtoRepository.save(produto);
		
		
	}
	// Delete -- Remover/apagar
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<ProdutoDto> apagar(@PathVariable Long id){
		produtoRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}
	//Update -- Atualizar
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<ProdutoDto> atualizar(@PathVariable Long id, @RequestBody AtualizaProdutoForm apf){
		Optional<Produto> optional = produtoRepository.findById(id);
		if(optional.isPresent()) {
			Produto produto = apf.atualizar(id, produtoRepository);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
		
	}
	
}
