import java.util.ArrayList;
import java.util.List;

class Movie {
    private String name;
    private float price;
    private int releasedOn;

    public Movie(String name, float price, int releasedOn) {
        setName(name);
        setPrice(price);
        setReleasedOn(name);
    }

    public int getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(int releasedOn) {
        this.releasedOn = releasedOn;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isBefore(int year) {
        return this.getReleasedOn() < year;
    }
}

public class Review {
    public static List<Movie> movies;

    public static void main(String[] args) {
        // Adding movies
        addMovies("Rocky", 5, 1976);

        removeMoviesBefore(Integer.parseInt(args[0]));

        printMovies();
    }

    public static String getMovieTitle(String movieName, int part) {
        switch (part) {
            case 0:
                movieName = movieName;
                break;
            case 1:
                movieName += " Part-1";
                break;
            case 2:
                movieName += " Part-2";
                break;
            case 3:
                movieName += " Part-3";
                break;
            case 4:
                movieName += " Part-4";
                break;
            case 5:
                movieName += " Part-5";
            case 6:
                movieName += " Part-6";
                break;
            case 7:
                movieName += " Part-7";
                break;
        }

        return movieName;
    }

    public static List addMovies(String name, int part, int releasedOn) {
        List<Movie> movies = new ArrayList<>();

        for (int i = 1; i < part; i++) {
            movies.add(new Movie(getMovieTitle(name, i), i * 2 + 5, releasedOn + 2));
        }

        return movies;
    }

    public static void printMovies() {
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " - " + movie.getReleasedOn());
        }
    }

    public static void removeMoviesBefore(int year) {
        for (Movie movie : movies) {
            if (movie.isBefore(1970)) {
                movies.remove(movie);
            }
        }
    }
}