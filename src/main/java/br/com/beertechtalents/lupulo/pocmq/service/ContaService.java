package br.com.beertechtalents.lupulo.pocmq.service;

import br.com.beertechtalents.lupulo.pocmq.model.Conta;
import br.com.beertechtalents.lupulo.pocmq.repository.ContaRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ContaService {

    ContaRepository contaRepository;

    public Page<Conta> getPageConta(int page, int size) {
        return contaRepository.findAll(PageRequest.of(page, size));
    }

    public Conta novaConta(Conta conta) {
        return contaRepository.save(conta);
    }

    public Optional<Conta> getConta(UUID uuid) {
        return contaRepository.findByUuid(uuid);
    }
}
