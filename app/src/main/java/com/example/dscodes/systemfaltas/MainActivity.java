package com.example.dscodes.systemfaltas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.example.dscodes.systemfaltas.basics.Dados;

public class MainActivity extends AppCompatActivity {

    private EditText nome;
    private EditText matricula;
    private Button botaoCadastro;
    private Dados dados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dados = (Dados) getApplication();
    }

    public void enviaDados(View view) {

        nome = (EditText) findViewById(R.id.nomeAluno);
        matricula = (EditText) findViewById(R.id.numMatricula);

        Bundle params = new Bundle() ;
        dados.setNome(nome.getText().toString());
        dados.setMatricula(Long.parseLong(matricula.getText().toString()));
        params.putString("Nome", nome.getText().toString()) ;
        params.putString("Matricula", matricula.getText().toString()) ;

        Intent intent = new Intent(this, Main2Activity.class) ;
        intent.putExtras(params) ;

        startActivityForResult(intent, 1);
    }


}
