/*
 *@author:<Matheus Augusto Marti>
 */

package br.edu.fateczl.atv9atletas.model;

import androidx.annotation.NonNull;

public class AtletaJuvenil extends Atleta{
    private int anosPraticados;

    public int getAnosPraticados() {
        return anosPraticados;
    }

    public void setAnosPraticados(int anosPraticados) {
        this.anosPraticados = anosPraticados;
    }

    @NonNull
    @Override
    public String toString() {
        return "AtletaJuvenil{" +
                "nome='" + getNome() + '\'' +
                ", dataNascimento=" + getDataNascimento() + '\'' +
                ", bairro='" + getBairro()+ '\'' +
                "anosPraticados=" + anosPraticados +
                '}';
    }
}
