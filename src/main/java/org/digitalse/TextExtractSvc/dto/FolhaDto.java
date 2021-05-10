package org.digitalse.TextExtractSvc.dto;

public class FolhaDto {
	private double salario;
	private double inss;
	private double irrf;
	private double salarioLiquido;
	
	public FolhaDto(double salario) {
		this.salario = salario;
		
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getInss() {
		if(this.salario < 1100.01) {
			this.inss = this.salario * 0.075;
		} else if(this.salario > 1100.00 && this.salario < 2203.46) {
			this.inss = this.salario * 0.09;
		} else if(this.salario > 2203.45 && this.salario < 3305.23) {
			this.inss = this.salario * 0.12;
		}else if(this.salario > 3305.22 && this.salario < 6433.57) {
			this.inss = this.salario * 0.14;
		}		else if(this.salario > 6433.57) {
			this.inss = 6433.57 * 0.14;
		}
		return inss;
	}
	
	public double getIrrf() {
		double salariosinss = this.salario - getInss();
		if(salariosinss < 1903.99) {
			this.irrf = 0;
		}else if(salariosinss > 1903.98 && salariosinss < 2826.66) {
			this.irrf =salariosinss * 0.075;
		}else if(salariosinss > 2826.65 && salariosinss < 3751.06) {
			this.irrf =salariosinss * 0.15;
		}else if(salariosinss > 3751.05 && salariosinss < 4664.69) {
			this.irrf =salariosinss * 0.225;
		}else if(salariosinss > 4664.68) {
			this.irrf =salariosinss * 0.275;
		}
		return irrf;
	}
	
	public double getSalarioLiquido() {
		this.salarioLiquido = this.salario - (getInss() + getIrrf());
		return salarioLiquido;
	}

}
