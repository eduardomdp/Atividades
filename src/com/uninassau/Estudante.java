package com.uninassau;

import java.util.ArrayList;
import java.util.List;

public class Estudante extends Pessoa{

    private int numCursos;
    private List<String> cursos;
    private List<Integer> notas;


    public Estudante(String nome, String endereco) {
        super(nome, endereco);
        setTipo("Estudante");
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, endereço: %s, qtd cursos: %s, cursos: %s, notas: %s, media: %s", getNome(), getEndereco(), numCursos, cursos, notas, getNotaMedia());
    }
    public boolean addCursoNota(String curso, int nota){
        if(cursos == null){
            cursos = new ArrayList<>();
        }
        if(notas == null){
            notas = new ArrayList<>();
        }
        cursos.add(curso);
        notas.add(nota);
        numCursos += 1;
        return true;
    }

    public void imprimeNotas(){
        notas.stream().forEach(nota -> System.out.println(nota));
    }

    public double getNotaMedia(){
        double resultado = 0.0;
        int divisor = notas.size();

        for (int nota: notas) {
            resultado += nota;
        }

        resultado = resultado/divisor;

        return resultado < 0 ? 0 : resultado;
    }

    public List<String> getCursos() {
        return cursos;
    }

    public void setCursos(List<String> cursos) {
        this.cursos = cursos;
    }
}
