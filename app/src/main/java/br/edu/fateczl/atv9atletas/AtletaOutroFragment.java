/*
 *@author:<Matheus Augusto Marti>
 */

package br.edu.fateczl.atv9atletas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.edu.fateczl.atv9atletas.controller.IOperacao;
import br.edu.fateczl.atv9atletas.controller.OperacaoAtletaOutro;
import br.edu.fateczl.atv9atletas.model.AtletaOutro;

public class AtletaOutroFragment extends Fragment {

    private View view;
    private EditText etNomeAO;
    private EditText etDataNascimentoAO;
    private EditText etBairroAO;
    private EditText etAcademia;
    private EditText etRecorde;
    private Button btnCadastrarAO;

    public AtletaOutroFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_atleta_outro, container, false);
        etNomeAO = view.findViewById(R.id.etNomeAO);
        etDataNascimentoAO = view.findViewById(R.id.etDataNascimentoAO);
        etBairroAO = view.findViewById(R.id.etBairroAO);
        etAcademia = view.findViewById(R.id.etAcademia);
        etRecorde = view.findViewById(R.id.etRecorde);
        btnCadastrarAO = view.findViewById(R.id.btnCadastrarAO);
        btnCadastrarAO.setOnClickListener(op -> cadastro());
        return view;
    }

    private void cadastro() {
        AtletaOutro ao = new AtletaOutro();
        ao.setNome(etNomeAO.getText().toString());
        ao.setDataNascimento(etDataNascimentoAO.getText().toString());
        ao.setBairro(etBairroAO.getText().toString());
        ao.setAcademia(etAcademia.getText().toString());
        ao.setRecordeEmSegundos(Double.parseDouble(etRecorde.getText().toString()));
        IOperacao<AtletaOutro> op = new OperacaoAtletaOutro();
        op.cadastrar(ao);
        Toast.makeText(view.getContext(), ao.toString(), Toast.LENGTH_LONG).show();
        limpaCampos();
    }

    private void limpaCampos() {
        etNomeAO.setText("");
        etDataNascimentoAO.setText("");
        etBairroAO.setText("");
        etAcademia.setText("");
        etRecorde.setText("");
    }
}