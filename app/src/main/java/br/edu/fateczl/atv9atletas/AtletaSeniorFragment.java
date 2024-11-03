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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import br.edu.fateczl.atv9atletas.controller.IOperacao;
import br.edu.fateczl.atv9atletas.controller.OperacaoAtletaSenior;
import br.edu.fateczl.atv9atletas.model.AtletaSenior;


public class AtletaSeniorFragment extends Fragment {

    private View view;
    private EditText etNomeAS;
    private EditText etDataNascimentoAS;
    private EditText etBairroAS;
    private CheckBox cbProblemasCardiacos;
    private Button btnCadastrarAS;

    public AtletaSeniorFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_atleta_senior, container, false);
        etNomeAS = view.findViewById(R.id.etNomeAS);
        etDataNascimentoAS = view.findViewById(R.id.etDataNascimentoAS);
        etBairroAS = view.findViewById(R.id.etBairroAS);
        cbProblemasCardiacos = view.findViewById(R.id.cbProblemasCardiacos);
        btnCadastrarAS = view.findViewById(R.id.btnCadastrarAS);
        btnCadastrarAS.setOnClickListener(op -> cadastro());
        return view;
    }

    private void cadastro() {
        AtletaSenior as = new AtletaSenior();
        as.setNome(etNomeAS.getText().toString());
        as.setDataNascimento(etDataNascimentoAS.getText().toString());
        as.setBairro(etBairroAS.getText().toString());
        as.setTemProblemasCardiacos(cbProblemasCardiacos.isChecked());
        IOperacao<AtletaSenior> op = new OperacaoAtletaSenior();
        op.cadastrar(as);
        Toast.makeText(view.getContext(), as.toString(), Toast.LENGTH_LONG).show();
        limpaCampos();
    }

    private void limpaCampos() {
        etNomeAS.setText("");
        etDataNascimentoAS.setText("");
        etBairroAS.setText("");
        cbProblemasCardiacos.setChecked(false);
    }
}