package com.androidcss.jsonexample.model;

/**
 * Created by Rodrigo on 28/09/2016.
 */
public class Nota {
    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    private Double nota;
    private int unidade;
}
