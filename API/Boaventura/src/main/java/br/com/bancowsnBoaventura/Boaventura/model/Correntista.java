package br.com.bancowsnBoaventura.Boaventura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="correntista")
	public class Correntista {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigoInterno;

	@Column(name="ag")
	private int ag;

	@Column(name="conta")
	private int conta;
	
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setCodigoInterno(int codigoInterno) {
		this.codigoInterno = codigoInterno;
	}

	@Column(name="nome", length=50)
	private String nome;

	@Column(name="telefone", length=20)
	private String telefone;

	@Column(name="email", length=80)
	private String email;
	
	@Column(name="saldo", length=80)
	private double saldo;

	public int getCodigoInterno() {
		return codigoInterno;
	}

	
}
