package com.srsolution.vinhos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.srsolution.vinhos.model.Aluno;

@Controller
@RequestMapping("/alunos")
public class AlunoController {
	
	private static final String VIEWER = "aluno/cadastro-alunos";
	
	@RequestMapping("/novo")
	public ModelAndView novo(Aluno aluno){
		
		ModelAndView mav = new ModelAndView(VIEWER);	
		return mav.addObject(aluno);
		
	}
	
	
	
	
	

}
