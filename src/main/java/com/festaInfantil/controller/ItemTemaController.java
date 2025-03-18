package com.festaInfantil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.festaInfantil.entities.ItemTema;
import com.festaInfantil.service.ItemTemaService;

@RestController
@RequestMapping("/itemTema")

public class ItemTemaController {
	private final ItemTemaService itemTemaService;

	@Autowired
	public ItemTemaController(ItemTemaService itemTemaService) {
		this.itemTemaService = itemTemaService;
	}

	@PostMapping
	public ItemTema createProduct(@RequestBody ItemTema itemTema) {
		return itemTemaService.saveItemTema(itemTema);
	}

	@GetMapping ("/{id}")
	public ItemTema getItemTema(@PathVariable Long id) {
		return itemTemaService.getItemTemaById(id);
	}
	
	@GetMapping
	public List<ItemTema> getAllItemTema() {
		return itemTemaService.getAllItemTema();
	}

	@DeleteMapping("/{id}")
	public void deleteItemTema (@PathVariable Long id) {
		itemTemaService.deleteItemTema(id);
	}
}
