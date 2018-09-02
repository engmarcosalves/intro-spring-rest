package br.com.geekcode.curso.resource.rest;

import br.com.geekcode.curso.domain.Curso;
import br.com.geekcode.curso.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(
        value = "/cursos",
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
        consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
)
public class CursoRestController {

    @Autowired
    private CursoService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Curso> listar() {
        return service.findAll();
    }
}
