package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Medicamentos;

public interface MedicamentoRepository extends JpaRepository<Medicamentos, Integer>{
	public abstract List<Medicamentos> findByNombre(String nombre);
	public abstract List<Medicamentos> findByStock(int stock);
}
