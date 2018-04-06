package com.example.dscodes.systemfaltas.basics;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DsCodes on 05/04/2018.
 */

public class Dados extends Application {
    String nome;
    Long matricula;
    List<Materias> materias = new ArrayList<>();
    Materias selectedMateria;

    public Materias getSelectedMateria() {
        return selectedMateria;
    }

    public void setSelectedMateria(Materias selectedMateria) {
        this.selectedMateria = selectedMateria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public List<Materias> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materias> materias) {
        this.materias = materias;
    }
}
