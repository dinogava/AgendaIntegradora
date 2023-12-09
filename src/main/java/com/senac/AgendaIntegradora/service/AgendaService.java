package com.senac.AgendaIntegradora.service;

import com.senac.AgendaIntegradora.model.Agenda;

public interface AgendaService {
    void cadastrarContato(Agenda agenda);
    void alterarContato(Agenda agenda);
    void excluirContato(Long contatoId);
}
