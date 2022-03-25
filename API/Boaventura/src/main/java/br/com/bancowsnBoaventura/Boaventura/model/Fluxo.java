package br.com.bancowsnBoaventura.Boaventura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="tb_contas")
	public class Fluxo {
	
	@Id
	@Column(name="ag")
	private int ag;
	
	@Column(name="conta")
	private int conta;
	
	@Column(name="fluxo")
	private int fluxo;
	
	public int getAg() {
		return ag;
	}

	public void setAg(int ag) {
		this.ag = ag;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getFluxo() {
		return fluxo;
	}

	public void setFluxo(int fluxo) {
		this.fluxo = fluxo;
	}

	public double getEntrada() {
		return entrada;
	}

	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}

	public double getSaida() {
		return saida;
	}

	public void setSaida(double saida) {
		this.saida = saida;
	}

	public Correntista getTitular() {
		return titular;
	}

	public void setTitular(Correntista titular) {
		this.titular = titular;
	}

	@Column(name="entrada")
	private double entrada ;
	
	@Column(name="saida")
	private double saida;
	
	@ManyToOne
	@JoinColumn(name="conta")
	private Correntista titular;
}
