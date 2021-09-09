package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
/*
	@Query("select p from alumno p where p.dni = :param_dni")
	public abstract List<Alumno> buscaPordni(@Param("param_dni")String dni);
	
	*/
	public abstract List<Alumno> findByDni(String dni);
}
