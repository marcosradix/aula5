package io.spring.boot.aula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.spring.boot.aula.entity.Perfil;
import io.spring.boot.aula.repository2.PerfilRepository;

/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com>
 */
@RestController
@RequestMapping("/perfil")
public class PerfilController {
    
    @Autowired    
    PerfilRepository repository;
    
    @GetMapping
    public List<Perfil> listUsuario() {
        return repository.findAll();
    }
    
    @PostMapping(value = "/perfil")
    public Perfil save(@RequestBody Perfil perfil) {
        return repository.save(perfil);
    }
    
    @PutMapping(value = "/perfil")
    public Perfil edit(@RequestBody Perfil perfil) {
        return repository.save(perfil);
    }

    @DeleteMapping(value = "/perfil/{id}")
    public void delete(@PathVariable String id) {
        repository.delete(id);
    }
    
}
