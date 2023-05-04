package br.com.papelaria.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.papelaria.projeto.domain.ItensPedido;
import br.com.papelaria.projeto.repository.ItensRepository;

@RestController
public class ItensPedidoController {
	
	@Autowired
	private ItensRepository ip;
	
	@GetMapping("/itenspedido/listar")
	public List<ItensPedido> listar(){
		return ip.findAll();
	}
	@PostMapping("/itenspedido/cadastrar")
	public String cadastrar(@RequestBody ItensPedido pd) {
		String msg="";
		ip.save(pd);
		msg = "Os Itens do Seu Pedido Foram Cadastrados!";
		return msg;
	}
}
