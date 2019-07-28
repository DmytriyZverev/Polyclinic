package dao.impl;

import dao.AidmanDao;
import domain.Aidman;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.empty;

public class AidmanDaoImpl implements AidmanDao{

    private static AidmanDao instance;

    private AidmanDaoImpl() {

    }

    public static AidmanDao getInstance() {
        if (instance == null) {
            instance = new AidmanDaoImpl();
        }
        return instance;
    }

    @Override
    public Optional<Aidman> getByIncrease(Integer increase) {
        return empty();
    }

    @Override
    public Optional<Aidman> save(Aidman object) {
        return empty();
    }

    @Override
    public Optional<Aidman> update(Aidman object) {
        return empty();
    }

    @Override
    public Set<Aidman> getAll() {
        return new HashSet<>();
    }

    @Override
    public Optional<Aidman> getByName(String name) {
        return empty();
    }

    @Override
    public void delete(Aidman object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
