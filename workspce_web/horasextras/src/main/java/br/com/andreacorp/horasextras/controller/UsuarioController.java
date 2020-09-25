package br.com.andreacorp.horasextras.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import br.com.andreacorp.horasextras.dao.UsuarioDAO;
import br.com.andreacorp.horasextras.model.Usuario;

// vamos definir que a classe é um RestController para exPOR URLs(nossa API)
@CrossOrigin("*")
@RestController
public class UsuarioController {
	// aqui vamos entender um conceito "Injeção de Dependência"

	@Autowired
	private UsuarioDAO dao;

	@GetMapping("/usuarios")
	public ArrayList<Usuario> buscarTodos() {
		ArrayList<Usuario> lista;
		lista = (ArrayList<Usuario>) dao.findAll();
		return lista;
	}

	@PostMapping("/usuarios/login")

	public ResponseEntity<Usuario> logarUsuario(@RequestBody Usuario dadosLogin) {

		Usuario res = dao.findByRacf(dadosLogin.getRacf());
		if (res != null) {
			if(res.getSenha().equals(dadosLogin.getSenha())) {
				res.setSenha("*******");
				return ResponseEntity.ok(res);
							}
			else {
				return ResponseEntity.status(401).build();
			}
		}
		else {
			return ResponseEntity.notFound().build();
		}
}


	

}


