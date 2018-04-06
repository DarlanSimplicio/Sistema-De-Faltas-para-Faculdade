package com.example.dscodes.systemfaltas.basics;

/**
 * Created by DsCodes on 05/04/2018.
 */

public class Materias {
    String nome;
    int faltas;
    int aulas = 60/3;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getAulas() {
        return aulas;
    }

    public void setAulas(int aulas) {
        this.aulas = aulas;
    }

}
