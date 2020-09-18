package com.imccalculator.imccalculator.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imccalculator.imccalculator.models.Pessoa;
import com.imccalculator.imccalculator.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repo;
	
	public Pessoa find(String cpf) {
		Optional<Pessoa> obj = repo.findByCpf(cpf);
		return obj.orElse(null);
		
	}
	
	public Pessoa findbyId(Long id) {
		Optional<Pessoa> obj = repo.findById(id);
		return obj.orElse(null);
		
	}
	
	
	
	public Pessoa insert(Pessoa obj) {
		return repo.save(obj);
	}
	
	
	

}

