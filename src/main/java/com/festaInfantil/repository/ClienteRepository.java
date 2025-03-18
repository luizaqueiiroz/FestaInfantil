package com.festaInfantil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.festaInfantil.entities.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
