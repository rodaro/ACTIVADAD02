package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamentos;
import com.empresa.repository.MedicamentoRepository;


@Service
public class MedicamentoServiceImpl implements MedicamentoService {

	@Autowired
	private MedicamentoRepository repository;
	
	@Override
	public Optional<Medicamentos> buscarPorId(int idMedicamento) {
		// TODO Auto-generated method stub
		return repository.findById(idMedicamento);
	}

	@Override
	public List<Medicamentos> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return repository.findByNombre(nombre);
	}

	@Override
	public List<Medicamentos> buscarPorStock(int stock) {
		// TODO Auto-generated method stub
		return repository.findByStock(stock);
	}

}
