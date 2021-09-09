package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.Alumno;

public interface AlumnoService {

	public abstract List<Alumno> listaAlumno();
	public abstract Alumno insertaActualizaAlumno(Alumno obj);
	public abstract Optional<Alumno> buscaPorId(int idAlumno);
	public abstract void eliminarPorId(int idAlumno);
	public abstract List<Alumno> buscarPorDni(String dni);
	
}
