package com.danieln.mscursos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danieln.mscursos.domain.Cursos;
import com.danieln.mscursos.domain.dto.CursosDTO;
import com.danieln.mscursos.repositories.CursosRepository;

@Service
public class CursosService {

    @Autowired
    private CursosRepository cursosRepository;

    public Optional<Cursos> findByName(String name) {
        return cursosRepository.findByNome(name.toUpperCase());
    }

    public List<Cursos> cursosDisponiveis() {
        List<Cursos> list = cursosRepository.findAll();
        return list;
    }

    public Cursos createCurso(CursosDTO dto) {
        Optional<Cursos> existingCurso = cursosRepository.findByNome(dto.nome().toUpperCase());

        if(existingCurso.isPresent()) {
            throw new IllegalArgumentException("Curso já existe");
        }

        Cursos curso = new Cursos();
        curso.setNome(dto.nome().toUpperCase());
        return cursosRepository.save(curso);
    }

    public Cursos updateCurso(Long id, CursosDTO dto) {
        Optional<Cursos> existingCursoOpt = cursosRepository.findById(id);
        if (!existingCursoOpt.isPresent()) {
            throw new IllegalArgumentException("Curso não encontrado");
        }

        Cursos existingCurso = existingCursoOpt.get();
        existingCurso.setNome(dto.nome().toUpperCase());
        return cursosRepository.save(existingCurso);
    }

    public void deleteCurso(Long id) {
        Optional<Cursos> existingCursoOpt = cursosRepository.findById(id);
        if (!existingCursoOpt.isPresent()) {
            throw new IllegalArgumentException("Curso não encontrado");
        }

        cursosRepository.deleteById(id);
    }

}