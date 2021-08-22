package com.lamppit.desafio.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.lamppit.desafio.model.Projeto;
import com.lamppit.desafio.service.ProjetoService;

@RestController
@RequestMapping(value="/projetos")
public class ProjetoController {
	
	@Autowired
	private ProjetoService service;
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Projeto obj = service.find(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
	//INSERIR
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Projeto obj){ //@RequestBody faz o JSon seja convertido para obj JAVA
		obj = service.insert(obj);
		//capturar o id criado e retornar a uri contendo o novo id como resposta da inserção
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		//retornar o 201
		return ResponseEntity.created(uri).build();
	}
	
	//ATUALIZAR
	@RequestMapping(value="{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Projeto obj, @PathVariable Integer id){
		//garantir que o id seja o mesmo que vai ser atualizado
		obj.setId(id);
		obj = service.update(obj);
		
		return ResponseEntity.noContent().build();	
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Projeto>> findAll() {
		List<Projeto> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
}





















