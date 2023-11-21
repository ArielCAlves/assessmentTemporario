package br.edu.infnet.appSistemaRecomendacao.model.domain;

import java.time.LocalDateTime;

public class Genero {
	private String classificacao;
	private LocalDateTime dataClassificacao;
	private int popularidade;
	
	@Override
	public String toString() {
		return String.format("classificacao (%s) - dataClassificacao (%s) - popularidade (%d)",
				classificacao, dataClassificacao, popularidade);
	}
	
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public LocalDateTime getDataClassificacao() {
		return dataClassificacao;
	}
	public void setDataClassificacao(LocalDateTime dataClassificacao) {
		this.dataClassificacao = dataClassificacao;
	}
	public int getPopularidade() {
		return popularidade;
	}
	public void setPopularidade(int popularidade) {
		this.popularidade = popularidade;
	}
}
