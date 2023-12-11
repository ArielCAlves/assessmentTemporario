package br.edu.infnet.appSistemaRecomendacao.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "TB_MULTIMIDIA")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Multimidia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String titulo;
	private float rating;
	private int membros;
	private String sinopse;
	
	@ManyToMany(mappedBy = "multimidias")	
	private List<Assinatura> assinaturas;
	
	@Override
	public String toString() {
		return String.format("titulo (%s) - rating (%f) - membros (%d) - sinopse (%s)",
				titulo, rating, membros, sinopse);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	
	public List<Assinatura> getAssinatura() {
		return assinaturas;
	}
	public void setAssinatura(List<Assinatura> assinaturas) {
		this.assinaturas = assinaturas;
	}
	
}
