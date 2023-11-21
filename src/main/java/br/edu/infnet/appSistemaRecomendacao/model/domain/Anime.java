package br.edu.infnet.appSistemaRecomendacao.model.domain;

public class Anime {	
	private String titulo;
	private int episodios;
	private float rating;
	private int membros;
	private String sinopse;
	
	@Override
	public String toString() {
		return String.format("titulo (%s) - episodios (%d) - rating (%.2f) - membros (%d) - sinopse (%s)",
				titulo, episodios, rating, membros, sinopse);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getEpisodios() {
		return episodios;
	}
	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

}
