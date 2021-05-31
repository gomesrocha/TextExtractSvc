package org.digitalse.TextExtractSvc.Form;

import org.digitalse.TextExtractSvc.entity.Produto;
import org.digitalse.TextExtractSvc.repository.ProdutoRepository;

public class AtualizaProdutoForm {
	private String nome;
	private String fornecedor;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
	public String getNome() {
		return nome;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public Produto atualizar(Long id, ProdutoRepository repositorio) {
		Produto produto = repositorio.getOne(id);
		produto.setNome(this.nome);
		produto.setFornecedor(this.fornecedor);
		return produto;
	}
}
