package com.festaInfantil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.festaInfantil.entities.ItemTema;
import com.festaInfantil.repository.ItemTemaRepository;


@Service
public class ItemTemaService {
	private final ItemTemaRepository itemTemaRepository;

	@Autowired
	public ItemTemaService(ItemTemaRepository itemTemaRepository) {
		this.itemTemaRepository = itemTemaRepository;
	}
	public ItemTema saveItemTema(ItemTema itemTema) {
		return itemTemaRepository.save(itemTema);
	}
	public ItemTema getItemTemaById (Long id) {
		return itemTemaRepository.findById(id).orElse(null);
	}
	public List<ItemTema> getAllItemTema() {
		return itemTemaRepository.findAll();
	}
	public void deleteItemTema(Long idItemTema) {
		itemTemaRepository.deleteById(idItemTema);
	}
	
}


