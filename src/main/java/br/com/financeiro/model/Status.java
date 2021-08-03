package br.com.financeiro.model;

public enum Status {
	
	PENDENTE("Pendente"), PAGO("Pago");
	
	private String descricao;
	
	Status(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	
	
	

}
