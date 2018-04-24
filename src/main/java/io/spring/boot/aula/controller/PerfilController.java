package io.spring.boot.aula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.spring.boot.aula.entity.Perfil;
import io.spring.boot.aula.repository2.PerfilRepository;

/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com>
 */
@RestController
public class PerfilController {
    
    @Autowired    
    PerfilRepository repository;
    
    @RequestMapping(value = "/perfil", method = RequestMethod.GET)
    public List<Perfil> listUsuario() {
        return repository.findAll();
    }
    
    @RequestMapping(value = "/perfil", method = RequestMethod.POST)
    public Perfil save(@RequestBody Perfil perfil) {
        return repository.save(perfil);
    }
    
    @RequestMapping(value = "/perfil", method = RequestMethod.PUT)
    public Perfil edit(@RequestBody Perfil perfil) {
        return repository.save(perfil);
    }

    @RequestMapping(value = "/perfil/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        repository.delete(id);
    }
    
}
