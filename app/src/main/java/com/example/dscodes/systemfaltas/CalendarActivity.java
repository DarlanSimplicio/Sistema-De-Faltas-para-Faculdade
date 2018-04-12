package com.example.dscodes.systemfaltas;

import android.app.AlertDialog;
import android.content.Context;
import android.support.annotation.NonNull;
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
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                new AlertDialog.Builder(context).setMessage(day);
            }
        });
        TextView textView = findViewById(R.id.textMateria);
        textView.setText(((Dados)getApplication()).getSelectedMateria().getNome());
    }
}
