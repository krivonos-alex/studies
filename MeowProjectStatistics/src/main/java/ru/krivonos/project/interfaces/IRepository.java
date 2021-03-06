package ru.krivonos.project.interfaces;

import java.util.List;

public interface IRepository<T> {

    T getById(int id);

    List<T> getList();

    void create(T entity);

    void update(T entity);

    void delete(T entity);

}
