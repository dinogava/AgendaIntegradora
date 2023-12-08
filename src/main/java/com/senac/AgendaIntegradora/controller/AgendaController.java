package com.senac.AgendaIntegradora.controller;

import com.senac.AgendaIntegradora.model.ContatoRepository;
import com.senac.AgendaIntegradora.model.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

@Controller
public class AgendaController {
    @Autowired
    private TelefoneRepository telRepository;
    @Autowired
    private ContatoRepository ContatRepository;

    @Transactional
    public void cadastrarContato(){


    }
    @Transactional
    public void cadastrarTelefone(){

    }
    @Transactional
    public void AlterarTelefone(){

    }
    @Transactional
    public void AlterarContato(){



    }
    @Transactional
    public void excluirContato() {


    }
    @Transactional
    public void excluirTelefone() {


    }
}
