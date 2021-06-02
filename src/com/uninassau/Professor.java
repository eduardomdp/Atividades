package com.uninassau;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa{

    private int numCursos;
    private List<String> cursos;

    public Professor(String nome, String endereco) {
        super(nome, endereco);
        setTipo("Professor");
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, endereço: %s, qtd cursos: %s, cursos: %s", getNome(), getEndereco(), numCursos, cursos);
    }

    public List<String> getCursos() {
        return cursos;
    }

    public boolean addCurso(String curso){
        if(cursos == null){
            cursos = new ArrayList<>();
        }
        cursos.add(curso);
        numCursos += 1;
        return true;
    }

    public boolean removeCurso(String curso){
        if(cursos == null){
            cursos = new ArrayList<>();
        }
        cursos.remove(curso);
        numCursos -= (numCursos == 0) ? 0 : 1;
        return true;
    }

}
