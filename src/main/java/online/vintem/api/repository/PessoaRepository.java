package online.vintem.api.repository;

import online.vintem.api.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by eduardo on 31/03/18.
 */
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
