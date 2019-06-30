package dao.impl;

import dao.DoctorDao;
import domain.Doctor;

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
    public Doctor getBySpecialty(String specialty) {
        return null;
    }

    @Override
    public Doctor save(Object object) {
        return null;
    }

    @Override
    public Doctor update(Object object) {
        return null;
    }

    @Override
    public Doctor[] getAll() {
        return new Doctor[0];
    }

    @Override
    public Doctor getByName(String name) {
        return null;
    }

    @Override
    public void delete(Object object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
