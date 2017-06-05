package com.srsolution.vinhos.model;

public enum SexoAluno {
	
	MASCULINO("Masculino"),
	FEMININO("Feminino");
	
	private String descricao;
	
	
	SexoAluno(String descricao){	
		this.descricao = descricao;
		
	}

	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
