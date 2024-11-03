/*
 *@author:<Matheus Augusto Marti>
 */

package br.edu.fateczl.atv9atletas.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.fateczl.atv9atletas.model.AtletaOutro;

public class OperacaoAtletaOutro implements IOperacao<AtletaOutro> {

    private List<AtletaOutro> lista;

    public OperacaoAtletaOutro() {
        this.lista = new ArrayList<>();
    }
    @Override
    public void cadastrar(AtletaOutro atletaOutro) {
        lista.add(atletaOutro);
    }
}
