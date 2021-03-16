package com.fatec.pwcap04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@GetMapping("/paginaMenu/home")
	public ModelAndView menu() {
		return new ModelAndView ("home");
	}
	
	@GetMapping("/login")
	public ModelAndView autenticacao() {
		return new ModelAndView ("login");
	}
	
	//@RequestMapping(value = "/aluno/cadastrar", method = RequestMethod.GET)
	@GetMapping ("/paginaMenu/servicos")
	public ModelAndView servicos() {
		return new ModelAndView ("servicos");
	}
	
	@GetMapping("/paginaMenu/sobre")
	public ModelAndView sobre() {
		return new ModelAndView ("sobre");
	}
	
	@GetMapping("/paginaMenu/faleConosco")
	public ModelAndView faleConosco() {
		return new ModelAndView("faleConosco");
	}
	
}
