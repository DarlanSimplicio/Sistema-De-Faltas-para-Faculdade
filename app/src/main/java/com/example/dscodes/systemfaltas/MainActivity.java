package com.example.dscodes.systemfaltas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
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

        nome = findViewById(R.id.nomeAluno);
        matricula = findViewById(R.id.numMatricula);
        matricula.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if(keyEvent.getKeyCode() == KeyEvent.KEYCODE_ENTER){

                    enviaDados(view);
                }
                return false;
            }
        });
    }

    public void enviaDados(View view) {


        Bundle params = new Bundle() ;
        dados.setNome(nome.getText().toString());
        dados.setMatricula(Long.parseLong(matricula.getText().toString()));

        Intent intent = new Intent(this, Main2Activity.class) ;
        intent.putExtras(params) ;

        startActivityForResult(intent, 1);
    }


}
