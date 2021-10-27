package gredal.internetdatabasedemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

@Component
public class DatabaseService {
    private final Sql2o sql2o;

    @Autowired
    private DatabaseService(Environment environment) {
        this.sql2o = new Sql2o(
                environment.getProperty("spring.datasource.url"),
                environment.getProperty("spring.datasource.username"),
                environment.getProperty("spring.datasource.password")
        );
    }

    public Connection getConnection() {
        return sql2o.open();
    }
}
