package com.lamppit.desafio.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lamppit.desafio.model.Oportunidades;
import com.lamppit.desafio.model.Projeto;

@RestController
@RequestMapping(value="/projetos")
public class ProjetoController {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Projeto> listar() {
		
		Date data_inicio = new Date();
		Date data_encerramento = new Date();
		
		Oportunidades op = new Oportunidades();
		
		Projeto proj1 = new Projeto(1, "Projeto Detran", "Detran PB SEDE", 10000.00, data_inicio, data_encerramento, op);
		Projeto proj2 = new Projeto(2, "Projeto DataPrev", "Previdencia PB", 80000.00,data_inicio, data_encerramento, op);
		Projeto proj3 = new Projeto(3, "Projeto UFPB", "universidade federal da paraiba", 50000.00, data_inicio,data_encerramento,op);
		Projeto proj4 = new Projeto(4, "TRE", "Tribunal Regional Eleitoral", 200000.00, data_inicio, data_encerramento, op);
		
		List<Projeto> lista = new ArrayList<>();
		lista.add(proj1);
		lista.add(proj2);
		lista.add(proj3);
		lista.add(proj4);
		
		return lista;
	}
	
}
