package org.digitalse.TextExtractSvc.dto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import opennlp.tools.util.Span;

public class TokenProbDto {
	private String texto;
	private InputStream is;
	private double[] probs;
	
	public TokenProbDto(String texto) {
		this.texto = texto;
		try {
			is = new FileInputStream("./data/pt-token.bin");
			TokenizerModel tm = new TokenizerModel(is);
			TokenizerME tk = new TokenizerME(tm);
			Span tokens[] = tk.tokenizePos(texto);
			probs = tk.getTokenProbabilities();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public double[] getProbs() {
		return probs;
	}

}
