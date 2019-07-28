package dao.impl;

import dao.NurseDao;
import domain.Nurse;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.empty;

public class NurseDaoImpl implements NurseDao {

    private static NurseDao instance;

    private NurseDaoImpl() {

    }

    public static NurseDao getInstance() {
        if (instance == null) {
            instance = new NurseDaoImpl();
        }
        return instance;
    }

    @Override
    public Optional<Nurse> getByProfile(String profile) {
        return empty();
    }

    @Override
    public Optional<Nurse> save(Nurse object) {
        return empty();
    }

    @Override
    public Optional<Nurse> update(Nurse object) {
        return empty();
    }

    @Override
    public Set<Nurse> getAll() {
        return new HashSet<>();
    }

    @Override
    public Optional<Nurse> getByName(String name) {
        return empty();
    }

    @Override
    public void delete(Nurse object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
