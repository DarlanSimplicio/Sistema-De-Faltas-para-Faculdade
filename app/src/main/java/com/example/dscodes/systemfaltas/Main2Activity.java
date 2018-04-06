package com.example.dscodes.systemfaltas;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.dscodes.systemfaltas.basics.Dados;
import com.example.dscodes.systemfaltas.basics.Materias;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private Context context = this;
    private Dados dados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        dados = (Dados) getApplication();

        final Intent intent = getIntent();
        if (intent != null) {
            Bundle params = intent.getExtras();
            if (params != null) {
//                String nome = params.getString("Nome");
//                String matricula = params.getString("Matricula");
                String nome = dados.getNome();
                String matricula = dados.getMatricula()+"";

                TextView nomeTV = (TextView) findViewById(R.id.nome);
                TextView matriculaTV = (TextView) findViewById(R.id.matricula);

                nomeTV.setText("Nome: " + nome);
                matriculaTV.setText("Matrícula: " + matricula);

                ListView listaMaterias = (ListView) findViewById(R.id.listMaterias);

                ArrayList<String> listMaterias = preencherMaterias();

                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listMaterias);
                ListAdapter adapter = arrayAdapter;
                listaMaterias.setAdapter(adapter);
                listaMaterias.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intentView = new Intent(context,CalendarActivity.class);
                        Materias m = new Materias();
                        m.setNome(((TextView)view).getText().toString());
                        dados.setSelectedMateria(m);
                        startActivity(intentView);
                    }

            });
            }
        }


    }

    private ArrayList<String> preencherMaterias() {

        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Circuitos Digitais");
        dados.add("Logica de Programação");
        dados.add("Inteligencia Artificial");
        dados.add("Comunicação Digital");
        dados.add("Banco de Dados");

        return dados;
    }
}
