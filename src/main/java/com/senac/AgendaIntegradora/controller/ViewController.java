package com.senac.AgendaIntegradora.controller;

import com.senac.AgendaIntegradora.model.Contato;
import com.senac.AgendaIntegradora.model.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ViewController {

    @Autowired
    private ContatoRepository contatoRepository;

    @GetMapping("/cadastro")
    public String cadastroForm(Model model) {
        model.addAttribute("contato", new Contato());
        return "cadastro/cadastro";
    }

    @PostMapping("/cadastrar")
    public String cadastrar(Contato contato) {
        contatoRepository.save(contato);
        return "redirect:/cadastro";
    }

    @GetMapping("/consulta")
    public String consultaForm(Model model) {
        model.addAttribute("contatos", contatoRepository.findAll());
        return "consulta/consulta";
    }
}
