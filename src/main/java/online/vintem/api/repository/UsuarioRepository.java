package online.vintem.api.repository;

import online.vintem.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by eduardo on 19/04/18.
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Optional<Usuario> findByEmail(String email);

}
