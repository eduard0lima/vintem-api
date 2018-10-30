package online.vintem.api.repository.lancamento;

import online.vintem.api.model.Lancamento;
import online.vintem.api.repository.filter.LancamentoFilter;
import online.vintem.api.repository.projection.ResumoLancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by eduardo on 13/04/18.
 */
public interface LancamentoRepositoryQuery {

    public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
    public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);

}
