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

import java.util.Objects;
@Table(name ="contat")
@Entity(name = "contat")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descri;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public Contato(Long id){
        this.id=id;



    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(id, contato.id) && Objects.equals(descri, contato.descri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descri);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", descri='" + descri + '\'' +
                '}';
    }
}
