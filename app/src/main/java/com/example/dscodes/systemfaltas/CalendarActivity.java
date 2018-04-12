package com.example.dscodes.systemfaltas;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dscodes.systemfaltas.basics.Dados;
import com.example.dscodes.systemfaltas.basics.Materias;

public class CalendarActivity extends AppCompatActivity {
    Context context = this;
    Dados dados;
    Materias materiaSelected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        dados = (Dados)getApplication();
        materiaSelected = dados.getSelectedMateria();
        CalendarView cView = findViewById(R.id.calendarView);
        cView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
//                Toast.makeText(getApplicationContext(), day+"", Toast.LENGTH_SHORT).show();

                if(materiaSelected.getFaltas()>=(materiaSelected.getAulas()*.25)){
                    Toast.makeText(getApplicationContext(),"Aviso, você não tem mais faltas disponiveis.",Toast.LENGTH_SHORT).show();
                }else{
                    materiaSelected.setFaltas(materiaSelected.getFaltas()+1);
                    Toast.makeText(getApplicationContext(),"Falta registrada",Toast.LENGTH_SHORT).show();
                }
            }
        });
        TextView textView = findViewById(R.id.textMateria);
        textView.setText(materiaSelected.getNome());
    }
    public void retornarTela(View view){
        dados.getMaterias().get(dados.getMaterias().indexOf(materiaSelected));
        finish();
    }
}
