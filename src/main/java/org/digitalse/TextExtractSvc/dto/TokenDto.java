package org.digitalse.TextExtractSvc.dto;

import org.digitalse.TextExtractSvc.model.PosTaggerMeBR;
import org.digitalse.TextExtractSvc.model.TextPreProcessingBR;

import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.WhitespaceTokenizer;

public class TokenDto {
	private String texto;
	private String result[];
	private String[] resultTag;
	private PosTaggerMeBR ptmr = null;
	private TextPreProcessingBR tpp = null;
	public TokenDto(String texto) {
		this.texto = texto.toLowerCase();
		Tokenizer tk = WhitespaceTokenizer.INSTANCE;
		tpp = new TextPreProcessingBR();
		this.result = tk.tokenize(texto.toLowerCase());	
		this.result = tpp.removeStopWords(this.result);
		this.ptmr = new PosTaggerMeBR(result);
		this.resultTag = ptmr.getResult();
	}
	
	public String[] getResultTag() {
		return resultTag;
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
