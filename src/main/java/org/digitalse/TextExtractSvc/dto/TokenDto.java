package org.digitalse.TextExtractSvc.dto;

import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.WhitespaceTokenizer;

public class TokenDto {
	private String texto;
	private String result[];
	
	public TokenDto(String texto) {
		this.texto = texto;
		Tokenizer tk = WhitespaceTokenizer.INSTANCE;
		this.result = tk.tokenize(texto);
	}
	public String[] getResult() {
		return result;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	

}
