package org.example.FilmListing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    @Test
    public void addNewMovie() {
        String mov1 = "Bloodshot";
        String mov2 = "Onward";
        String mov3 = "Hotel Belgrade";
        String mov4 = "Gentlemen";
        String mov5 = "The Invisible Man";
        String mov6 = "Trolls World Tour";
        String mov7 = "Number one";

        FilmManager manager = new FilmManager();
        manager.addNewMovie(mov1);
        manager.addNewMovie(mov2);
        manager.addNewMovie(mov3);

        String[] expected = {mov1, mov2, mov3};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {
        String mov1 = "Bloodshot";
        String mov2 = "Onward";
        String mov3 = "Hotel Belgrade";
        String mov4 = "Gentlemen";
        String mov5 = "The Invisible Man";
        String mov6 = "Trolls World Tour";
        String mov7 = "Number one";

        FilmManager manager = new FilmManager();
        manager.addNewMovie(mov1);
        manager.addNewMovie(mov2);
        manager.addNewMovie(mov3);
        manager.addNewMovie(mov4);
        manager.addNewMovie(mov5);
        manager.addNewMovie(mov6);
        manager.addNewMovie(mov7);

        String[] expected = {mov1, mov2, mov3, mov4, mov5, mov6, mov7};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastWhenBelowLimit() {

        String mov1 = "Bloodshot";
        String mov2 = "Onward";
        String mov3 = "Hotel Belgrade";
        String mov4 = "Gentlemen";
        String mov5 = "The Invisible Man";
        String mov6 = "Trolls World Tour";
        String mov7 = "Number one";

        FilmManager manager = new FilmManager();
        manager.addNewMovie(mov1);
        manager.addNewMovie(mov2);
        manager.addNewMovie(mov3);
        manager.addNewMovie(mov4);
        manager.addNewMovie(mov5);
        manager.addNewMovie(mov6);
        manager.addNewMovie(mov7);

        String[] expected = {mov7, mov6, mov5, mov4, mov3, mov2, mov1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void findLastWhenAboveLimit() {

        String mov1 = "Bloodshot";
        String mov2 = "Onward";
        String mov3 = "Hotel Belgrade";
        String mov4 = "Gentlemen";
        String mov5 = "The Invisible Man";
        String mov6 = "Trolls World Tour";
        String mov7 = "Number one";
        String mov8 = "Avengers";
        String mov9 = "Fat pizza";
        String mov10 = "What we do in the shadows";
        String mov11 = "Dune";
        String mov12 = "Three thousand years of longing";

        FilmManager manager = new FilmManager();
        manager.addNewMovie(mov1);
        manager.addNewMovie(mov2);
        manager.addNewMovie(mov3);
        manager.addNewMovie(mov4);
        manager.addNewMovie(mov5);
        manager.addNewMovie(mov6);
        manager.addNewMovie(mov7);
        manager.addNewMovie(mov8);
        manager.addNewMovie(mov9);
        manager.addNewMovie(mov10);
        manager.addNewMovie(mov11);
        manager.addNewMovie(mov12);

        String[] expected = {mov12, mov11, mov10, mov9, mov8, mov7, mov6, mov5, mov4, mov3};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}