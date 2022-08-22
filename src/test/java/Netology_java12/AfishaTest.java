package Netology_java12;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {

    @Test
    public void addNew(){
        Afisha afisha = new Afisha();
        afisha.add("movie 1");
        afisha.add("movie 2");
        afisha.add("movie 3");

        String[] expect = afisha.findAll();
        String[] actual = {"movie 1", "movie 2", "movie 3"};
        Assertions.assertArrayEquals(expect, actual);
    }

    @Test
    public void findLast(){
        Afisha afisha = new Afisha(11);
        afisha.add("movie 1");
        afisha.add("movie 2");
        afisha.add("movie 3");
        afisha.add("movie 4");
        afisha.add("movie 5");
        afisha.add("movie 6");
        afisha.add("movie 7");
        afisha.add("movie 8");
        afisha.add("movie 9");
        afisha.add("movie 10");
        afisha.add("movie 11");

        String[] expect = afisha.findLast();
        String[] actual = {"movie 11", "movie 10", "movie 9", "movie 8", "movie 7", "movie 6", "movie 5", "movie 4", "movie 3", "movie 2", "movie 1"};
        Assertions.assertArrayEquals(expect, actual);
    }

    @Test
    public void findAllWithLimit(){
        Afisha afisha = new Afisha(11);
        afisha.add("movie 1");
        afisha.add("movie 2");
        afisha.add("movie 3");
        afisha.add("movie 4");
        afisha.add("movie 5");
        afisha.add("movie 6");
        afisha.add("movie 7");
        afisha.add("movie 8");
        afisha.add("movie 9");
        afisha.add("movie 10");
        afisha.add("movie 11");

        String[] expect = afisha.findAll();
        String[] actual = {"movie 1", "movie 2", "movie 3", "movie 4", "movie 5", "movie 6", "movie 7", "movie 8", "movie 9", "movie 10", "movie 11"};
        Assertions.assertArrayEquals(expect, actual);
    }

    @Test
    public void findAllWithoutLimit(){
        Afisha afisha = new Afisha();
        afisha.add("movie 1");
        afisha.add("movie 2");
        afisha.add("movie 3");
        afisha.add("movie 4");
        afisha.add("movie 5");
        afisha.add("movie 6");
        afisha.add("movie 7");
        afisha.add("movie 8");
        afisha.add("movie 9");
        afisha.add("movie 10");

        String[] expect = afisha.findAll();
        String[] actual = {"movie 1", "movie 2", "movie 3", "movie 4", "movie 5", "movie 6", "movie 7", "movie 8", "movie 9", "movie 10"};
        Assertions.assertArrayEquals(expect, actual);
    }

    @Test
    public void findAllIfQtyLessLimit(){
        Afisha afisha = new Afisha(14);
        afisha.add("movie 1");
        afisha.add("movie 2");
        afisha.add("movie 3");
        afisha.add("movie 4");
        afisha.add("movie 5");
        afisha.add("movie 6");
        afisha.add("movie 7");
        afisha.add("movie 8");
        afisha.add("movie 9");
        afisha.add("movie 10");

        String[] expect = afisha.findLast();
        String[] actual = {"movie 10", "movie 9", "movie 8", "movie 7", "movie 6", "movie 5", "movie 4", "movie 3", "movie 2", "movie 1"};
        Assertions.assertArrayEquals(expect, actual);
    }
}
