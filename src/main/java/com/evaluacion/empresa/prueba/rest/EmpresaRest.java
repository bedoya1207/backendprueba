package com.evaluacion.empresa.prueba.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluacion.empresa.prueba.model.Empresa;
import com.evaluacion.empresa.prueba.model.Persona;
import com.evaluacion.empresa.prueba.service.EmpresaService;

@RestController
@RequestMapping("/empresa/")
public class EmpresaRest {

	@Autowired
	private EmpresaService empresaService;
	
	@GetMapping
	private ResponseEntity<List<Empresa>> getAllEmpresas(){
		return ResponseEntity.ok(empresaService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<Empresa> saveEmpresa(@RequestBody Empresa empresa) throws URISyntaxException{
		
		Empresa empresaguardada = empresaService.save(empresa);
		return ResponseEntity.created(new URI("/persona/agregar/"+empresa.getId())).body(empresaguardada);
	}
	
}
