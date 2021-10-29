package gredal.internetdatabasedemo.repositories;

import java.util.List;

public interface AbstractRepository<T> {
    QueryResult create();
    List<T> read();
    QueryResult update();
    QueryResult delete();
}


