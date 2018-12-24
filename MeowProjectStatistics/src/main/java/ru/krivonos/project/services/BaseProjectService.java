package ru.krivonos.project.services;

import ru.krivonos.project.interfaces.IBaseService;
import ru.krivonos.project.interfaces.IRepository;
import ru.krivonos.project.models.Project;

import java.util.List;

public class BaseProjectService implements IBaseService<Project> {

    private IRepository<Project> repository;

    public BaseProjectService(IRepository<Project> repository) {
        this.repository = repository;
    }


    @Override
    public Project getById(int id) {
        return repository.getById(id);
    }

    @Override
    public List<Project> getList() {
        return repository.getList();
    }

    @Override
    public void create(Project entity) {
        repository.create(entity);
    }

    @Override
    public void update(Project entity) {
        repository.update(entity);
    }

    @Override
    public void delete(Project entity) {
        repository.delete(entity);
    }
}
