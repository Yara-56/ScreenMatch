package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Movie extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int ) (pegaMedia() / 2);
    }
}

