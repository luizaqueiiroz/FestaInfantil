package com.festaInfantil.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "itemTema")
public class ItemTema {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idItemTema;

	@Column (name = "Nome")
	private String name;

	@Column (name = "Descrição") 
	private String descricao;

	public Long getIdItemTema() {
		return idItemTema;
	}

	public void setIdItemTema(Long idItemTema) {
		this.idItemTema = idItemTema;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}

