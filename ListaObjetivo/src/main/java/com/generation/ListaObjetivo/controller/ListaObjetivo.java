package com.generation.ListaObjetivo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-objetivo")
public class ListaObjetivo {
	
	@GetMapping
	public String listaObjetivo() {

		return"|-----Lista de Objetivos----|\n" 
			
			+ "1ª - Estudar MySQL\n" 
			+ "2ª - Fazer revisão de Java\n"
			+ "3ª - Fazer revisão das materias liberadas\n"
			+ "4ª - Fazer todas as atividades prospostas em aula\n"
			+ "5ª - Refazer os exercicios\n"
			
			+ "|----Encerramento---|";

	
}
}