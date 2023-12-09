package com.senac.AgendaIntegradora.controller;

import com.senac.AgendaIntegradora.model.Contato;
import com.senac.AgendaIntegradora.model.ContatoRepository;
import com.senac.AgendaIntegradora.model.Telefone;
import com.senac.AgendaIntegradora.model.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

@Controller
public class AgendaController {

    @Autowired
    private TelefoneRepository telefoneRepository;

    @Autowired
    private ContatoRepository contatoRepository;

    @Transactional
    public void cadastrarContato(Contato contato) {
        // Adicione a lógica para salvar o contato no banco de dados
        contatoRepository.save(contato);
    }

    @Transactional
    public void cadastrarTelefone(Telefone telefone, Long contatoId) {
        // Adicione a lógica para associar o número de telefone a um contato e salvar no banco de dados
        Contato contato = contatoRepository.getById(contatoId);
        telefone.setContato(contato);
        telefoneRepository.save(telefone);
    }

    @Transactional
    public void alterarTelefone(Telefone telefone) {
        // Adicione a lógica para atualizar o número de telefone no banco de dados
        telefoneRepository.save(telefone);
    }

    @Transactional
    public void alterarContato(Contato contato) {
        // Adicione a lógica para atualizar o contato no banco de dados
        contatoRepository.save(contato);
    }

    @Transactional
    public void excluirContato(Long contatoId) {
        // Adicione a lógica para excluir o contato e os números de telefone associados do banco de dados
        contatoRepository.deleteById(contatoId);
    }

    @Transactional
    public void excluirTelefone(Long telefoneId) {
        // Adicione a lógica para excluir o número de telefone do banco de dados
        telefoneRepository.deleteById(telefoneId);
    }
}
