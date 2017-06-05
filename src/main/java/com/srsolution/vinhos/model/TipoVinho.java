package com.srsolution.vinhos.model;

public enum TipoVinho {

	TINTO("Tinto"),
	BRANCO("Branco"),
	ROSE("Rose"),
	CABERNET_SAUVIGNO("Cabernet Sauvignon"),
	CHARDONNAY("Chardonnay");
	
	private String descricao;
	
	TipoVinho(String descricao){
	
		this.descricao = descricao;
		
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
