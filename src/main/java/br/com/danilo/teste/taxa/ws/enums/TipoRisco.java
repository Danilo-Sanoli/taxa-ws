package br.com.danilo.teste.taxa.ws.enums;

public enum TipoRisco {

	A(0), B(10), C(20);

	private Integer porcentagem;

	TipoRisco(Integer porcentagem) {
		this.porcentagem = porcentagem;
	}

	public Integer getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(Integer porcentagem) {
		this.porcentagem = porcentagem;
	}

}
