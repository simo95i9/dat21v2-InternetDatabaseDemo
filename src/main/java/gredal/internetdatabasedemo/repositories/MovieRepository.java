package gredal.internetdatabasedemo.repositories;

import gredal.internetdatabasedemo.Entities.Movie;
import gredal.internetdatabasedemo.services.DatabaseService;
import org.sql2o.Connection;

import java.util.List;

public class MovieRepository implements AbstractRepository<Movie> {
    public MovieRepository() {

    }
    @Override
    public List<Movie> getAll() {
        try (Connection conn = DatabaseService.getConnection()) {
            String query = "SELECT * FROM movies";
            return conn.createQuery(query)
                    .setAutoDeriveColumnNames(true)
                    .executeAndFetch(Movie.class);
        }
    }
}
