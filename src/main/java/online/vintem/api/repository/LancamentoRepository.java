package online.vintem.api.repository;

import online.vintem.api.model.Lancamento;
import online.vintem.api.repository.lancamento.LancamentoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by eduardo on 13/04/18.
 */
public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
