package br.com.financeiro.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.financeiro.model.Status;
import br.com.financeiro.model.Titulo;
import br.com.financeiro.repository.TitulosRepository;
import br.com.financeiro.service.CadastroTituloService;

@Controller
public class TitulosController {

	@Autowired
	private TitulosRepository titulosRepository;
	
	@Autowired
	private CadastroTituloService cadastroTituloService;

	@RequestMapping("/titulos/novo")
	public ModelAndView novo(Titulo titulo) {
		
		  ModelAndView mv = new ModelAndView("titulo/CadastroTitulo");
		  mv.addObject("status", Status.values());

		return mv;
	}

	@RequestMapping(value = "/titulos/novo", method = RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Titulo titulo, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			
			return novo(titulo);
		}

		cadastroTituloService.salvar(titulo);
		
		attributes.addFlashAttribute("mensagem", "Titulo salvo com sucesso!");
		
		return  new ModelAndView("redirect:/titulos/novo");
	}

}
