package br.com.bancowsnBoaventura.Boaventura.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bancowsnBoaventura.Boaventura.dao.BoaventuraDao;
import br.com.bancowsnBoaventura.Boaventura.model.Correntista;
import br.com.bancowsnBoaventura.Boaventura.model.Fluxo;

@RestController
public class BoaventuraController {

	@Autowired
	private BoaventuraDao dao;
	@GetMapping("/Movimentos")
	public ArrayList<Correntista> recuperarTudo(){
		ArrayList<Correntista> movimento;
		movimento = (ArrayList<Correntista>)dao.findAll();
		return movimento;
}
}