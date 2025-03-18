package com.festaInfantil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.festaInfantil.entities.Tema;
import com.festaInfantil.repository.TemaRepository;

@Service
public class TemaService {
	
	private final TemaRepository temaRepository;
	@Autowired
	public TemaService(TemaRepository temaRepository) {
		this.temaRepository = temaRepository;
	}

	public Tema saveTema(Tema tema) {
		return temaRepository.save(tema);
	}

	public Tema getTemaById(Long id) {
		return temaRepository.findById(id).orElse(null);
	}

	public List<Tema> getAllTema() {
		return temaRepository.findAll();
	}

	public void deleteTema(Long id) {
		temaRepository.deleteById(id);
	}
}



