package gredal.internetdatabasedemo.repositories;

import gredal.internetdatabasedemo.entities.Movie;
import gredal.internetdatabasedemo.services.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.sql2o.Connection;

import java.util.List;

@Component
public class MovieRepository implements AbstractRepository<Movie> {
    private final DatabaseService databaseService;

    @Autowired
    private MovieRepository(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    @Override
    public List<Movie> getAll() {
        try (Connection conn = databaseService.getConnection()) {
            String query = "SELECT * FROM movies";
            return conn.createQuery(query)
                    .setAutoDeriveColumnNames(true)
                    .executeAndFetch(Movie.class);
        }
    }
}
