package dao.impl;

import dao.PatientDao;
import domain.Patient;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.empty;

public class PatientDaoImpl implements PatientDao {

    private static PatientDao instance;

    private PatientDaoImpl() {

    }

    public static PatientDao getInstance() {
        if (instance == null) {
            instance = new PatientDaoImpl();
        }
        return instance;
    }

    @Override
    public Optional<Patient> getByDisease(String disease) {
        return empty();
    }

    @Override
    public Optional<Patient> save(Patient object) {
        return empty();
    }

    @Override
    public Optional<Patient> update(Patient object) {
        return empty();
    }

    @Override
    public Set<Patient> getAll() {
        return new HashSet<>();
    }

    @Override
    public Optional<Patient> getByName(String name) {
        return empty();
    }

    @Override
    public void delete(Patient object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
