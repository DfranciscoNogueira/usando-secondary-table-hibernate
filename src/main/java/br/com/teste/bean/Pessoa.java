package br.com.teste.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

/**
 * 
 * @author Diego_Francisco
 *
 * Classe que representa uma pessoa com nome e sobrenome
 *
 */
@Entity
@Table(name = "tabela1")
@SecondaryTable(name = "tabela2")
public class Pessoa {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sobrenome", table = "tabela2")
    private String sobrenome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

}
