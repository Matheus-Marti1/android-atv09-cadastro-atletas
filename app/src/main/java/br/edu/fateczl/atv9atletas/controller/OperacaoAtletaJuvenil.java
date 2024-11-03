/*
 *@author:<Matheus Augusto Marti>
 */

package br.edu.fateczl.atv9atletas.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.fateczl.atv9atletas.model.AtletaJuvenil;

public class OperacaoAtletaJuvenil implements IOperacao<AtletaJuvenil> {

    private List<AtletaJuvenil> lista;

    public OperacaoAtletaJuvenil() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void cadastrar(AtletaJuvenil atletaJuvenil) {
        lista.add(atletaJuvenil);
    }
}
