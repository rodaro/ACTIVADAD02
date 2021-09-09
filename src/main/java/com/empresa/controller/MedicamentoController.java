package com.empresa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.empresa.entity.Medicamentos;
import com.empresa.service.MedicamentoService;

@RestController
@RequestMapping("/rest/medicamento")
public class MedicamentoController {
	
	
	@Autowired
	private MedicamentoService service;
	
	@GetMapping("/id/{paramId}")
	@ResponseBody
	public ResponseEntity<Medicamentos> buscaPorId(@PathVariable("paramId") int idMedicamento){
		Optional<Medicamentos> optMedicamento = service.buscarPorId(idMedicamento);
		if (optMedicamento.isPresent()) {
			return ResponseEntity.ok(optMedicamento.get());
		}else {
			return ResponseEntity.badRequest().build();
		}
	}
	
	@GetMapping("/nombre/{paramNombre}")
	@ResponseBody
	public ResponseEntity<List<Medicamentos>> buscaPorNombre(@PathVariable("paramNombre") String nombre){
		List<Medicamentos> lista = service.buscarPorNombre(nombre);
		if (CollectionUtils.isEmpty(lista)) {
			return ResponseEntity.badRequest().build();
		}else {
			return ResponseEntity.ok(lista);
		}
	}
	
	@GetMapping("/stock/{parastock}")
	@ResponseBody
	public ResponseEntity<List<Medicamentos>> buscarPorStock(@PathVariable("parastock")int stock){
		List<Medicamentos> lista = service.buscarPorStock(stock);
		if(CollectionUtils.isEmpty(lista)) {
			return ResponseEntity.badRequest().build();
		}else {return ResponseEntity.ok(lista);}
	}
}
