package com.lamppit.desafio;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lamppit.desafio.model.Projeto;
import com.lamppit.desafio.repository.ProjetoRepository;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner{

	@Autowired
	private ProjetoRepository projetoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		
		
		
		
	}

}
















