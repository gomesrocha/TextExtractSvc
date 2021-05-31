package org.digitalse.TextExtractSvc.Form;

import org.digitalse.TextExtractSvc.entity.Produto;
import org.digitalse.TextExtractSvc.repository.ProdutoRepository;

public class ProdutoForm {
	private String nome;
	private String fornecedor;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public Produto converter() {
		return new Produto(nome, fornecedor);
	}
	

}
