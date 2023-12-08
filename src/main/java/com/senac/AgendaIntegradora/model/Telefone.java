package com.senac.AgendaIntegradora.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Table(name = "contel")
@Entity(name = "contel")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private String dddNum;
    private String emails;
    private Contato contato;

    public Telefone(String numero, String dddNum, String emails, Contato contato){
        this.numero=numero;
        this.dddNum=dddNum;
        this.emails=emails;
        this.contato=contato;
    }

    public Long getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDddNum() {
        return dddNum;
    }

    public void setDddNum(String dddNum) {
        this.dddNum = dddNum;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", dddNum='" + dddNum + '\'' +
                ", emails='" + emails + '\'' +
                ", contato=" + contato +
                '}';
    }
}
