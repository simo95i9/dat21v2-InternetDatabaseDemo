package gredal.internetdatabasedemo.services;

import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.Properties;

public class DatabaseService {
    private static DatabaseService databaseService;
    private final Sql2o sql2o;

    private DatabaseService() {
        Properties properties = PropertiesService.getProperties();
        this.sql2o = new Sql2o(
                properties.getProperty("spring.datasource.url"),
                properties.getProperty("spring.datasource.username"),
                properties.getProperty("spring.datasource.password")
        );
    }

    public static Connection getConnection() {
        if (databaseService == null) {
            databaseService = new DatabaseService();
        }
        return databaseService.sql2o.open();
    }
}
