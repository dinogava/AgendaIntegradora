package com.senac.AgendaIntegradora.service;

import com.senac.AgendaIntegradora.model.ContatoRepository;
import com.senac.AgendaIntegradora.model.Telefone;
import com.senac.AgendaIntegradora.model.TelefoneRepository;
import com.senac.AgendaIntegradora.service.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TelefoneServiceImpl implements TelefoneService {

    @Autowired
    private TelefoneRepository telefoneRepository;

    @Autowired
    private ContatoRepository contatoRepository;

    @Override
    @Transactional
    public void cadastrarTelefone(Telefone telefone, Long contatoId) {
        // Lógica de negócios para cadastrar um telefone associado a um contato
        telefone.setContato(contatoRepository.getById(contatoId));
        telefoneRepository.save(telefone);
    }

    @Override
    @Transactional
    public void alterarTelefone(Telefone telefone) {
        telefoneRepository.save(telefone);
    }

    @Override
    @Transactional
    public void excluirTelefone(Long telefoneId) {
        telefoneRepository.deleteById(telefoneId);
    }
}
