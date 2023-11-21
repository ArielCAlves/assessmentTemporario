package br.edu.infnet.appSistemaRecomendacao.model.domain;
//import java.time.LocalDate;

public class Usuario {
	private String nome;
	private String cpf;
	private String email;
//	private LocalDate nascimento;
	private String nascimento;
	private String genero;
	private boolean ativo;
//	private List<Anime> historico;
	
	@Override
	public String toString() {
		return String.format("nome (%s) - cpf (%s) - email (%s) - nascimento (%s) - genero (%s) - ativo (%s)",
				nome, cpf, email, nascimento, genero, ativo);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
//	public List<Anime> getAnime() {
//		return animes;
//	}
//	public void setAnime(List<Anime> animes) {
//		this.animes = animes;
//	}
}
