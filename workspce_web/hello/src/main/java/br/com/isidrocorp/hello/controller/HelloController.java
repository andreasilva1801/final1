package br.com.isidrocorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.hello.model.Produto;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
		public String sayHello() {
		return "Olá pessoal!";
	}
	@GetMapping("/produto")
	public Produto exibirProduto() {
		
		Produto p = new Produto();
		p.setId(1234);
		p.setDescricao("Computador");
		p.setPreco(2000.0);
		p.setQtdEstoque(3);
		return p;
	}
		
		


}
