package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Movie f){
//        tempoTotal += f.getTimeInMinutes();
//    }
//
//    public void inclui(Serie s ){
//        this.tempoTotal += s.getTimeInMinutes();
//    }

    //todos os filhos de titulo, passa nesse parenteses, polimorfismo,
    public void inclui(Titulo titulo){
        System.out.println("Add duração "+ titulo); //
        this.tempoTotal += titulo.getTimeInMinutes();
    }
}




