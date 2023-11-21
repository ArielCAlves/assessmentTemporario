package br.edu.infnet.appSistemaRecomendacao.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appSistemaRecomendacao.model.domain.Genero;

@Service
public class GeneroService {
	private Map<String, Genero> mapa = new HashMap<String, Genero>();
	
	public void incluir(Genero genero) {
		mapa.put(genero.getClassificacao(), genero);
	}
	
	public Collection<Genero> obterLista(){
		return mapa.values();
	}
}
