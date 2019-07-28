package dao.impl;

import dao.DoctorDao;
import domain.Doctor;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.empty;

public class DoctorDaoImpl implements DoctorDao {

    private static DoctorDao instance;

    private DoctorDaoImpl() {

    }

    public static DoctorDao getInstance() {
        if (instance == null) {
            instance = new DoctorDaoImpl();
        }
        return instance;
    }

    @Override
    public Optional<Doctor> getBySpecialty(String specialty) {
        return empty();
    }

    @Override
    public Optional<Doctor> save(Doctor object) {
        return empty();
    }

    @Override
    public Optional<Doctor> update(Doctor object) {
        return empty();
    }

    @Override
    public Set<Doctor> getAll() {
        return new HashSet<>();
    }

    @Override
    public Optional<Doctor> getByName(String name) {
        return empty();
    }

    @Override
    public void delete(Doctor object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
