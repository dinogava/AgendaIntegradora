package com.senac.AgendaIntegradora.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private Long id;
    private String nome;
    private List<Contato> contatos;

    // Construtor
    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    // Métodos de acesso para as propriedades
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    // Método para adicionar um contato à agenda
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    // Método para remover um contato da agenda
    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    // Outros métodos e lógica de negócios conforme necessário
}
