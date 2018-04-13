package online.vintem.api.resource;

import online.vintem.api.event.RecursoCriadoEvent;
import online.vintem.api.exceptionhandler.VintemExceptionHandler;
import online.vintem.api.model.Lancamento;
import online.vintem.api.repository.LancamentoRepository;
import online.vintem.api.service.LancamentoService;
import online.vintem.api.service.exception.PessoaInexistenteOuInativaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

/**
 * Created by eduardo on 13/04/18.
 */
@RestController
@RequestMapping("/lancamentos")
public class LancamentoResource {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @Autowired
    private LancamentoService lancamentoService;

    @Autowired
    private ApplicationEventPublisher publisher;

    @Autowired
    private MessageSource messageSource;

    @GetMapping
    public List<Lancamento> listar() {
        return lancamentoRepository.findAll();
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<?> buscar(@PathVariable Long codigo) {
        Lancamento lancamento = lancamentoRepository.findOne(codigo);
        return lancamento != null ? ResponseEntity.ok(lancamento) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Lancamento> salvar(@Valid @RequestBody Lancamento lancamento, HttpServletResponse response) {
        Lancamento novo = lancamentoService.salvar(lancamento);
        publisher.publishEvent(new RecursoCriadoEvent(this, response, novo.getCodigo()));
        return ResponseEntity.status(HttpStatus.CREATED).body(novo);
    }

    @ExceptionHandler({PessoaInexistenteOuInativaException.class})
    public ResponseEntity<Object> handlePessoaInexistenteOuInativaException(PessoaInexistenteOuInativaException ex) {
        String mensagemUsuario = messageSource.getMessage("pessoa.inexistente-ou-inativa", null, LocaleContextHolder.getLocaleContext().getLocale());
        String mensagemDesenvolvedor = ex.toString();
        List<VintemExceptionHandler.Erro> erros = Arrays.asList(new VintemExceptionHandler.Erro(mensagemUsuario, mensagemDesenvolvedor));
        return ResponseEntity.badRequest().body(erros);
    }
}

