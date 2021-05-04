package org.digitalse.TextExtractSvc.dto;

public class FolhaDto {
	private float salario;
	private float inss;
	private float irrf;
	private float salarioLiquido;
	
	public FolhaDto(float salario) {
		this.salario = salario;
		
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getInss() {
		return inss;
	}
	
	public float getIrrf() {
		return irrf;
	}
	
	public float getSalarioLiquido() {
		return salarioLiquido;
	}

}
