import br.com.alura.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args){
        Movie myMovie = new Movie();
        myMovie.setName("O poderoso chefão");
        myMovie.setRealizeYear(1970);
        myMovie.setRealizeYear(180);

        myMovie.showDetais();
        myMovie.avalia(5);
        myMovie.avalia(5);
        myMovie.avalia(5);
        System.out.println("Total de avaliações: " + myMovie.getTotalOfRate());
        System.out.println(myMovie.pegaMedia());
    }
}
