package br.edu.infnet.appSistemaRecomendacao.model.service;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appSistemaRecomendacao.model.domain.Usuario;

@Service
public class UsuarioService {
	private Map<String, Usuario> mapa = new HashMap<String, Usuario>();
	
	public void incluir(Usuario usuario) {
		mapa.put(usuario.getCpf(), usuario);
	}
	
	public Collection<Usuario> obterLista(){
		return mapa.values();
	}
}
