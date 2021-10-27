package gredal.internetdatabasedemo.repositories;

import java.util.List;

public interface AbstractRepository<T> {
    List<T> getAll();
}
