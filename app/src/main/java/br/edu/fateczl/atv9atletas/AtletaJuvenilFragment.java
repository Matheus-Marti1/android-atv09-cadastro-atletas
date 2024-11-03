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
import br.edu.fateczl.atv9atletas.controller.OperacaoAtletaJuvenil;
import br.edu.fateczl.atv9atletas.model.AtletaJuvenil;

public class AtletaJuvenilFragment extends Fragment {

    private View view;
    private EditText etNomeAJ;
    private EditText etDataNascimentoAJ;
    private EditText etBairroAJ;
    private EditText etAnos;
    private Button btnCadastrarAJ;

    public AtletaJuvenilFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_atleta_juvenil, container, false);
        etNomeAJ = view.findViewById(R.id.etNomeAJ);
        etDataNascimentoAJ = view.findViewById(R.id.etDataNascimentoAJ);
        etBairroAJ = view.findViewById(R.id.etBairroAJ);
        etAnos = view.findViewById(R.id.etAnos);
        btnCadastrarAJ = view.findViewById(R.id.btnCadastrarAJ);
        btnCadastrarAJ.setOnClickListener(op -> cadastro());
        return view;
    }

    private void cadastro() {
        AtletaJuvenil aj = new AtletaJuvenil();
        aj.setNome(etNomeAJ.getText().toString());
        aj.setDataNascimento(etDataNascimentoAJ.getText().toString());
        aj.setBairro(etBairroAJ.getText().toString());
        aj.setAnosPraticados(Integer.parseInt(etAnos.getText().toString()));
        IOperacao<AtletaJuvenil> op = new OperacaoAtletaJuvenil();
        op.cadastrar(aj);
        Toast.makeText(view.getContext(), aj.toString(), Toast.LENGTH_LONG).show();
        limpaCampos();
    }

    private void limpaCampos() {
        etNomeAJ.setText("");
        etDataNascimentoAJ.setText("");
        etBairroAJ.setText("");
        etAnos.setText("");
    }
}