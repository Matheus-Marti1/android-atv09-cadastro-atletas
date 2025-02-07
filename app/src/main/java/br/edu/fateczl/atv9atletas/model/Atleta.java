/*
 *@author:<Matheus Augusto Marti>
 */

package br.edu.fateczl.atv9atletas.model;

import androidx.annotation.NonNull;

import java.time.LocalDate;

public class Atleta {
    private String nome;
    private String dataNascimento;
    private String bairro;

    public Atleta() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    @NonNull

    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
