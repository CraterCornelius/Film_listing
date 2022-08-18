package org.example.FilmListing;

public class FilmManager {

    //   String[] movies = {
    //           "Bloodshot",
    //           "Onward",
    //           "Hotel Belgrade",
    //           "Gentlemen",
    //           "The Invisible Man",
    //           "Trolls World Tour",
    //           "Number one"
    //   };

    public String[] movies = new String[0];
    public int limitations;

    public FilmManager() {
        limitations = 10;
    }

    public FilmManager(int limitations) {
        this.limitations = limitations;
    }

    public void addNewMovie(String newMovie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {

        int resultLength;
        if (movies.length > limitations) {
            resultLength = limitations;
        } else {
            resultLength = movies.length;
        }

        String[] lastOne = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            lastOne[i] = movies[movies.length - 1 - i];
        }
        return lastOne;
    }
}
