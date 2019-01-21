package br.com.danilo.teste.taxa.ws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.danilo.teste.taxa.ws.enums.TipoRisco;

@Entity
@Table(name = "TB_TAXA")
public class Taxa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TAXA")
	private Long id;

	@Column(name = "NU_LIMITE_CREDITO")
	private String limiteCredito;

	@Column(name = "DE_CPF")
	private String cpf;

	@Column(name = "DE_RISCO")
	private TipoRisco tipoRisco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(String limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public TipoRisco getTipoRisco() {
		return tipoRisco;
	}

	public void setTipoRisco(TipoRisco tipoRisco) {
		this.tipoRisco = tipoRisco;
	}

}
