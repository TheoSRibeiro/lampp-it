package com.lamppit.desafio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/projetos")
public class ProjetosController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "Rest funcionando!";
	}
	
}
