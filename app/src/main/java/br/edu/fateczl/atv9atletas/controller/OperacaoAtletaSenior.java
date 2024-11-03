/*
 *@author:<Matheus Augusto Marti>
 */

package br.edu.fateczl.atv9atletas.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.fateczl.atv9atletas.model.AtletaSenior;

public class OperacaoAtletaSenior implements IOperacao<AtletaSenior> {

    private List<AtletaSenior> lista;

    public OperacaoAtletaSenior() {
        this.lista = new ArrayList<>();
    }
    @Override
    public void cadastrar(AtletaSenior atletaSenior) {
        lista.add(atletaSenior);
    }
}
