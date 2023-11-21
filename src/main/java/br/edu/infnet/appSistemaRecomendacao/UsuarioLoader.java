package br.edu.infnet.appSistemaRecomendacao;
import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appSistemaRecomendacao.model.domain.Usuario;
import br.edu.infnet.appSistemaRecomendacao.model.service.UsuarioService;

@Order(1)
@Component	
public class UsuarioLoader implements ApplicationRunner {
	
//	private Map<String, Usuario> mapa = new HashMap<String, Usuario>();
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception{
		FileReader file = new FileReader("files/usuarios.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();		
		String[] campos = null;
		
		while (linha != null) {
			campos = linha.split(";");
			
			Usuario usuario = new Usuario();
			usuario.setNome(campos[0]);
			usuario.setCpf(campos[1]);
			usuario.setEmail(campos[2]);
			usuario.setNascimento(campos[3]);
//			usuario.setNascimento(LocalDateTime.valueOf(campos[3]));
			usuario.setGenero(campos[4]);
			usuario.setAtivo(Boolean.valueOf(campos[5]));
			
//			mapa.put(usuario.getCpf(), usuario);	
			
			
			usuarioService.incluir(usuario);
			
			linha = leitura.readLine();			
			
			}
		
//		for(Usuario usuario: mapa.values()) {
//			System.out.println("[USUARIO] " + usuario);					
//			
//		}
		
		for(Usuario usuario: usuarioService.obterLista()) {
			System.out.println("[USUARIO] " + usuario);					
			
		}
			
		
		leitura.close();
	}
}
