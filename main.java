import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

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
        System.out.println("Duração do filme: "+ lost.getTimeInMinutes());

    }
}
