package com.srsolution.vinhos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.srsolution.vinhos.model.Aluno;

@Controller
@RequestMapping("/config")
public class ConfigController {

	private static final String VIEWER_CONFIG = "config/config-sistema";

	// Criando a ROTA para 'CONFIGURAÇÃO'
	@RequestMapping("/novo")
	public ModelAndView novo(Aluno aluno) {

		ModelAndView mav = new ModelAndView(VIEWER_CONFIG);
		return mav.addObject(aluno);

	}

	
}
