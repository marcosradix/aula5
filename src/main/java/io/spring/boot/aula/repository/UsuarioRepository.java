package io.spring.boot.aula.repository;

import io.spring.boot.aula.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Marcos Ferreira <marcosradix@gmail.com>
 */
public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    
}
