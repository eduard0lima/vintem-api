package online.vintem.api.repository;

import online.vintem.api.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by eduardo on 29/03/18.
 */
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
