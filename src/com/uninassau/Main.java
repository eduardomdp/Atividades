package com.uninassau;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    final List<Professor> professores = new ArrayList<>();
    final List<Estudante> estudantes = new ArrayList<>();
    final List<Pessoa> pessoas = new ArrayList<>();
    criarEstudante(pessoas, estudantes);
    criarProfessor(pessoas, professores);

    for(Pessoa pessoa: pessoas){
        System.out.println(pessoa.toString());
    }

    System.out.println(listaCursos(professores, estudantes));

    }

    static private String listaCursos(List<Professor> professores, List<Estudante> estudantes){
        StringBuilder builder = new StringBuilder();
        for (Professor p: professores) {
            for(String curso: p.getCursos()){
                builder.append("\n");
                builder.append("***************************************");
                builder.append("\n");
                builder.append("Curso: ");
                builder.append(curso);
                builder.append("\n");
                builder.append("Professor: ");
                builder.append(p.getNome());
                builder.append("\n");
                builder.append("Alunos: ");
                for (Estudante e: estudantes) {
                    if(e.getCursos().contains(curso)){
                        builder.append("\n");
                        builder.append(e.getNome());
                    }
                }
            }

        }
        return builder.toString();
    }

    static private void criarEstudante(List<Pessoa> pessoas, List<Estudante> estudantes){
        Estudante estudante1 = new Estudante("Estudante 01","Endereco 01");
        estudante1.addCursoNota("A",9);
        estudante1.addCursoNota("B",7);
        estudante1.addCursoNota("C",5);
        estudante1.addCursoNota("D",10);
        Estudante estudante2 = new Estudante("Estudante 02","Endereco 02");
        estudante2.addCursoNota("A",8);
        estudante2.addCursoNota("B",9);
        Estudante estudante3 = new Estudante("Estudante 03","Endereco 03");
        estudante3.addCursoNota("C",9);
        estudante3.addCursoNota("D",10);

        pessoas.add(estudante1);
        pessoas.add(estudante2);
        pessoas.add(estudante3);
        estudantes.add(estudante1);
        estudantes.add(estudante2);
        estudantes.add(estudante3);
    }

    static private void criarProfessor(List<Pessoa> pessoas, List<Professor> professores ){
        Professor professor1 = new Professor("Professor 01","Endereco 01");
        professor1.addCurso("A");
        professor1.addCurso("B");
        Professor professor2 = new Professor("Professor 02","Endereco 02");
        professor2.addCurso("C");
        professor2.addCurso("D");

        pessoas.add(professor1);
        pessoas.add(professor2);

        professores.add(professor1);
        professores.add(professor2);
    }
}
