package com.senac.AgendaIntegradora.service;

import com.senac.AgendaIntegradora.model.Agenda;
import com.senac.AgendaIntegradora.model.ContatoRepository;
import com.senac.AgendaIntegradora.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AgendaServiceImpl implements AgendaService {

    @Autowired
    private ContatoRepository contatoRepository;

    @Override
    @Transactional
    public void cadastrarContato(Agenda agenda) {
        agenda.getContatos().forEach(contatoRepository::save);
    }

    @Override
    @Transactional
    public void alterarContato(Agenda agenda) {
        agenda.getContatos().forEach(contatoRepository::save);
    }

    @Override
    @Transactional
    public void excluirContato(Long contatoId) {
        contatoRepository.deleteById(contatoId);
    }
}
