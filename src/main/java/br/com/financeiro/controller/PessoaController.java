package br.com.financeiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PessoaController {
	
	@RequestMapping("/pessoa/novo")
	public String novo() {
		return "pessoa/CadastroPessoa";
	}

}
