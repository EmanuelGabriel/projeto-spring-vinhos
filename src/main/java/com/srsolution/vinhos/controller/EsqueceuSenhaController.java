package com.srsolution.vinhos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/vinhos")
public class EsqueceuSenhaController {

	
	private static final String VIEWESQUECEUSENHA = "esqueceu-a-senha";
	
	
	@RequestMapping("/senha")
	public ModelAndView esqueceuSenha(){
		
		return new ModelAndView(VIEWESQUECEUSENHA);
		
		
	}
	
	
	
	
	
}
