import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.models.Episodio;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Movie myMovie = new Movie();
        myMovie.setName("O poderoso chefão");
        myMovie.setRealizeYear(1970);
        myMovie.setTimeInMinutes(180);
        System.out.println("Duração do filme: "+ myMovie.getTimeInMinutes());

        myMovie.showDetais();
        myMovie.avalia(5);
        myMovie.avalia(5);
        myMovie.avalia(5);
        System.out.println("Total de avaliações: " + myMovie.getTotalOfRate());
        System.out.println(myMovie.pegaMedia());

        Serie lost = new Serie();
        lost.setName("Lost");
        lost.setRealizeYear(2000);
        lost.showDetais();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: "+ lost.getTimeInMinutes());

        Movie outroFilme = new Movie();
        outroFilme.setName("Avatar");
        outroFilme.setRealizeYear(2023);
        outroFilme.setTimeInMinutes(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(myMovie);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(myMovie);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Movie();
        filmeDoPaulo.setName("Dogville");
        filmeDoPaulo.setRealizeYear(2003);
        filmeDoPaulo.setTimeInMinutes(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Movie> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(myMovie);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getName());
    }
}
