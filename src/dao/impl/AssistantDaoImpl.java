package dao.impl;

import dao.AssistantDao;
import domain.Assistant;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.empty;

public class AssistantDaoImpl implements AssistantDao {

    private static AssistantDao instance;

    private AssistantDaoImpl() {

    }

    public static AssistantDao getInstance() {
        if (instance == null) {
            instance = new AssistantDaoImpl();
        }
        return instance;
    }

    @Override
    public Optional<Assistant> getByCategory(Integer category) {
        return empty();
    }

    @Override
    public Optional<Assistant> save(Assistant object) {
        return empty();
    }

    @Override
    public Optional<Assistant> update(Assistant object) {
        return empty();
    }

    @Override
    public Set<Assistant> getAll() {
        return new HashSet<>();
    }

    @Override
    public Optional<Assistant> getByName(String name) {
        return empty();
    }

    @Override
    public void delete(Assistant object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
