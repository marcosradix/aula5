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

import io.spring.boot.aula.entity.Usuario;
import io.spring.boot.aula.repository.UsuarioRepository;

/**
 *
 * @autho Marcos Ferreira <marcosradix@gmail.com>
 */
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired    
    UsuarioRepository repository;
    
    @GetMapping
    public List<Usuario> listUsuario() {
        return repository.findAll();
    }
    
    @PostMapping(value = "/usuario")
    public Usuario save(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }
    
    @PutMapping(value = "/usuario")
    public Usuario edit(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }

    @DeleteMapping(value = "/usuario/{id}")
    public void delete(@PathVariable String id) {
        repository.delete(id);
    }
    
}
