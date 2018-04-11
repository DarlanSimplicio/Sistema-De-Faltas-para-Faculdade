package com.example.dscodes.systemfaltas;

import android.app.AlertDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

import com.example.dscodes.systemfaltas.basics.Dados;

public class CalendarActivity extends AppCompatActivity {
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        CalendarView calendarView = findViewById(R.id.calendarView);
        calendarView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                AlertDialog dialog = new AlertDialog(context);
            }
        });
        TextView textView = findViewById(R.id.textMateria);
        textView.setText(((Dados)getApplication()).getSelectedMateria().getNome());
    }
}
