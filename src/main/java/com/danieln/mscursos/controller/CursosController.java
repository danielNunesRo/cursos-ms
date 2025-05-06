package com.danieln.mscursos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.danieln.mscursos.domain.Cursos;
import com.danieln.mscursos.domain.dto.CursosDTO;
import com.danieln.mscursos.services.CursosService;

@RestController
@RequestMapping("/cursos")
public class CursosController {

    @Autowired
    private CursosService cursosService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cursos createCurso(@RequestBody CursosDTO dto) {
        return cursosService.createCurso(dto);
    }

    @GetMapping("/buscar")
    public Optional<Cursos> findByName(@RequestParam String nome) {
        return cursosService.findByName(nome);
    }

    @GetMapping("/disponiveis")
    public List<Cursos> cursosDisponiveis() {
        return cursosService.cursosDisponiveis();
    }

    @PutMapping("/{id}")
    public Cursos updateCurso(@PathVariable Long id, @RequestBody CursosDTO dto) {
        return cursosService.updateCurso(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCurso(@PathVariable Long id) {
        cursosService.deleteCurso(id);
    }

}
