package br.edu.infnet.appSistemaRecomendacao.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appSistemaRecomendacao.model.domain.Anime;


@Service
public class AnimeService {
	private Map<String, Anime> mapa = new HashMap<String, Anime>();
	
	public void incluir(Anime anime) {
		mapa.put(anime.getTitulo(), anime);
	}
	
	public Collection<Anime> obterLista(){
		return mapa.values();
	}

}
