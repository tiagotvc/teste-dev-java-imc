package com.imccalculator.imccalculator.resources;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.imccalculator.imccalculator.models.Pessoa;
import com.imccalculator.imccalculator.services.PessoaService;

@RestController
@RequestMapping(value="/pessoas")
public class PessoaResource {
	
	@Autowired
	private PessoaService service;
	
	@RequestMapping(value="/id/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> findbyId(@PathVariable Long id) {
		Pessoa obj = service.findbyId(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
	@RequestMapping(value="/{cpf}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable String cpf) {
		Pessoa obj = service.find(cpf);
		return ResponseEntity.ok().body(obj);
		
	}
	
	@RequestMapping(value="/save" , method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Pessoa obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

}
