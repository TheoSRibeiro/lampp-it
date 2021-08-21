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
		
		
		Date data_inicio = new Date();
		Date data_encerramento = new Date();

		Projeto proj1 = new Projeto(null, "Projeto Detran", "Detran SEDE", 1000.00, data_inicio, data_encerramento);
		Projeto proj2 = new Projeto(null, "Projeto DataPrev", "previdencia Social", 3000.00, data_inicio, data_encerramento);
		Projeto proj3 = new Projeto(null, "Projeto UFPB", "universidade federal da paraiba", 50000.0, data_inicio, data_encerramento);
		Projeto proj4 = new Projeto(null, "TRE", "Tribunal Regional Eleitoral", 200000.0, data_inicio, data_encerramento);

		projetoRepository.saveAll(Arrays.asList(proj1,proj2,proj3,proj4));
		
		
		
	}

}
















