package gredal.internetdatabasedemo.repositories;

import gredal.internetdatabasedemo.entities.Movie;
import gredal.internetdatabasedemo.services.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;

import java.util.List;

@Repository
public class MovieRepository implements AbstractRepository<Movie> {

    private final DatabaseService databaseService;

    @Autowired
    private MovieRepository(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    @Override
    public QueryResult create() {
        return null;
    }

    @Override
    public List<Movie> read() {
        try (Connection conn = databaseService.getConnection()) {
            String query = "SELECT * FROM movies";
            return conn.createQuery(query)
                    .setAutoDeriveColumnNames(true)
                    .executeAndFetch(Movie.class);
        }
    }

    @Override
    public QueryResult update() {
        return null;
    }

    @Override
    public QueryResult delete() {
        return null;
    }
}
