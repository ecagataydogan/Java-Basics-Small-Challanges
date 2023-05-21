import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie mov = new Movie("Fast and furious");
        mov.watchMovie();

        Movie adventure = new Adventure("ADVENTURE FILM");
        adventure.watchMovie();

        Movie newMov = Movie.getMovie("ScienceFiction","StarWars");
        newMov.watchMovie();


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Type: ");
            String type = scanner.nextLine();
            if ("Qq".contains(type)) break;
            System.out.println("Title ");
            String title = scanner.nextLine();


            Movie userMov = Movie.getMovie(type,title);
            userMov.watchMovie();

        }
    }
}
