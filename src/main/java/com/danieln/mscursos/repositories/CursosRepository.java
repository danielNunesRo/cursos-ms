package com.danieln.mscursos.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danieln.mscursos.domain.Cursos;

public interface CursosRepository extends JpaRepository<Cursos, Long> {

    Optional<Cursos> findByNome(String nome);

}
