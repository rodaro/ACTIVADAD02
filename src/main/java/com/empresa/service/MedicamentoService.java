package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entity.Medicamentos;

public interface MedicamentoService {
	public abstract Optional<Medicamentos> buscarPorId(int idMedicamento);
	public abstract List<Medicamentos> buscarPorNombre(String nombre);
	public abstract List<Medicamentos> buscarPorStock(int stock);
	/*public abstract List<Medicamentos> buscarPorStock(int stock);*/
}
