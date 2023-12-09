package com.senac.AgendaIntegradora.service;

import com.senac.AgendaIntegradora.model.Telefone;

public interface TelefoneService {
    void cadastrarTelefone(Telefone telefone, Long contatoId);
    void alterarTelefone(Telefone telefone);
    void excluirTelefone(Long telefoneId);
}
