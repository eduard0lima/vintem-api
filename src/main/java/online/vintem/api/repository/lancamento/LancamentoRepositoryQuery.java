package online.vintem.api.repository.lancamento;

import online.vintem.api.model.Lancamento;
import online.vintem.api.repository.filter.LancamentoFilter;

import java.util.List;

/**
 * Created by eduardo on 13/04/18.
 */
public interface LancamentoRepositoryQuery {

    public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);

}
