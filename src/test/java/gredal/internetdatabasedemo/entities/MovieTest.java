package gredal.internetdatabasedemo.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {


    @Test
    void getTitle() {
        Movie movie = new Movie(
                1,
                "1986",
                "120",
                "Boy Who Could Fly, The",
                "Drama",
                "25",
                "No"
        );

        assertNotEquals("Boy Who Could Fly, The", movie.getTitle());
        assertEquals("The Boy Who Could Fly", movie.getTitle());
    }
}