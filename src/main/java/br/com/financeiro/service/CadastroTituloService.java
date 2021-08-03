package br.com.financeiro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.financeiro.model.Titulo;
import br.com.financeiro.repository.TitulosRepository;

@Service
public class CadastroTituloService {
	
	@Autowired
	private TitulosRepository titulosRepository;
	
	public void salvar(Titulo titulo) {
		
		titulosRepository.save(titulo);
		
	}
	
	

}
