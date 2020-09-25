package br.com.andreacorp.horasextras.controller;




import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;

import br.com.andreacorp.horasextras.dao.AtividadeDAO;
import br.com.andreacorp.horasextras.model.Atividade;

@CrossOrigin("*")

		// vamos definir que a classe é um RestController para exPOR URLs(nossa API)
	@RestController
	public class AtividadeController {
		// aqui vamos entender um conceito "Injeção de Dependência"

		@Autowired
		AtividadeDAO dao;

		@GetMapping("/atividade")
		public ArrayList<Atividade> buscarTodos() {
			ArrayList<Atividade> lista;
			lista = (ArrayList<Atividade>)dao.findAll();
			return lista;
		}
	}
		