package br.com.aplicativo.caracteristicas;

import java.util.Scanner;

public class Audio {
    private String nome;
    private double duracaoEmMinutos;
    private int anoDeLancamento;
    private int totalDeReproducoes = 0;
    private int totalCurtidas = 0;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void TotalDeReproducoes() {
        totalDeReproducoes++;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void TotalDeCurtidas(){
        totalCurtidas++;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }
}