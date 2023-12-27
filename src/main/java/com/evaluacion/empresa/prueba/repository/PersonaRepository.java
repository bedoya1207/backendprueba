package com.evaluacion.empresa.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evaluacion.empresa.prueba.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
