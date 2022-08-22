package Netology_java12;
public class Afisha {
    private String[] movies = new String[0];
    private int limit;

    public Afisha(){
        limit = 10;
    }

    public Afisha(int limit){
        this.limit = limit;
    }

    public void add(String movie){
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll(){
        return movies;
    }

    public String[] findLast(){
        int lengthMovies;
        if (movies.length < limit){
            lengthMovies = movies.length;
        } else {
            lengthMovies = limit;
        }
        String[] tmp = new String[lengthMovies];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return  tmp;
    }

}
