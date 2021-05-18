package org.digitalse.TextExtractSvc.dto;

import java.io.IOException;

import model.POSTagging;

public class POSTaggingDto {
	private String texto;
	private String textoTag;
	
	public POSTaggingDto(String texto) throws IOException {
		this.texto = texto;
		POSTagging tagging = new POSTagging();
		this.textoTag = "texto";//
		System.out.println(tagging.tag(texto));
		System.out.println(tagging.detectSentences(texto));
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getTextoTag() {
		return textoTag;
	}
	 

}
