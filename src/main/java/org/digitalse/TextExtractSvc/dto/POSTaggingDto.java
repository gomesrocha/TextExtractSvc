package org.digitalse.TextExtractSvc.dto;

import model.POSTagging;

public class POSTaggingDto {
	private String texto;
	private String textoTag;
	
	public POSTaggingDto(String texto) {
		this.texto = texto;
		POSTagging tagging = new POSTagging();
		this.textoTag = tagging.tag(texto);
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
