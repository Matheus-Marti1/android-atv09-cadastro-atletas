/*
 *@author:<Matheus Augusto Marti>
 */

package br.edu.fateczl.atv9atletas.model;

import androidx.annotation.NonNull;

public class AtletaSenior extends Atleta{
    private boolean temProblemasCardiacos;

    public boolean isTemProblemasCardiacos() {
        return temProblemasCardiacos;
    }

    public void setTemProblemasCardiacos(boolean temProblemasCardiacos) {
        this.temProblemasCardiacos = temProblemasCardiacos;
    }

    @NonNull
    @Override
    public String toString() {
        return "AtletaSenior{" +
                "nome='" + getNome() + '\'' +
                ", dataNascimento=" + getDataNascimento() + '\'' +
                ", bairro='" + getBairro() + '\'' +
                "temProblemasCardiacos=" + temProblemasCardiacos +
                '}';
    }
}
