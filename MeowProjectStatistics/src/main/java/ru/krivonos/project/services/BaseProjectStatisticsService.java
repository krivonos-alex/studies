package ru.krivonos.project.services;

import ru.krivonos.project.interfaces.IBaseService;
import ru.krivonos.project.interfaces.IRepository;
import ru.krivonos.project.models.ProjectStatistics;

import java.util.List;

public class BaseProjectStatisticsService implements IBaseService<ProjectStatistics> {

    private IRepository<ProjectStatistics> repository;

    public BaseProjectStatisticsService(IRepository<ProjectStatistics> repository)
    {
        this.repository = repository;
    }


    @Override
    public ProjectStatistics getById(int id) {
        return repository.getById(id);
    }

    @Override
    public List<ProjectStatistics> getList() {
        return repository.getList();
    }

    @Override
    public void create(ProjectStatistics entity) {
        repository.create(entity);
    }

    @Override
    public void update(ProjectStatistics entity) {
        repository.update(entity);
    }

    @Override
    public void delete(ProjectStatistics entity) {
        repository.delete(entity);
    }
}
