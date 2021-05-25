package org.digitalse.TextExtractSvc.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.digitalse.TextExtractSvc.entity.Produto;
import org.springframework.data.domain.Page;

public class ProdutoDto {
	private long id;
	private String nome;
	private String fornecedor;
	
	public ProdutoDto(Produto produto) {
		this.nome = produto.getNome();
		this.fornecedor = produto.getFornecedor();
	}
	public String getNome() {
		return nome;
	}
	public String getFornecedor() {
		return fornecedor;	
	}
	public static List<ProdutoDto> converter(List<Produto> produtos){
		return produtos.stream().map(ProdutoDto::new).collect(Collectors.toList());
		//return produtos.map(ProdutoDto::new);
	}


}
