/*
 *@author:<Matheus Augusto Marti>
 */

package br.edu.fateczl.atv9atletas.model;

import androidx.annotation.NonNull;

public class AtletaOutro extends Atleta{
    private String academia;
    private double recordeEmSegundos;

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public double getRecordeEmSegundos() {
        return recordeEmSegundos;
    }

    public void setRecordeEmSegundos(double recordeEmSegundos) {
        this.recordeEmSegundos = recordeEmSegundos;
    }

    @NonNull
    @Override
    public String toString() {
        return "OutrosAtletas{" +
                "nome='" + getNome() + '\'' +
                ", dataNascimento=" + getDataNascimento() + '\'' +
                ", bairro='" + getBairro()+ '\'' +
                "academia='" + academia + '\'' +
                ", recordeEmSegundos=" + recordeEmSegundos +
                '}';
    }
}
