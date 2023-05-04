package br.com.papelaria.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.papelaria.projeto.domain.Produto;
import br.com.papelaria.projeto.repository.ProdutoRepository;

@RestController
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository pd;
	
	@GetMapping("/produto/listar")
	public List<Produto> listar(){
		return pd.findAll();
	}
	@PostMapping("/produto/cadastrar")
	public String cadastrar(@RequestBody Produto po) {
		String msg="";
		pd.save(po);
		msg = "Produto Cadastrado com Sucesso!";
		return msg;	
	}
}
